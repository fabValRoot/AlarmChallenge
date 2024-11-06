package com.example.alarmchallenge.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.alarmchallenge.core.domain.models.Alarm
import com.example.alarmchallenge.core.util.Routes

@Composable
fun HomeScreen(navController: NavController, alarms: List<Alarm>) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(Routes.DETAIL_SCREEN) },
                Modifier.background(MaterialTheme.colorScheme.primary)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add Alarm")
            }
        }
    ) {
       LazyColumn(contentPadding = it) {
           items(alarms.size) {
               alarm -> AlarmItem(alarms[alarm])
           }
       }
    }
}


