package com.udacity.CloudStorage.services;

import com.udacity.CloudStorage.models.Note;
import com.udacity.CloudStorage.mappers.NoteMapper;
import com.udacity.CloudStorage.mappers.UserMapper;
import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.models.File;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private final UserMapper userMapper;
    private final NoteMapper noteMapper;


    public NoteService(UserMapper userMapper, NoteMapper noteMapper){
        this.userMapper = userMapper;
        this.noteMapper=noteMapper;
    }

    public void addNote(String username,String title,String description){
        User userToFind = userMapper.getUser(username);
        Integer userID = userToFind.getUserID();
        Note note = new Note(0,title,description,userID);
        noteMapper.insert(note);
    }

    public Note getNote(Integer noteID){
        return noteMapper.getNote(noteID);
    }

    public Note[] getAllNotes(Integer userID){
        return noteMapper.getUserNotes(userID);
    }

    public void updateNote(Integer noteID, String title,String description){
        noteMapper.updateNote(title,description,noteID);
    }

    public void deleteNote(Integer noteID){
        noteMapper.deleteNote(noteID);
    }


}
