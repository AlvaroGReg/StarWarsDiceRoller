package es.lernesto.starwarsdices.model.dices_data


import android.content.res.Resources
import es.lernesto.starwarsdices.R
import es.lernesto.starwarsdices.model.DiceModel

object DicesData  {

    val dices: List<DiceModel> = listOf(

        DiceModel(
            R.drawable.ability_dice_8f,
            name = "Ability"
        ),
        DiceModel(
            R.drawable.boost_dice_6f,
            name = "Boost"
        ),
        DiceModel(
            R.drawable.challenging_dice_12f,
            name = "Challenge"
        ),
        DiceModel(
            R.drawable.diff_dice_8f,
            name = "Difficulty"
        ),
        DiceModel(
            R.drawable.profiency_dice_12f,
            name = "Proficiency"
        ),
        DiceModel(
            R.drawable.setback_dice_6f,
            name = "Set back"
        ),
        DiceModel(
            R.drawable.force_dice_12f,
            name = "Force"
        )
    )

}