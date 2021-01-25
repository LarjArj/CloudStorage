package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.Auth;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

public interface AuthMapper {

    @Insert("INSERT INTO CREDENTIALS (url, username, password, userID) " +
            "VALUES(#{url}, #{userName}, #{key}, #{password}, #{userID)")

    @Options(useGeneratedKeys = true, keyProperty = "credentialID")
    int insert(Auth credential);

    @Select("SELECT * FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    Auth getCredential(Integer credentialID);

    @Delete("DELETE FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    void deleteCredential(Integer credentialID);

    @Update("UPDATE CREDENTIALS SET url = #{url}, password = #{password}, username = #{newUserName} WHERE credentialID = #{credentialID}")
    void updateCredential(Integer credentialID, String newUserName, String url, String password);



}
