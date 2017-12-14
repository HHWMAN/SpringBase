package com.zx.demo.security.rest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import org.springframework.stereotype.Service;

@Service
public class JsonWebTokenService {

    private String restJwtSecret=TextCodec.BASE64.encode("zx");

/*    public JsonWebTokenService(String restJwtSecret) {
        this.restJwtSecret = TextCodec.BASE64.encode(restJwtSecret);
    }*/

    public String[] getUsernameAndTypeFromToken(String token) {
        String[] result= new String[2];
        try {
            Claims body = Jwts.parser().setSigningKey(restJwtSecret).parseClaimsJws(token).getBody();
            result[0] = body.getSubject();
            result[1] = body.get("type", String.class);
        } catch (Exception e) {
            result[0] = null;
            result[1] = null;
        }
        return result;
    }

    public String generateToken(String userid, String userType) {
        return Jwts.builder().setSubject(userid).claim("type", userType)
                .signWith(SignatureAlgorithm.HS256, restJwtSecret).compact();
    }

        public static void main(String[] args) {
            String secret = TextCodec.BASE64.encode("abc123");
        String token4CustomeriOS = Jwts.builder().setSubject("IOS_CUSTOMER").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4CustomerAndroid = Jwts.builder().setSubject("ANDROID_CUSTOMER").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4BeauticianiOS = Jwts.builder().setSubject("IOS_BEAUTICIAN").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4BeauticianAndroid = Jwts.builder().setSubject("ANDROID_BEAUTICIAN").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4ShopkeeperiOS = Jwts.builder().setSubject("IOS_SHOPKEEPER").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4ShopkeeperAndroid = Jwts.builder().setSubject("ANDROID_SHOPKEEPER").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        String token4Html5 = Jwts.builder().setSubject("HTML5").claim("type", "n")
                .signWith(SignatureAlgorithm.HS256, secret).compact();

        System.out.println(token4CustomeriOS);
        System.out.println(token4CustomerAndroid);
        System.out.println(token4BeauticianiOS);
        System.out.println(token4BeauticianAndroid);
        System.out.println(token4ShopkeeperiOS);
        System.out.println(token4ShopkeeperAndroid);
        System.out.println(token4Html5);
    }

}