package com.example.alarmchallenge.core.domain.models

data class Alarm(
    val title: String,
    val time: String,
    val hoursUntil: Int,
    val isEnabled: Boolean
)
