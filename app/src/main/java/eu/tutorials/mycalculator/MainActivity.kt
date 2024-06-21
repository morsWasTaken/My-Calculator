package eu.tutorials.mycalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.tutorials.mycalculator.ui.theme.MyCalculatorTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyCalculator()
                }
            }
        }
    }
}

@Composable
fun MyCalculator(){

    var display by remember { mutableStateOf("")}
    var num = remember { mutableStateListOf<Double>(0.00,0.00)}
    var toggle by remember { mutableStateOf(false)} //toggle off means value is written on number1 else on number2
    var counter by remember { mutableStateOf(0) }
    var operator by remember { mutableStateOf("") }

    //Display Screen
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
            .padding(5.dp)
            .border(2.dp, Color.Black)
            ) {
            Text(text = display, fontSize = 50.sp, lineHeight = 60.sp)

        }

        //Column of Buttons

            Row (modifier = Modifier.padding(8.dp)){
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp), onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "7"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "7")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "8"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "8")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "9"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "9")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    operator = "/"
                    counter = 1
                    toggle = true
                }) {
                    Text(text = "/")
                }
            }

            Row (modifier = Modifier.padding(8.dp)) {
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "4"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "4")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "5"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "5")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "6"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "6")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    operator = "*"
                    counter = 1
                    toggle = true
                }) {
                    Text(text = "*")
                }
            }

            Row (modifier = Modifier.padding(8.dp)){
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "1"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "1")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "2"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "2")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "3"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "3")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    operator = "-"
                    counter = 1
                    toggle = true
                }) {
                    Text(text = "-")
                }
            }

            Row (modifier = Modifier.padding(8.dp)){
                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    toggle = false
                    counter = 0
                    num[0] = 0.00
                    num[1] = 0.00
                    operator = ""
                    display = ""

                }) {
                    Text(text = "C")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    if(toggle){
                        display = ""
                        toggle = false
                    }
                    display += "0"
                    num[counter] = display.toDouble()
                }) {
                    Text(text = "0")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    when(operator){
                        "/" -> {if(num[1]!= 0.00){
                            display = (num[0] / num[1]).toString()} else if (num[1] == 0.00){display = "Division with zero"}
                        }

                        "*" -> display = (num[0] * num[1]).toString()
                        "-" -> display = (num[0] - num[1]).toString()
                        "+" -> display = (num[0] + num[1]).toString()
                    }
                    //display = num[0].toString()
                    num[0] = 0.00
                    num[1] = 0.00
                    counter = 0
                    operator = ""
                    toggle = true

                }) {
                    Text(text = "=")
                }
                Spacer(modifier = Modifier.width(10.dp))

                Button(modifier = Modifier
                    .weight(1f)
                    .height(50.dp) ,onClick = {
                    operator = "+"
                    counter = 1
                    toggle = true
                }) {
                    Text(text = "+")
                }
            }

        }
    }


