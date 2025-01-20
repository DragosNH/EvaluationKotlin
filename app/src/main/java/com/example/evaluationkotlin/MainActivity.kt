package com.example.evaluationkotlin

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

            Column(modifier = Modifier.fillMaxSize()
            ) {

                DisplaySum(modifier = Modifier.padding(50.dp), displayText = displayText)

                Row(modifier = Modifier.padding(top = 16.dp)) {
                    ButtonPadAC(onClick = {  })
                    ButtonPadModulo(onClick = { displayText += "%" })
                    ButtonPadEqual(onClick = { displayText += "=" })
                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad1(onClick = { displayText += "1" })
                    ButtonPad2(onClick = { displayText += "2" })
                    ButtonPad3(onClick = { displayText += "3" })
                    ButtonPadPlus(onClick = { displayText += "+"; })

                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad4(onClick = { displayText += "4" })
                    ButtonPad5(onClick = { displayText += "5" })
                    ButtonPad6(onClick = { displayText += "6" })
                    ButtonPadMinus(onClick = { displayText += "-" })
                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad7(onClick = { displayText += "7" })
                    ButtonPad8(onClick = { displayText += "8" })
                    ButtonPad9(onClick = { displayText += "9" })
                    ButtonPadMultiplication(onClick = { displayText += "x" })
                }
                Row(modifier = Modifier.padding()) {
                    ButtonPad0(onClick = { displayText += "0" })
                    ButtonPadDot(onClick = { displayText += "." })
                    ButtonPadDel(onClick = {  })
                    ButtonPadDivision(onClick = { displayText += "÷" })
                }
            }
            }
        }
    }

    @Composable
    fun DisplaySum(modifier: Modifier = Modifier, displayText: String) {
        Text(
            text = displayText,
            fontSize = 45.sp,
            modifier = modifier
        )
    }

    //First Row
    @Composable
    fun ButtonPadModulo(onClick: () -> Unit = { var displayText = "1" }) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("%")
        }
    }

    @Composable
    fun ButtonPadAC(onClick: () -> Unit = { var displayText = "1" }) {
        Button(onClick = { onClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue)) {
            Text("AC")
        }
    }

    @Composable
    fun ButtonPadEqual(onClick: () -> Unit = { var displayText = "1" }) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("=")
        }
    }

    // Second Row
    @Composable
    fun ButtonPad1(onClick: () -> Unit = { var displayText = "1" }) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("1")
        }
    }

    @Composable
    fun ButtonPad2(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("2")
        }
    }

    @Composable
    fun ButtonPad3(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("3")
        }
    }

    @Composable
    fun ButtonPadPlus(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("+")
        }
    }

    //Third Row
    @Composable
    fun ButtonPad4(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("4")
        }
    }

    @Composable
    fun ButtonPad5(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("5")
        }
    }

    @Composable
    fun ButtonPad6(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("6")
        }
    }
    @Composable
    fun ButtonPadMinus(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("-")
        }
    }

    // Fourth Row
    @Composable
    fun ButtonPad7(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("7")
        }
    }

    @Composable
    fun ButtonPad8(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("8")
        }
    }

    @Composable
    fun ButtonPad9(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("9")
        }
    }

    @Composable
    fun ButtonPadMultiplication(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("x")
        }
    }

    //Fifth Row
    @Composable
    fun ButtonPad0(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("0")
        }
    }

    @Composable
    fun ButtonPadDot(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text(".")
        }
    }

    @Composable
    fun ButtonPadDel(onClick: () -> Unit) {
        Button(onClick = { onClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red)) {
            Text("Del")
        }
    }

    @Composable
    fun ButtonPadDivision(onClick: () -> Unit) {
        Button(onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            )) {
            Text("÷")
        }
    }

