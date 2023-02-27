package com.example.noteapp.feature_note.presentation.util

sealed class Screen(val route:String) {
    object NotesScreen:Screen("note_screen")
    object AddEditNoteScreen:Screen("add_edit_note_screen")
}
