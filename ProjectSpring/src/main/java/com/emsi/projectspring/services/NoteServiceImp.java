package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Note;
import com.emsi.projectspring.repositories.DossierRepository;
import com.emsi.projectspring.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImp implements NoteService{
    private NoteRepository noteRepository;
    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void deleteAllNotes() {
        noteRepository.deleteAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
