package es.lernesto.starwarsdices.model

import es.lernesto.starwarsdices.R

object DicesData  {

    val dices: List<DiceModel> = listOf(

        DiceModel(
            R.drawable.ability_dice_8f,
            name = "Ability",
            faces = 8,
        ),
        DiceModel(
            R.drawable.boost_dice_6f,
            name = "Boost",
            faces = 6
        ),
        DiceModel(
            R.drawable.challenging_dice_12f,
            name = "Challenging",
            faces = 12
        ),
        DiceModel(
            R.drawable.diff_dice_8f,
            name = "Difficult",
            faces = 8
        ),
        DiceModel(
            R.drawable.profiency_dice_12f,
            name = "Proficiency",
            faces = 12
        ),
        DiceModel(
            R.drawable.setback_dice_6f,
            name = "Set Back",
            faces = 6
        ),
        DiceModel(
            R.drawable.force_dice_12f,
            name = "Force",
            faces = 12
        )
    )

}