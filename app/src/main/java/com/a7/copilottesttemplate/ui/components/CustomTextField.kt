package com.a7.copilottesttemplate.ui.components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun CustomTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value = value, onValueChange = onValueChange)
}
