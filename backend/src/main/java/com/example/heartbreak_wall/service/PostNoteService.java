package com.example.heartbreak_wall.service;

import com.example.heartbreak_wall.model.PostNotes;
import com.example.heartbreak_wall.repository.PostNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostNoteService {

    @Autowired
    private PostNoteRepository postNoteRepository;

    public List<PostNotes> getAllPostNotes(){
        return postNoteRepository.findAll();
    }

}
