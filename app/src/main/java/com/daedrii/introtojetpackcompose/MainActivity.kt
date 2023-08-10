package com.daedrii.introtojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daedrii.introtojetpackcompose.ui.theme.IntroToJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroToJetpackComposeTheme {
                PrimeiraTela()
                OutraTela()
            }
        }
    }

    @Composable
    fun PrimeiraTela(){

        var count by remember {
            mutableStateOf(0)
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Hello Jetpack Compose",
                fontSize = 32.sp,

            )

            Text(
                text = count.toString(),
                fontSize = 32.sp
            )

            Button(onClick = {
                count++
            }) {
                Text(
                    text = "Clique em mim",
                    fontSize = 21.sp
                )
            }

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PrimeiraTelaPreview(){
        PrimeiraTela()
        OutraTela()
    }
}