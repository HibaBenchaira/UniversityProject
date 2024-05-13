package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Note;
import com.emsi.projectspring.services.NoteService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @RequestMapping("/createNote")
    public String createNote() {
        return "CreateNote";
    }

    @RequestMapping("/saveNote")
    public String saveNote(@ModelAttribute("noteVue") Note noteController) {
        Note savedNote = noteService.saveNote(noteController);
        return "CreateNote";
    }

    @RequestMapping("/notesList")
    public String notesList(ModelMap modelMap) {
        List<Note> notesController = noteService.getAllNotes();
        modelMap.addAttribute("notesVue", notesController);
        return "notesList";
    }

    @RequestMapping("/deleteNote")
    public String deleteNote(@RequestParam("id") Long id, ModelMap modelMap) {
        noteService.deleteNoteById(id);
        return "redirect:/notesList";
    }

    @RequestMapping("/editNote")
    public String editNote(@RequestParam("id") Long id, ModelMap modelMap) {
        Note noteController = noteService.getNoteById(id);
        modelMap.addAttribute("noteView", noteController);
        return "EditNote";
    }

    @RequestMapping("/updateNote")
    public String updateNote(@ModelAttribute("noteVue") Note noteController) {
        noteService.updateNote(noteController);
        return "redirect:/createNote";
    }
}
