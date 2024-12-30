package com.example.heartbreak_wall.service;

import com.example.heartbreak_wall.model.PostNote;
import com.example.heartbreak_wall.repository.PostNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostNoteService {

    @Autowired
    private PostNoteRepository postNoteRepository;

    public List<PostNote> getAllPostNotes(){
        return postNoteRepository.findAll();
    }

    public PostNote createPostNote(PostNote postNote){
        return postNoteRepository.save(postNote);
    }

    public void deletePostNote(Long id) {
        postNoteRepository.deleteById(id);
    }


}
