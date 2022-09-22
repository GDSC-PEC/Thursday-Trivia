package com.example.thursdaytrivia

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursdaytrivia.ui.theme.ThrusdayTriviaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThrusdayTriviaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Week3Trivia()
                }
            }
        }
    }
}

@Composable
fun Week3Trivia() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hands),
            contentDescription = "Hands",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Score", fontSize = 30.sp)
            Text(text = "0 / 4", fontSize = 50.sp)
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "You chose", fontSize = 16.sp)
                Text(text = "Rock", fontSize = 32.sp)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Android chose", fontSize = 16.sp)
                Text(text = "Paper", fontSize = 32.sp)
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            val context = LocalContext.current
            Button(
                onClick = {
                    Toast.makeText(context,"Yo",Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(100.dp)
            ) {
                Text(text = "Rock")
            }
            Button(
                onClick = {
                    Toast.makeText(context,"Yo",Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(100.dp)
            ) {
                Text(text = "Paper")
            }
            Button(
                onClick = {
                    Toast.makeText(context,"Yo",Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(100.dp)
            ) {
                Text(text = "Scissors")
            }
        }
        Text(
            text = "#JetpackCompose",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth().padding(bottom = 30.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Week3TriviaPreview() {
    ThrusdayTriviaTheme {
        Week3Trivia()
    }
}