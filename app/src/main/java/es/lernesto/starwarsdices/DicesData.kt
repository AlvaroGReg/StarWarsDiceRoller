package es.lernesto.starwarsdices

object DicesData  {

    val dices: List<DiceModel> = listOf(

        DiceModel(
            R.drawable.ability_dice_8f,
            name = "Ability Dice",
            faces = 8
        ),
        DiceModel(
            R.drawable.boost_dice_6f,
            name = "Boost Dice",
            faces = 6
        ),
        DiceModel(
            R.drawable.challenging_dice_12f,
            name = "Challenging Dice",
            faces = 12
        ),
        DiceModel(
            R.drawable.diff_dice_8f,
            name = "Difficult Dice",
            faces = 8
        ),
        DiceModel(
            R.drawable.profiency_dice_12f,
            name = "Proficiency Dice",
            faces = 12
        ),
        DiceModel(
            R.drawable.setback_dice_6f,
            name = "Set Back Dice",
            faces = 6
        ),
        DiceModel(
            R.drawable.force_dice_12f,
            name = "Force Dice",
            faces = 12
        ))
}