package ru.home.myapplication.ui.splash

import ru.home.myapplication.data.NotesRepository
import ru.home.myapplication.data.errors.NoAuthException
import ru.home.myapplication.ui.base.BaseViewModel

class SplashViewModel(val notesRepository: NotesRepository) : BaseViewModel<Boolean?, SplashViewState>() {

    fun requestUser(){
        notesRepository.getCurrentUser().observeForever {
            viewStateLiveData.value = if(it != null){
                SplashViewState(authenticated = true)
            } else {
                SplashViewState(error = NoAuthException())
            }
        }
    }

}