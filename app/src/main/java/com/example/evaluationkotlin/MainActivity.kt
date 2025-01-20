package com.example.evaluationkotlin

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.evaluationkotlin.ui.theme.EvaluationKotlinTheme
import kotlin.reflect.KProperty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var displayText by remember { mutableStateOf("") }

            Column(modifier = Modifier.fillMaxSize().padding(top = 350.dp)) {
                DisplaySum(modifier = Modifier.padding(30.dp))

                Row(modifier = Modifier.padding(top = 16.dp)) {
                    ButtonPad1(onClick = {  })
                    ButtonPad2(onClick = {  })
                    ButtonPad3(onClick = {  })
                    ButtonPadPlus(onClick = {  })

                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad4(onClick = {  })
                    ButtonPad5(onClick = {  })
                    ButtonPad6(onClick = {  })
                    ButtonPadMinus(onClick = {  })
                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad7(onClick = {  })
                    ButtonPad8(onClick = {  })
                    ButtonPad9(onClick = {  })
                    ButtonPadMultiplication(onClick = {  })
                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad0(onClick = {  })
                    ButtonPadDot(onClick = {  })
                    ButtonPadDel(onClick = {  })
                    ButtonPadDivision(onClick = {  })
                }
            }
            }
        }
    }

    @Composable
    fun DisplaySum(modifier: Modifier){

    }

    // First Row

    @Composable
    fun ButtonPad1(onClick: () -> Unit = { var displayText = "1" }) {
        Button(onClick = { onClick() }) {
            Text("1")
        }
    }

    @Composable
    fun ButtonPad2(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("2")
        }
    }

    @Composable
    fun ButtonPad3(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("3")
        }
    }

    @Composable
    fun ButtonPadPlus(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("+")
        }
    }

    //Second Row
    @Composable
    fun ButtonPad4(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("4")
        }
    }

    @Composable
    fun ButtonPad5(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("5")
        }
    }

    @Composable
    fun ButtonPad6(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("6")
        }
    }
    @Composable
    fun ButtonPadMinus(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("-")
        }
    }

    // Third Row
    @Composable
    fun ButtonPad7(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("7")
        }
    }

    @Composable
    fun ButtonPad8(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("8")
        }
    }

    @Composable
    fun ButtonPad9(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("9")
        }
    }

    @Composable
    fun ButtonPadMultiplication(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("x")
        }
    }

    //Forth Row
    @Composable
    fun ButtonPad0(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("0")
        }
    }

    @Composable
    fun ButtonPadDot(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text(".")
        }
    }

    @Composable
    fun ButtonPadDel(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("Del")
        }
    }

    @Composable
    fun ButtonPadDivision(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text("÷")
        }
    }

