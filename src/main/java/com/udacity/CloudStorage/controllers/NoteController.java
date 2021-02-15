package com.udacity.CloudStorage.controllers;


import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.models.Note;


import com.udacity.CloudStorage.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;


    @GetMapping("/notes/delete")
    public String deleteNote(@RequestParam("id") int noteid) {
        if (noteid > 0) {
            noteService.deleteNote(noteid);
            return "redirect:/result?success";
        }
        return "redirect:/result?error";
    }


    @PostMapping("/notes")
    public String createOrUpdateNote(Authentication authentication, Note note) {
        User currentUser = (User) authentication.getPrincipal();
        if (note.getNoteID() > 0) {
            //noteService.updateNote(note);
        } else {
            //noteService.addNote(note, currentUser.getUserID());
        }
        return "redirect:/result?success";
    }







}
