package com.example.a0days_newcode.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    medium = RoundedCornerShape(
        topStart = 15.dp,
        topEnd = 50.dp,
        bottomStart = 50.dp,
        bottomEnd = 15.dp
    ),
    small = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(16.dp)
)