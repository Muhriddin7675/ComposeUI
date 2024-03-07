package com.example.composeui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R

@Composable
fun LocationScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(color = Color(0xFF2599F4), RectangleShape),
        ) {
            Text(
                text = "Buy Local",
                modifier = Modifier.align(Alignment.Center),
                fontSize = 24.sp,
                color = Color(0xffffffff)
            )
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1F, true)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xDC08CA10))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(top = 50.dp)
                        ) {
                            Text(
                                text = "Local",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                            Text(
                                text = "Businesses",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )


                            Image(
                                painter = painterResource(id = R.drawable.ic_location),
                                contentDescription = null,
                                Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(100.dp, 100.dp)
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xC8009688))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(top = 50.dp)
                        ) {
                            Text(
                                text = "Games",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                            Text(
                                text = "",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )


                            Image(
                                painter = painterResource(id = R.drawable.icon_game),
                                contentDescription = null,
                                Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(100.dp, 100.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1F, true)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xE2673AB7))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 50.dp)
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.icon_store),
                                contentDescription = null,
                                Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(100.dp, 100.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )

                            Text(
                                text = "",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                            Text(
                                text = "Storefront",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xB5FFC107))
                    ) {
                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 50.dp)
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.icon_deals),
                                contentDescription = null,
                                Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(100.dp, 100.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )

                            Text(
                                text = "",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                            Text(
                                text = "Deals",
                                color = Color(0xffffffff),
                                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                fontSize = 24.sp
                            )
                        }
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.globe_showing_europe_africa),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
                    .size(250.dp,250.dp)
                    .background(Color(0xffffffff), shape = CircleShape)
                    .padding(0.2.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLocationScreen() {
    LocationScreen()
}