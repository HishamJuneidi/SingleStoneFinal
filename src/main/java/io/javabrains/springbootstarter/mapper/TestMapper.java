package io.javabrains.springbootstarter.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
    @Select("select test_msg from test where id=#{id}")
    public String getMsgById (@Param("id") int id);
}
