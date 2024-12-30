package com.example.heartbreak_wall.controller;

import com.example.heartbreak_wall.model.PostNote;
import com.example.heartbreak_wall.service.PostNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post-notes")
public class PostNoteController {

    @Autowired
    private PostNoteService postNoteService;

    @GetMapping
    public List<PostNote> getAllPostNotes(){
        return postNoteService.getAllPostNotes();
    }

    @PostMapping
    public PostNote createPostNote(@RequestBody PostNote postNote) {
        return postNoteService.createPostNote(postNote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostNote(@PathVariable Long id) {
        postNoteService.deletePostNote(id);
        return ResponseEntity.ok("Post-note deleted successfully");
    }
}
