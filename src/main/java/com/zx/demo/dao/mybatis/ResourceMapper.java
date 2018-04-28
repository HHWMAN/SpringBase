package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.Resource;
import com.zx.demo.domain.mybatis.ResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    long countByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int deleteByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int deleteByPrimaryKey(String resource_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int insertSelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    List<Resource> selectByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    Resource selectByPrimaryKey(String resource_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbg.generated Sat Feb 24 14:39:01 CST 2018
     */
    int updateByPrimaryKey(Resource record);
}