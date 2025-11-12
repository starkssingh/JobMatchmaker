package com.jobmatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppSurface {
                Greeting("JobMatchmaker")
            }
        }
    }
}

@Composable
fun AppSurface(content: @Composable () -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        content()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome, $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppSurface { Greeting("JobMatchmaker") }
}
