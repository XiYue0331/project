package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Mapper
public interface UserDAO {

    @Select(value = "SELECT * FROM User")
    List<User> getAllUser();

    //查询User表中是否员工名字为name
    @Select(value = "SELECT COUNT(name) FROM (SELECT name FROM User WHERE name = #{name} ) as a")
    int selectName(String name);

    @Insert(value = "INSERT INTO User(user.`uid`,user.`name`,user.identity,user.'salary')\n" +
            "VALUE(#{uid},#{name},#{identity},#{salary})")
    int insert(User user);

    @Update(value = "UPDATE User SET User.salary = #{salary} WHERE user.uid = #{uid}")
    int updateSalary(Integer uid,int salary);

    @Delete(value = "DELETE FROM User WHERE uid= #{uid}")
    int deleteUser(Integer uid);


}
