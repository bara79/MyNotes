package ru.home.myapplication.ui.note

import ru.home.myapplication.data.entity.Note
import ru.home.myapplication.ui.base.BaseViewState

class NoteViewState(data: Data = Data(), error: Throwable? = null) : BaseViewState<NoteViewState.Data>(data, error) {
    data class Data(val isDeleted: Boolean = false, val note: Note? = null)
}