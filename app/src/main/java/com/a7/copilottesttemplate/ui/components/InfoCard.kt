package com.a7.copilottesttemplate.ui.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun InfoCard(title: String, description: String) {
    Card {
        Text(text = title)
        Text(text = description)
    }
}
