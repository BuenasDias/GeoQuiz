package com.example.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val valTextResId: Int, val answer: Boolean)
