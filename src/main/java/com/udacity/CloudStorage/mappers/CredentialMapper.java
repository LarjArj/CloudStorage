package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.UserCredential;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CredentialMapper {

    @Insert("INSERT INTO CREDENTIALS (url, username, password, userID) " +
            "VALUES(#{url}, #{userName}, #{key}, #{password}, #{userID)")

    @Options(useGeneratedKeys = true, keyProperty = "credentialID")
    int insert(UserCredential credential);

    @Select("SELECT * FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    UserCredential getCredential(Integer credentialID);

    @Select("SELECT * FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    UserCredential[] getAllCredentials(Integer credentialID);

    @Delete("DELETE FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    void deleteCredential(Integer credentialID);

    @Update("UPDATE CREDENTIALS SET url = #{url}, password = #{password}, username = #{newUserName} WHERE credentialID = #{credentialID}")
    void updateCredential(Integer credentialID, String newUserName, String url, String password);



}
