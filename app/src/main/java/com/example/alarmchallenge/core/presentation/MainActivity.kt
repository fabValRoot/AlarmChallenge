package com.example.alarmchallenge.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.alarmchallenge.core.theme.AlarmChallengeTheme
import com.example.alarmchallenge.core.util.Routes
import com.example.alarmchallenge.detail.presentation.DetailScreen
import com.example.alarmchallenge.home.presentation.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlarmChallengeTheme {
                HomeNav()
            }
        }
    }
}

@Composable
fun HomeNav(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH_SCREEN
    ) {

        composable(Routes.SPLASH_SCREEN) {
            SplashScreen(navController)
        }

        composable(Routes.HOME_SCREEN) {
            HomeScreen(
                navController,
                alarms = listOf()
            )
        }

        composable(Routes.DETAIL_SCREEN) {
            DetailScreen(
                navController,
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlarmChallengeTheme {
        Greeting("Android")
    }
}
