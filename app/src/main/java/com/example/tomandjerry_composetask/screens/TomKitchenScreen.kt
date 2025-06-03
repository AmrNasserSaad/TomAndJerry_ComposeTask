package com.example.tomandjerry_composetask.screens

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry_composetask.R
import com.example.tomandjerry_composetask.ui.theme.ColorScreenBackground
import com.example.tomandjerry_composetask.ui.theme.IBMPlexSansArabic

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TomKitchenScreen() {
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) { _ ->
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(ColorScreenBackground)
                    .padding(top = 40.dp, bottom = 120.dp)

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                    //.height(200.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.tomkitchen),
                        contentDescription = "Jerry Store Logo",
                        modifier = Modifier
                            .fillMaxSize()
                            .height(400.dp),
                        contentScale = ContentScale.FillWidth
                    )
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 24.dp, top = 52.dp),
                            verticalArrangement = Arrangement.spacedBy(20.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.elements1),
                                    contentDescription = "Jerry Store Logo",
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = "High tension",
                                    style = TextStyle(
                                        fontSize = 19.sp,
                                        lineHeight = 16.sp,
                                        fontFamily = IBMPlexSansArabic,
                                        fontWeight = FontWeight(500),
                                        color = Color(0xDEFFFFFF),
                                        textAlign = TextAlign.Center,
                                        letterSpacing = 0.9.sp,
                                    ),
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.dicon),
                                    contentDescription = "Jerry Store Logo",
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = "Shocking foods",
                                    style = TextStyle(
                                        fontSize = 19.sp,
                                        lineHeight = 16.sp,
                                        fontFamily = IBMPlexSansArabic,
                                        fontWeight = FontWeight(500),
                                        color = Color(0xDEFFFFFF),
                                        textAlign = TextAlign.Center,
                                        letterSpacing = 1.2.sp,
                                    ),
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                        }
                    }

                }
                Box(
                    modifier = Modifier.padding(top = 210.dp)
                ) {
                    RoundedCol()
                }

                Box(
                    Modifier
                        .fillMaxSize()
                        .offset(x = (-12).dp, y = 28.dp),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Image(
                        painter = painterResource(R.drawable.plate),
                        contentDescription = "Jerry Store Logo",
                        modifier = Modifier
                            .width(272.dp)
                            .height(210.dp)
                    )
                }


            }
        }

    }

}

@Composable
private fun RoundedCol() {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
            .background(Color(0xFFEEF4F6))
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
    ) {

        Text(
            text = "Electric Tom pasta",
            style = TextStyle(
                fontSize = 26.sp,
                lineHeight = 16.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight(500),
                color = Color(0xDE1F1F1E),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier.padding(top = 38.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color(0xFFD0E5F0))
                    .width(110.dp)
                    .height(34.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_money_bag),
                        contentDescription = "Cheese Bag",
                        tint = Color(0xFF035789),
                        modifier = Modifier
                            .size(18.dp)
                            .padding(start = 1.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = " 5 cheeses ",
                        color = Color(0xFF035789),
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                    )
                }
            }
            Icon(
                painter = painterResource(id = R.drawable.huartvector),
                contentDescription = "Tom Image",
                tint = Color(0xFF226B97),
                modifier = Modifier
                    .size(28.dp)
                    .offset(x = 0.dp, y = (-24).dp),
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Pasta cooked with a charger cable and \nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 24.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0x99121212),
                letterSpacing = 0.5.sp,
            )
        )

        Spacer(modifier = Modifier.height(36.dp))
        Text(
            text = "Details",
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 16.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xDE1F1F1E),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )

        Spacer(modifier = Modifier.height(11.dp))

        DetailsRow()

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Preparation method",
            style = TextStyle(
                fontSize = 23.sp,
                lineHeight = 16.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xDE1F1F1E),
                letterSpacing = 0.5.sp,
            )
        )

        Spacer(modifier = Modifier.height(13.dp))

        PreparationMethod()

    }
}

@Composable
fun BottomBar() {
    Box(
        modifier = Modifier
            .border(width = 1.dp, color = Color(0x1F1F1F1E))
            .fillMaxWidth()
            .height(110.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(start = 16.dp, top = 15.dp, end = 16.dp, bottom = 15.dp)
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(68.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF226992),
                contentColor = Color.White
            ),
            onClick = {}
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Add to cart",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 16.sp,
                        fontFamily = FontFamily(Font(R.font.ibmplexsansarabic_medium)),
                        fontWeight = FontWeight(500),
                        color = Color(0xDEFFFFFF),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.5.sp,
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(6.dp)
                        .background(color = Color(0x61FFFFFF))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "3 cheeses",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.ibmplexsansarabic_medium)),
                            color = Color(0xFFFFFFFF),
                        ),

                        )
                    Text(
                        text = "5 cheeses",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.ibmplexsansarabic_medium)),
                            color = Color(0xFFCFE4EE),
                            textDecoration = TextDecoration.LineThrough,
                        )
                    )
                }

            }

        }
    }

}


@Composable
@Preview(showBackground = true)
private fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}


@Composable
fun DetailsRow() {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(modifier = Modifier.weight(1f)) {
            DetailCard(
                icon = R.drawable.elements2,
                value = "1000 V",
                label = "Temperature"
            )
        }
        Box(modifier = Modifier.weight(1f)) {
            DetailCard(
                icon = R.drawable.jcon,
                value = "3 sparks",
                label = "Time"
            )
        }

        Box(modifier = Modifier.weight(1f)) {
            DetailCard(
                icon = R.drawable.gncon,
                value = "1M 12K",
                label = "No. of deaths"
            )
        }

    }
}


@Composable
fun DetailCard(
    @DrawableRes icon: Int,
    value: String,
    label: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(132.dp)
            .background(color = Color(0xFFD0E5F0), shape = RoundedCornerShape(size = 12.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = value,
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 16.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0x99121212),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )

        Text(
            text = label,
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0x5E121212),
                textAlign = TextAlign.Center,
            )
        )
    }
}


@Composable
fun PreparationMethod() {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            MethodStepRow(
                number = "1",
                text = "Put the pasta in a toaster.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            MethodStepRow(
                number = "2",
                text = "Pour battery juice over it.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            MethodStepRow(
                number = "3",
                text = "Wait for the spark to ignite.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            MethodStepRow(
                number = "4",
                text = "Serve with an insulating glove.",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Composable
fun MethodStepRow(
    number: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .height(40.dp)
            .background(
                Color.White,
                RoundedCornerShape(
                    topEnd = 16.dp,
                    bottomEnd = 16.dp,
                    topStart = 45.dp,
                    bottomStart = 45.dp
                )
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFFD0E5F0),
                    shape = CircleShape
                )
                .size(44.dp)
//                .background(
//                    color = Color(0xFFFFFFFF),
//                    shape = CircleShape
//                )
            // .padding(top = 10.dp, bottom = 10.dp)
            ,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF035587),
                    textAlign = TextAlign.Center,
                )
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = TextStyle(
                fontSize = 17.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Normal,
                color = Color(0x99121212),
                textAlign = TextAlign.Center,
            )
        )
    }
}