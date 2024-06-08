package com.example.finscan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.finscan.ui.theme.FinscanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinscanTheme(darkTheme = true) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        LeftButtons()
                        RightButtons()
                    }
                }
            }
        }
    }

            @Composable
            fun LeftButtons() {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                       ,
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    repeat(5) {
                        StartButton(name = "Button ${it + 1}")
                    }
                }
            }

            @Composable
            fun RightButtons() {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        ,
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    repeat(5) {
                        StartButton(name = "Button ${it + 6}")
                    }
                }
            }
            @Composable
            fun StartButton(name: String) {
                Button(
                    onClick = {
                        // Handle button click here
                    },
                    modifier = Modifier
                        .size(120.dp) // Set the size of the button
                        .padding(8.dp), // Add padding around the button
                    shape = MaterialTheme.shapes.medium, // Set the button shape to square
                ) {
                    Text(text = name)
                }
            }
        }




