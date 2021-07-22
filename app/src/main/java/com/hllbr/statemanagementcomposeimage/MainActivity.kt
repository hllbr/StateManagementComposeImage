package com.hllbr.statemanagementcomposeimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hllbr.statemanagementcomposeimage.ui.theme.StateManagementComposeImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    androidx.compose.material.Surface(color = Color.DarkGray) {
        Column(modifier = Modifier.fillMaxSize()
            ,verticalArrangement = Arrangement.Center
            ,horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello!",color = Color.White
                ,fontSize = 26.sp
                ,fontStyle = FontStyle.Normal)

            Spacer(modifier = Modifier.padding(7.dp))
            Button(onClick = {
                println("Buton Clicked")
            }) {
                /*
                Butonlar içersinede bir composable yerleştirilebilir.
                Butonlar içerisine birden fazla composable yerleştirilebilir.
                 */
                Text(text = "Button / ")
                Spacer(modifier = Modifier.padding(7.dp))
                Text(text = "Button Test")
            }
            Spacer(modifier = Modifier.padding(7.dp))
            /*
            Image(painter bir resim çizebiliriz bir çizici oluşturabilir bir rengi işleyebiliriz.)
            Çok kullanışlı bir yapısı yok Swing arayüz geliştime gibi biraz ağır ve metası zor gelir. :/
            Image(Bitmap yüksek oranda bunu kullanebiliriz.Bitmap öğerlerini ifade ederken basarken tercih edilebilir.)
            Image(Vector R.drawable.xxx gibi image vector olarak eklediğimiz drawable içersinde kullanabildiğimiz görseller için tercih edilebilir.)

             */
            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.batman)
                , contentDescription = "BATMAN")
            Spacer(modifier = Modifier.padding(7.dp))
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground)
                , contentDescription = null)
            Spacer(modifier = Modifier.padding(7.dp))

            Image(painter = ColorPainter(Color.Magenta)
                ,contentDescription = null
                ,modifier = Modifier.size(20.dp,20.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
    /*
    State and Jetpack Composable =

     */
}