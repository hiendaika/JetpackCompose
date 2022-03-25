package com.example.myfirstcompose

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcompose.ui.theme.MyFirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MyFirstComposeTheme {
            // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }

//            }
            Column {
                Greeting("Android")
                Greeting("Java")
                Greeting("iOS")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        fontFamily = FontFamily.Monospace,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Yellow)
            .border(2.dp, color = Color.Red)
            .padding(10.dp)
//            .fillMaxWidth(0.5f) //fraction
//            .fillMaxHeight(0.3f)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeTheme {
//        Row(
//            modifier = Modifier
//                .background(Color.Cyan)
//                .fillMaxSize(),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.Bottom
//        ) {
//            Greeting("Android")
//            Greeting("Java")
//            Greeting("iOS")
////            Greeting("Python")
//        }

        // Box layout
//        BoxExample()
//        BoxExample2()
//        BoxExample3()

        //Button cho cac button hien thi chnh giua
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
//            TextButtonDemo()
//            OutlinedButtonDemo()
//            IconButtonDemo()
            ButtonDemo()
        }
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .background(color = Color.Red)
            .size(200.dp, 200.dp)
    ) {
        //Add them box
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(100.dp, 100.dp)
                .align(Alignment.TopEnd)

        )
        //Add them text
        Text(
            text = "Hello",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .background(color = Color.Cyan)
                .size(90.dp, 60.dp)
                .align(Alignment.BottomCenter)
        )
    }
}


@Composable
fun BoxExample2() {
    Box(modifier = Modifier.background(color = Color.White)) {
        Text(
            text = "TopStart",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(5.dp)
                .align(Alignment.TopStart),
            color = Color.White,
            fontSize = 20.sp,
        )

        Text(
            text = "TopCenter",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.TopCenter),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "TopEnd",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.TopEnd),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "CenterStart",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.CenterStart),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "Center",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.Center),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "CenterEnd",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.CenterEnd),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "BottomStart",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.BottomStart),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "BottomCenter",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.BottomCenter),
            color = Color.White,
            fontSize = 20.sp
        )

        Text(
            text = "BottomEnd",
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .align(Alignment.BottomEnd),
            color = Color.White,
            fontSize = 20.sp
        )
    }
}

@Composable
fun BoxExample3() {
    Box(modifier = Modifier.background(color = Color.White)) {
        //Image
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background"
        )

        //Add Text
        Text(
            modifier = Modifier
                .background(color = Color.Cyan)
                .padding(10.dp)
//                .border(1.dp, Color.Cyan, RectangleShape)
                .align(Alignment.BottomStart),
            text = "Bello Horizonte",
            color = Color.Red,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
        )

        //Add button
        Button(
            onClick = {
            },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.Red,
                contentColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .border(1.dp, Color.DarkGray, RectangleShape)
        ) {
            Text(text = "Click here")
        }
    }
}

@Composable
fun TextButtonDemo() {
    val context = LocalContext.current
    TextButton(
        onClick = {
            Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
        },
        enabled = false //disable button
    ) {
        Text(text = "Click here")
    }
}

@Composable
fun OutlinedButtonDemo() {
    val context = LocalContext.current
    OutlinedButton(onClick = {
        Toast.makeText(context, "Click Outlined Button", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Outlined Button")
    }
}

@Composable
fun IconButtonDemo() {
    val context = LocalContext.current
    IconButton(onClick = {
        Toast.makeText(context, "IconButton", Toast.LENGTH_SHORT).show()
    }) {
        Icon(
            Icons.Filled.Refresh,
            contentDescription = "Refresh button",
            tint = Color.DarkGray,
            modifier = Modifier.size(80.dp)
        )
    }
}

@Composable
fun ButtonDemo() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Standard Button", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Standard")
    }

    Button(onClick = {
        Toast.makeText(context, "Disable Button", Toast.LENGTH_SHORT).show()
    }, enabled = false) {
        Text(text = "Disabled")
    }

    TextButton(onClick = {
        Toast.makeText(context, "Click TextButton", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Text Button")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context, "Click Outlined", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Outlined")
    }

    IconButton(onClick = {
        Toast.makeText(context, "Click Icon Button", Toast.LENGTH_SHORT).show()
    }) {
        Icon(
            Icons.Filled.Refresh, contentDescription = "Refresh",
            tint = Color.DarkGray,
            modifier = Modifier.size(80.dp)
        )
    }
}

