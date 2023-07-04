package com.udemy.android.to_do_app.data.models

import androidx.compose.ui.graphics.Color
import com.udemy.android.to_do_app.ui.theme.HighPriorityColor
import com.udemy.android.to_do_app.ui.theme.LowPriorityColor
import com.udemy.android.to_do_app.ui.theme.MediumPriorityColor
import com.udemy.android.to_do_app.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}