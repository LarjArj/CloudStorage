package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {


    @Select("SELECT * FROM USERS WHERE username = #{username}")
    User getUser(String username);

    @Select("SELECT * FROM USERS WHERE userID = #{userID}")
    User getUserById(Integer userID);

    @Insert("INSERT INTO USERS (username, password,salt, firstName, lastName) VALUES(#{username}, #{password}, #{salt}, #{firstName}, #{lastName})")

    @Options(useGeneratedKeys = true, keyProperty = "userID")
    int insert(User user);

}
