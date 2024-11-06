package com.example.alarmchallenge.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.alarmchallenge.core.domain.models.Alarm

@Composable
fun AlarmItem(alarm: Alarm) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = alarm.title)
            Text(text = alarm.time)
            Text(text = "${alarm.hoursUntil} hours missing till alarm is activated")
        }
        Switch(
            checked = alarm.isEnabled,
            onCheckedChange = { /* handle enable/disable alarm */ }
        )
    }
}
