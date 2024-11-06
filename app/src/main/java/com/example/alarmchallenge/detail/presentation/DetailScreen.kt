package com.example.alarmchallenge.detail.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController) {
    var alarmName by remember { mutableStateOf("") }
    var selectedTime by remember { mutableStateOf("12:00 AM") } // Default time

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TextField(
            value = alarmName,
            onValueChange = { alarmName = it },
            label = { Text("Alarm Name") },
            modifier = Modifier.fillMaxWidth()
        )

        TimePicker(selectedTime = selectedTime, onTimeChange = { selectedTime = it })

        Button(
            onClick = {  },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Save Alarm")
        }
    }
}

@Composable
fun TimePicker(selectedTime: String, onTimeChange: (String) -> Unit) {

    Text(text = "Selected Time: $selectedTime")
}
