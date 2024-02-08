package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPresentacion("Android")
                }
            }
        }
    }
}
@Composable
fun GreetingPresentacion(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD4ECD4)) // Color hexadecimal #d4ecd4
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 200.dp)
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.android_logo_png27),
                    contentDescription = "Android Logo",
                    modifier = Modifier.size(100.dp) // Define el tamaño deseado para la imagen
                )

                Text(
                    text = "Uziel Hernandez",
                    style = MaterialTheme.typography.headlineLarge, // Utiliza h1 para un título grande
                    textAlign = TextAlign.Center,
                    color = Color.Black, // Cambia Color.Black al color deseado

                )
                Text(
                    text = "Android Developer Extraordinaire",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color =  Color(0xFF006400)
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp)
            .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center)
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.baseline_add_ic_call_24),
                        contentDescription = "Android Icon",
                        modifier = Modifier.padding(end = 20.dp, bottom = 9.dp)


                    )

                }
                Row {
                    Image(
                        painter = painterResource(R.drawable.baseline_share_24),
                        contentDescription = "Android Icon",
                        modifier = Modifier.padding(end = 20.dp, bottom = 9.dp)
                    )

                }
                Row {
                    Image(
                        painter = painterResource(R.drawable.baseline_attach_email_24),
                        contentDescription = "Android Icon",
                        modifier = Modifier.padding(end = 20.dp, bottom = 9.dp)

                    )
                }
            }
            Column {
                Text(
                    text = "+52 463 101 7144",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF006400)
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 9.dp)
                )
                Text(
                    text = "@AndroidDev",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF006400)
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 9.dp)
                )
                Text(
                    text = "42100701@uaz.edu.mx",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF006400)
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 9.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        GreetingPresentacion("Android")
    }
}