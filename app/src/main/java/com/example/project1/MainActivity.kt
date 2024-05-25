package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.project1.restio.EngineeringRestioScreen
import com.example.project1.ui.theme.Project1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project1Theme {
//                MyPageMainScreen()
//                MyInfoConfirmScreen()
//                MyInfoEditScreen()
                EngineeringRestioScreen()
            }
        }
    }
}