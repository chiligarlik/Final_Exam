package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int,
    @StringRes val hobbeis: Int,
    @StringRes val hobeis: Int,
    @StringRes val hobbei: Int
)

val dogs = listOf(
    Dog(R.drawable.chest, R.string.name1, R.string.description1,R.string.description11,R.string.description12,R.string.none),
    Dog(R.drawable.triceps, R.string.name2, R.string.description2,R.string.description22,R.string.none, R.string.none),
    Dog(R.drawable.delts, R.string.name3, R.string.description3,R.string.none, R.string.none,R.string.none),
    Dog(R.drawable.abs, R.string.name4, R.string.description4,R.string.description44,R.string.none, R.string.none),
    Dog(R.drawable.back, R.string.name5, R.string.description5,R.string.description55,R.string.description56,R.string.description57),
    Dog(R.drawable.bicep, R.string.name6, R.string.description6,R.string.description67,R.string.none, R.string.none),
    Dog(R.drawable.legs, R.string.name7, R.string.description7,R.string.description77,R.string.description78,R.string.description79),
    Dog(R.drawable.shoulder, R.string.name8, R.string.description8,R.string.description88,R.string.none, R.string.none),
    Dog(R.drawable.arms, R.string.name9, R.string.description9,R.string.description99,R.string.none, R.string.none)
)
