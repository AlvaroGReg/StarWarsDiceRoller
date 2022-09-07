package es.lernesto.starwarsdices

import androidx.annotation.DrawableRes

class DiceModel (
    @DrawableRes val imageResourceId : Int,
    @DiceName val name : String,
    @NumFaces val faces : Int
)
annotation class NumFaces
annotation class DiceName

