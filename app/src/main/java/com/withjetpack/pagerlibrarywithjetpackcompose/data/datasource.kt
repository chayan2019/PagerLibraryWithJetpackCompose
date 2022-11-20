package com.withjetpack.pagerlibrarywithjetpackcompose.data

import androidx.annotation.DrawableRes
import com.withjetpack.pagerlibrarywithjetpackcompose.R

data class Pager(
    @DrawableRes val image: Int,
    val desc: String
)

val dataList = listOf(
    Pager(R.drawable.image, "PAGE ONE"),
    Pager(R.drawable.images, "PAGE TWO"),
    Pager(R.drawable.image, "PAGE THREE"),
)
