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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry_composetask.R
import com.example.tomandjerry_composetask.ui.theme.ColorBlack
import com.example.tomandjerry_composetask.ui.theme.ColorBlue
import com.example.tomandjerry_composetask.ui.theme.ColorBlueAlt
import com.example.tomandjerry_composetask.ui.theme.ColorDark15
import com.example.tomandjerry_composetask.ui.theme.ColorLightBlue
import com.example.tomandjerry_composetask.ui.theme.ColorScreenBackground
import com.example.tomandjerry_composetask.ui.theme.ColorSearchGray
import com.example.tomandjerry_composetask.ui.theme.ColorTextDescription
import com.example.tomandjerry_composetask.ui.theme.IBMPlexSansArabic

@Composable
fun JerryStoreScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorScreenBackground)
            .verticalScroll(scrollState)
            .padding(top = 55.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        HeaderSection(notificationCount = 3)
        Spacer(modifier = Modifier.height(18.dp))
        SearchSection()
        Spacer(modifier = Modifier.height(10.dp))
        PromotionBannerSection(
            "Buy 1 Tom and get 2 for free",
            "Adopt Tom! (Free Fail-Free \nGuarantee)"
        )
        Spacer(modifier = Modifier.height(24.dp))
        ViewAllText("Cheap tom section", "View all")
        Spacer(modifier = Modifier.height(14.dp))
        CheapTomGridColumn()
    }
}

@Composable
fun HeaderSection(notificationCount: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        JerryWelcomeHeader()
        Spacer(modifier = Modifier.weight(1f))
        NotificationBellWithBadge(count = notificationCount)
    }
}

@Composable
fun JerryWelcomeHeader(
    userName: String = "Jerry"
) {
    Image(
        painter = painterResource(R.drawable.profile),
        contentDescription = "Jerry Store Logo",
        modifier = Modifier
            .size(67.dp)
            .clip(RoundedCornerShape(12.dp))
    )
    Spacer(modifier = Modifier.width(10.dp))
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Hi, $userName \uD83D\uDC4B\uD83C\uDFFB",
            color = ColorBlack,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,

        )
        Text(
            text = "Which Tom do you want to buy?",
            fontSize = 16.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Normal,
            color = ColorTextDescription,
        )
    }
}

@Composable
fun NotificationBellWithBadge(count: Int) {
    Box(
        modifier = Modifier
            .width(51.dp)
            .height(60.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = ColorDark15,
                    shape = RoundedCornerShape(12.dp)
                )
                .width(51.dp).height(52.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = "notification",
                modifier = Modifier
                    .size(34.dp)
            )
        }
        if (count > 0) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(ColorBlue)
                    .size(16.dp)
                    .align(Alignment.TopEnd),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = count.toString(),
                    color = Color.White,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = (-4).dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun SearchSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier
                .height(62.dp)
                .weight(1f)
                .background(Color.White, RoundedCornerShape(12.dp))
                .border(1.dp, Color.White, RoundedCornerShape(12.dp))
                .padding(start = 16.dp, end = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Search about tom ...",
                color = ColorSearchGray,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.width(11.dp))
        Box(
            modifier = Modifier
                .size(62.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(ColorBlue),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painterResource(R.drawable.ic_filter),
                contentDescription = "Filter Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(26.dp)
            )
        }
    }
}

@Composable
fun PromotionBannerSection(
    title: String,
    subtitle: String
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        Image(
            painter = painterResource(R.drawable.promotion_banner_img),
            contentDescription = "",
         //   contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.padding(start = 12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = title,
                color = Color.White,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 12.dp)
            )
            Text(
                text = subtitle,
                fontSize = 16.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Normal,
                color = ColorTextDescription,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun ViewAllText(sectionTitle: String, actionText: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = sectionTitle,
            color = ColorBlack,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(
                text = actionText,
                color = ColorBlueAlt,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
            Image(
                painterResource(R.drawable.ic_arrow),
                contentDescription = "",
                modifier = Modifier.size(12.dp)
            )
        }
    }
}

@Composable
fun CheapTomGridColumn() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(22.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard1(
                    name = "Sport Tom",
                    description = "He runs 1 meter... trips over his boot.\n",
                    promo = 5,
                    cheeseCount = 3,
                    img = R.drawable.t1
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard(
                    name = "Tom the lover",
                    description = "He loves one-sidedly... and is beaten by the other side.",
                    cheeseCount = 5,
                    img = R.drawable.t2
                )
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard(
                    name = "Tom the bomb",
                    description = "He blows himself up before Jerry can catch \nhim.",
                    cheeseCount = 10,
                    img = R.drawable.t3
                )
            }

            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard(
                    name = "Spy Tom",
                    description = "Disguises itself as a table.\n",
                    cheeseCount = 12,
                    img = R.drawable.t4
                )
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard(
                    name = "Frozen Tom",
                    description = "He was chasing Jerry, he froze after the first look\n",
                    cheeseCount = 10,
                    img = R.drawable.t5
                )
            }

            Box(modifier = Modifier.weight(1f)) {
                CheapTomCard(
                    name = "Sleeping Tom",
                    description = "He doesn't chase anyone, he just snores in stereo.",
                    cheeseCount = 10,
                    img = R.drawable.t6
                )
            }

        }
    }
}

@Composable
fun CheapTomCard1(name: String, description: String, promo: Int, cheeseCount: Int, img: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(304.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(286.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = name,
                    color = ColorBlack,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp,

                )
                Text(
                    text = description,
                    fontSize = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    color = ColorTextDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 4.dp, end = 4.dp, bottom = 6.dp),
                    textAlign = TextAlign.Center
                )
                CheeseCartRow1(cheeseCount = cheeseCount, promo = promo)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = name,
                modifier = Modifier.fillMaxSize().align(Alignment.Center)
            )
        }
    }
}

@Composable
fun CheeseCartRow1(cheeseCount: Int, promo: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(8.dp))
                .background(ColorLightBlue)
                .height(38.dp)
                .padding(start = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_money_bag),
                    contentDescription = "Cheese Bag",
                    tint = ColorBlue,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = promo.toString(),
                    textDecoration = TextDecoration.LineThrough,
                    color = ColorBlue,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                )
                Text(
                    text = " $cheeseCount cheeses  ",
                    color = ColorBlue,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(38.dp)
                .border(
                    width = 1.dp,
                    color = ColorBlue,
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_cart),
                contentDescription = "Cart Plus",
                tint = ColorBlue,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun CheapTomCard(
    name: String,
    description: String,
    cheeseCount: Int,
    @DrawableRes img: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(304.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(286.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = name,
                    color = ColorBlack,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp,
                )
                Text(
                    text = description,
                    fontSize = 16.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    color = ColorTextDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 4.dp, end = 4.dp, bottom = 6.dp),
                    textAlign = TextAlign.Center
                )
                CheeseCartRow(cheeseCount = cheeseCount)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = name,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun CheeseCartRow(
    cheeseCount: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(8.dp))
                .background(ColorLightBlue)
                .height(38.dp)
                .padding(start = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_money_bag),
                    contentDescription = "Cheese Bag",
                    tint = ColorBlue,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = "$cheeseCount cheeses   ",
                    color = ColorBlue,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(38.dp)
                .border(
                    width = 1.dp,
                    color = ColorBlue,
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_cart),
                contentDescription = "Cart Plus",
                tint = ColorBlue,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JerryStoreScreenPreview() {
    JerryStoreScreen()
}