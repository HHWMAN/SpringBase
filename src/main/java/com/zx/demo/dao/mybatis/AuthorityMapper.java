package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.Authority;
import com.zx.demo.domain.mybatis.AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    long countByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int deleteByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int deleteByPrimaryKey(String authority_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int insert(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int insertSelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    List<Authority> selectByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    Authority selectByPrimaryKey(String authority_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int updateByPrimaryKeySelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Thu Dec 14 15:15:56 CST 2017
     */
    int updateByPrimaryKey(Authority record);
}