package ru.home.myapplication.extensions

import android.content.Context
import androidx.core.content.ContextCompat
import ru.home.myapplication.R
import ru.home.myapplication.data.entity.Note

inline fun Note.Color.getColorInt(context: Context) = ContextCompat.getColor(context, getColorRes())

inline fun Note.Color.getColorRes() = when (this) {
    Note.Color.WHITE -> R.color.white
    Note.Color.VIOLET -> R.color.violet
    Note.Color.YELLOW -> R.color.yellow
    Note.Color.RED -> R.color.red
    Note.Color.PINK -> R.color.pink
    Note.Color.GREEN -> R.color.green
}