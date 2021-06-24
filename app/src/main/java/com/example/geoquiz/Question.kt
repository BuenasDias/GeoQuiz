package com.example.geoquiz

import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

data class Question(@StringRes val textResId: Int, val answer: Boolean)
