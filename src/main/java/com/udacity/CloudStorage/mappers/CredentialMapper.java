package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.userCredential;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CredentialMapper {

    @Insert("INSERT INTO CREDENTIALS (url, username, password, userID) " +
            "VALUES(#{url}, #{userName}, #{key}, #{password}, #{userID)")

    @Options(useGeneratedKeys = true, keyProperty = "credentialID")
    int insert(userCredential credential);

    @Select("SELECT * FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    userCredential getCredential(Integer credentialID);

    @Select("SELECT * FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    userCredential [] getAllCredentials(Integer credentialID);

    @Delete("DELETE FROM CREDENTIALS WHERE credentialID = #{credentialID}")
    void deleteCredential(Integer credentialID);

    @Update("UPDATE CREDENTIALS SET url = #{url}, password = #{password}, username = #{newUserName} WHERE credentialID = #{credentialID}")
    void updateCredential(Integer credentialID, String newUserName, String url, String password);



}
