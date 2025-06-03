package com.example.tomandjerry_composetask.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry_composetask.R
import com.example.tomandjerry_composetask.ui.theme.IBMPlexSansArabic

@Composable
fun TomAccountScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F8F8))
            .padding(top = 40.dp, bottom = 24.dp)

    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.owdt),
                contentDescription = "Jerry Store Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                contentScale = ContentScale.FillWidth
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                TomProfile()
            }

        }

        Box(modifier = Modifier.padding(top = 202.dp)) {
            RoundedColTomAccount()

        }

    }
}

@Composable
private fun TomProfile() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.imddg),
            contentDescription = "Tom Account Logo",
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0x261F1F1E),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .size(78.dp),
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Tom",
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 23.4.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFFFFFFF),
            )
        )
        Text(
            text = "specializes in failure!",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 21.6.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Normal,
                color = Color(0xCCFFFFFF),
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .width(124.dp)
                .height(30.dp)
                .background(color = Color(0x1FFFFFFF), shape = RoundedCornerShape(size = 40.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Edit foolishness",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    letterSpacing = 0.2.sp,
                )
            )
        }

    }
}


@Composable
fun RoundedColTomAccount() {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
            .background(Color(0xFFEEF4F6))
            .fillMaxSize()
            .padding(bottom = 24.dp, top = 24.dp),
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            TomCardsGrid()
            Spacer(modifier = Modifier.height(24.dp))
            TomSettings()
            Spacer(modifier = Modifier.height(12.dp))
        }

        Box(
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Color(0x14001A1F))
        )
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            HisFavoriteFoods()
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "v.TomBeta",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    color = Color(0x99121212),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }


    }

}


@Composable
@Preview(showBackground = true)
private fun TomAccountScreenPreview() {
    TomAccountScreen()
}

@Composable
private fun TomCardsGrid() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    img = R.drawable.container,
                    text1 = "2M 12K",
                    text2 = "No. of quarrels",
                    color = Color(0xFFD0E5F0)
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    img = R.drawable.cvontainer,
                    text1 = "+500 h",
                    text2 = "Chase time",
                    color = Color(0xFFDEEECD)
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    img = R.drawable.ddntainer,
                    text1 = "2M 12K",
                    text2 = "Hunting times",
                    color = Color(0xFFF2D9E7)
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    img = R.drawable.ssntainer,
                    text1 = "3M 7K",
                    text2 = "Heartbroken",
                    color = Color(0xFFFAEDCF),
                )
            }
        }
    }
}

@Composable
private fun TomCards(
    @DrawableRes img: Int,
    text1: String,
    text2: String,
    color: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(
                color = color
            ),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Image(
            painter = painterResource(img),
            contentDescription = "Jerry Store Logo",
            modifier = Modifier
                .size(62.dp)
                .padding(start = 12.dp),
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = text1,
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0x99121212),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.5.sp,
                )
            )
            Text(
                text = text2,
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0x5E121212),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}


@Composable
fun TomSettings() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Tom settings",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = IBMPlexSansArabic,
                color = Color(0xDE1F1F1E),
                letterSpacing = 0.1.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        val items = listOf(
            TomSettingsItem(
                icon = R.drawable.bedsingle,
                label = "Change sleeping place"
            ),
            TomSettingsItem(
                icon = R.drawable.vector,
                label = "Meow settings"
            ),
            TomSettingsItem(
                icon = R.drawable.elemeddnts,
                label = "Password to open the fridge"
            ),
        )
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items.forEach {
                TomSettingsRow(it)
            }
        }
    }
}

@Composable
fun HisFavoriteFoods() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "His favorite foods",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = IBMPlexSansArabic,
                color = Color(0xDE1F1F1E),
                letterSpacing = 0.1.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        val items = listOf(
            TomSettingsItem(
                icon = R.drawable.alertgb,
                label = "Mouses"
            ),
            TomSettingsItem(
                icon = R.drawable.scson,
                label = "Last stolen meal"
            ),
            TomSettingsItem(
                icon = R.drawable.elemscscents,
                label = "Change sleep mood"
            ),
        )
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items.forEach {
                TomSettingsRow(it)
            }
        }
    }
}

data class TomSettingsItem(
    @DrawableRes val icon: Int,
    val label: String
)

@Composable
fun TomSettingsRow(item: TomSettingsItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color.White, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(item.icon),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.label,
            fontWeight = FontWeight.Medium,
            fontFamily = IBMPlexSansArabic,
            fontSize = 20.sp,
            color = Color(0xDE1F1F1E),
        )
    }
}