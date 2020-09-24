package ru.home.myapplication.data.provider

import androidx.lifecycle.LiveData
import ru.home.myapplication.data.entity.Note
import ru.home.myapplication.data.entity.User
import ru.home.myapplication.data.model.NoteResult

interface DataProvider {
    fun getCurrentUser(): LiveData<User?>
    fun subscribeToAllNotes() : LiveData<NoteResult>
    fun saveNote(note: Note) : LiveData<NoteResult>
    fun getNoteById(id: String) : LiveData<NoteResult>
    fun deleteNote(id: String) : LiveData<NoteResult>
}