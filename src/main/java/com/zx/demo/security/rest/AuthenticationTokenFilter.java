package com.zx.demo.security.rest;



import com.zx.demo.security.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class AuthenticationTokenFilter extends UsernamePasswordAuthenticationFilter {

    private String restJwtHeader;

    //private Logger log = LoggerFactory.getLogger(AuthenticationTokenFilter.class);

    @Autowired
    JsonWebTokenService jsonWebTokenService;

    public void setJsonWebTokenService(JsonWebTokenService jsonWebTokenService) {
        this.jsonWebTokenService = jsonWebTokenService;
    }

    @Autowired
    private AppUserDetailsService platMobileUserDetailsService;

    public AuthenticationTokenFilter(String restJwtHeader, JsonWebTokenService jsonWebTokenService,
                                     AppUserDetailsService platMobileUserDetailsService) {
        super();
        this.restJwtHeader = restJwtHeader;
        this.jsonWebTokenService = jsonWebTokenService;
        this.platMobileUserDetailsService = platMobileUserDetailsService;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String authToken=null;
        try {
            authToken = httpRequest.getHeader(restJwtHeader);
        }catch (Exception e){
          System.out.println("空指针");
        }

        if (authToken != null) {
            String[] result = this.jsonWebTokenService.getUsernameAndTypeFromToken(authToken);
            if (result.length >= 2) {
                String userid = result[0];
                String userType = result[1];
                if (userid != null && userType != null
                        && SecurityContextHolder.getContext().getAuthentication() == null) {

                    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
                    authorities.add(new SimpleGrantedAuthority(userType));

                    //  PlatUserInSession userDetails = new PlatUserInSession(-1, username, username, -1, authorities, true, true);
                    UserDetails userDetails=platMobileUserDetailsService.loadUserByUsername(userid);
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpRequest));
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        chain.doFilter(request, response);
    }

}