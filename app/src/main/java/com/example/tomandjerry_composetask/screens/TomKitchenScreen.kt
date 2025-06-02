package com.example.tomandjerry_composetask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry_composetask.R
import com.example.tomandjerry_composetask.ui.theme.ColorScreenBackground

@Composable
fun TomKitchenScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorScreenBackground)
            .padding(top = 48.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(162.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.wditchen),
                contentDescription = "Jerry Store Logo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth
            )
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_filter),
                            contentDescription = "Jerry Store Logo",
                            modifier = Modifier.size(21.dp)
                        )
                        Text("High tension", color = Color.White)
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_filter),
                            contentDescription = "Jerry Store Logo",
                            modifier = Modifier.size(21.dp)
                        )
                        Text("High tension", color = Color.White)
                    }
                }
            }

            Box(
                Modifier
                    .fillMaxSize()
                    .offset(x = -12.dp, y = 24.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.plate),
                    contentDescription = "Jerry Store Logo",
                    modifier = Modifier
                        .width(240.dp)
                        .height(240.dp)
                )
            }
        }

    }
}


@Composable
@Preview(showBackground = true)
private fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}