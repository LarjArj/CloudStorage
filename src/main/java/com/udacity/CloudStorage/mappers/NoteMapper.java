package com.udacity.CloudStorage.mappers;
import com.udacity.CloudStorage.models.Note;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface NoteMapper {

    //noteId, String title, String description, int userID)
    @Insert("INSERT INTO NOTES (userID, title, description) " +
            "VALUES(#{userID}, #{title}, #{description})")
    @Options(useGeneratedKeys = true, keyProperty = "noteID")
    int insert(Note note);

    @Select("SELECT * FROM NOTES")
    Note[] getUserNotes();

    @Select("SELECT * FROM NOTES WHERE noteID = #{noteID}")
    Note getNote(Integer noteID);

    @Delete("DELETE FROM NOTES WHERE noteID = #{noteID}")
    void deleteNote(Integer noteID);

    @Update("UPDATE NOTES SET title = #{title}, description = #{description} WHERE noteID = #{noteID}")
    void updateNote(String title, String description,Integer noteID);



}
