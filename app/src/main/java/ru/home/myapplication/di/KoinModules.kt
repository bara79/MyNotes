package ru.home.myapplication.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import ru.home.myapplication.data.NotesRepository
import ru.home.myapplication.data.provider.DataProvider
import ru.home.myapplication.data.provider.FirestoreProvider
import ru.home.myapplication.ui.main.MainViewModel
import ru.home.myapplication.ui.note.NoteViewModel
import ru.home.myapplication.ui.splash.SplashViewModel

val appModule = module {
    single { FirebaseAuth.getInstance() }
    single { FirebaseFirestore.getInstance() }
    single<DataProvider> { FirestoreProvider(get(), get()) }
    single { NotesRepository(get()) }
}

val splashModule = module {
    viewModel { SplashViewModel(get()) }
}

val mainModule = module {
    viewModel { MainViewModel(get()) }
}

val noteModule = module {
    viewModel { NoteViewModel(get()) }
}