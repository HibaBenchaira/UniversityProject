package com.emsi.projectspring.services;


import com.emsi.projectspring.entities.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {
    Note saveNote(Note note);
    Note updateNote(Note note);
    void deleteNoteById(Long id);
    void deleteAllNotes();
    Note getNoteById(Long id);
    List<Note> getAllNotes();
}
