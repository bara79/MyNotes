package ru.home.myapplication.ui.main

import ru.home.myapplication.data.entity.Note
import ru.home.myapplication.ui.base.BaseViewState


class MainViewState(val notes: List<Note>? = null, error: Throwable? = null) : BaseViewState<List<Note>?>(notes, error)