package com.example.android_71

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_71.ui.theme.Android71Theme
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android71Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "",
                        modifier = Modifier.padding(innerPadding),

                    )

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)

                    ) {
                        val truc : List<String> = listOf("Autigéographiquement" ,"J'ai Bu" ,"Comment Debord","Darlène" ,"La nuit Est Une Panthère" ,"Jaune")
                        items(truc){ element ->
                          Text(
                              text = element,
                              modifier = Modifier.height(150.dp)
                          )

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name!",
        modifier = modifier,

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android71Theme {
        Greeting("Android")
    }
}