package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.File;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FileMapper {


    @Insert("INSERT INTO FILES (fileName, fileType, fileSize, userID, fileContent) " +
            "VALUES(#{fileName}, #{fileType}, #{fileSize}, #{userID}, #{fileContent})")

    @Options(useGeneratedKeys = true, keyProperty = "fileID")
    int insert(File file);

    @Select("SELECT * FROM FILES WHERE filename = #{fileName}")
    File getFile(String fileName);

    @Select("SELECT filename FROM FILES WHERE userID = #{userID}")
    File[] getAllFiles(Integer userID);

    @Select("SELECT * FROM FILES WHERE fileID = #{fileID}")
    File getFileBYID(Integer fileID);

    @Delete("DELETE FROM FILES WHERE fileName = #{fileName}")
    void delete(String fileName);


}
