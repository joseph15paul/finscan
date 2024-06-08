package com.example.finscan

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finscan.ui.theme.FinscanTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinscanTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp)) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    startButton(name = "login", Modifier.padding(100.dp))
                    startButton(name = "guest", Modifier.padding(150.dp))

                }
            }
        }
    }



    fun startLoginActivity(){
        val myIntent: Intent = Intent(
            this,
            LoginActivity::class.java
        )
        myIntent.putExtra("key", value) //Optional parameters
        this.startActivity(myIntent)
    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }


    @Composable
    fun startButton(name: String, modifier: Modifier = Modifier){
        Button(onClick = {
            startLoginActivity()
        }, modifier = modifier) {
            Text(text = name.uppercase())
        }
    }
}
