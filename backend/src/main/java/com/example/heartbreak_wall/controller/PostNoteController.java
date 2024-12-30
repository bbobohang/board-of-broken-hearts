package com.example.heartbreak_wall.controller;

import com.example.heartbreak_wall.model.PostNotes;
import com.example.heartbreak_wall.service.PostNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post-notes")
public class PostNoteController {

    @Autowired
    private PostNoteService postNoteService;

    @GetMapping
    public List<PostNotes> getAllPostNotes(){
        return postNoteService.getAllPostNotes();
    }
}
