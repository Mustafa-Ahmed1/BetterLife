package com.karrar.betterlife.util.states

sealed class DialogClickEvent {
    object OnDialogClick : DialogClickEvent()
    object OnDialogFailedAddHabit : DialogClickEvent()
    object OnHabitUpdateClick : DialogClickEvent()
    object OnHabitAddClick : DialogClickEvent()
}