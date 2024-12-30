package com.example.heartbreak_wall.repository;

import com.example.heartbreak_wall.model.PostNotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostNoteRepository extends JpaRepository<PostNotes, Long> {
}
