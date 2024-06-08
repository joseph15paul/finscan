package com.example.finscan

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finscan.ui.theme.FinscanTheme

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinscanTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp)) { innerPadding ->
                    Row{
                        Column {
                            TextCustom(
                                name = "Login",
                                modifier = Modifier.padding(innerPadding)
                            )
                            Button(onClick = { cash() }, Modifier.padding(40.dp)) {
                                Text(text = "Cash")
                            }
                        }
                        Column {
                            TextCustom(
                                name = "Login",
                                modifier = Modifier.padding(innerPadding)
                            )
                            Button(onClick = { cash() }, Modifier.padding(40.dp)) {
                                Text(text = "Cash")
                            }
                        }
                    }
                }
            }
        }
    }

    fun cash(){
        val myIntent: Intent = Intent(
            this,
            cash::class.java
        )
        myIntent.putExtra("key", R.attr.value) //Optional parameters
        this.startActivity(myIntent)
    }

}

@Composable
fun TextCustom(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun endButton(name: String, modifier: Modifier = Modifier){
    Button(onClick = { }, modifier = modifier) {
        Text(text = name.uppercase())
    }
}
