package com.example.composeui

import LightBuildScreen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composeui.screen.PreviewFoodLoginScreen
import com.example.composeui.screen.PreviewInstagramProfilBuildScreen
import com.example.composeui.screen.PreviewWeatherCard
import com.example.composeui.screen.WeatherCard
import com.example.composeui.screen.WeatherItem

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent{PreviewFoodLoginScreen()}
    }
}