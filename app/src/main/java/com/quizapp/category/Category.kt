package com.quizapp.category

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(
    val categorySrc: Int,
    val categoryTitle : String
): Parcelable