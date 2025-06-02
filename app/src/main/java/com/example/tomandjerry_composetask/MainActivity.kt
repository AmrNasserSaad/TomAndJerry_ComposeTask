package com.example.tomandjerry_composetask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tomandjerry_composetask.screens.JerryStoreScreen
import com.example.tomandjerry_composetask.screens.TomKitchenScreen
import com.example.tomandjerry_composetask.ui.theme.TomAndJerry_ComposeTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomAndJerry_ComposeTaskTheme {
                JerryStoreScreen()
                //TomKitchenScreen()
            }
        }
    }
}
