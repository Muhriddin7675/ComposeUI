package com.example.composeui.screen

import android.widget.GridLayout.Spec
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R

@Composable
fun ProfilScreen() {
    val configuration = LocalConfiguration.current
    val heightScreen = configuration.screenHeightDp.dp


    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .background(Color(0xff0ccbe5))
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(top = 36.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.person1),
                        contentDescription = "person image",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(130.dp, 130.dp)
                            .clip(
                                CircleShape
                            ),
                        contentScale = ContentScale.Crop,


                        )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "WILLIAM SNOE",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Normal,
                        style = TextStyle(fontWeight = FontWeight.Bold)
                    )

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(3f)
                    .background(Color(0xffffffff))
            ) {

                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(start = 64.dp)
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(R.drawable.ic_email_icon_2),
                            contentDescription = "email",
                            Modifier.size(36.dp, 36.dp),
                            colorFilter = ColorFilter.tint(Color(0xff0ccbe5))
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "Willam@gmail.com",
                            fontSize = 18.sp,
                            color = Color(0xFF858080),
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Row(modifier = Modifier.padding(top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.ic_phone_icon_2),
                            contentDescription = "email",
                            Modifier.size(36.dp, 36.dp),
                            colorFilter = ColorFilter.tint(Color(0xff0ccbe5))

                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "+222 202 202",
                            fontSize = 18.sp,
                            color = Color(0xFF858080),
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Row(modifier = Modifier.padding(top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.ic_add_to_queue_icon),
                            contentDescription = "email",
                            Modifier.size(36.dp, 36.dp),
                            colorFilter = ColorFilter.tint(Color(0xff0ccbe5))

                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "Add to Group",
                            fontSize = 18.sp,
                            color = Color(0xFF858080),
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Row(modifier = Modifier.padding(top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.ic_comments_icon),
                            contentDescription = "email",
                            Modifier.size(36.dp, 36.dp),
                            colorFilter = ColorFilter.tint(Color(0xff0ccbe5))
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "Show All Comments",
                            fontSize = 18.sp,
                            color = Color(0xFF858080),
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .padding(bottom = 36.dp)
                        .height(40.dp)
                        .align(Alignment.BottomCenter)
                        .background(color = Color(0xFF0DB6B5), shape = CircleShape)
                ) {
                    Text(
                        text = "FOLLOW ME",
                        color = Color.White,
                        fontStyle = FontStyle.Normal,
                        modifier = Modifier.align(Alignment.Center)
                    )

                }


//                Box(
//                    modifier = Modifier
//                        .align(Alignment.BottomCenter)
//                        .height(40.dp)
//                        .width(120.dp)
//                        .background(color = Color(0xFF0DB6B5), shape = CircleShape)
//                        .padding(bottom = 36.dp)
//                ) {
//
//                }
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = heightScreen * 2 / 5 - 50.dp,
                    bottom = heightScreen * 3 / 5 - 50.dp,
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center)
                    .shadow(
                        elevation = 8.dp,
                        spotColor = Color.Black,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .background(Color.White, RoundedCornerShape(12.dp))
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)

                ) {
                    androidx.compose.material3.Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Photos",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    androidx.compose.material3.Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "376",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF32B3ED)
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)

                ) {
                    androidx.compose.material3.Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Followers",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    androidx.compose.material3.Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "2254",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF32B3ED)
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)

                ) {
                    androidx.compose.material3.Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Following",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    androidx.compose.material3.Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "528",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF32B3ED)
                    )
                }

            }

        }

    }


}


@Preview
@Composable
fun PreviewProfilScreen() {
    ProfilScreen()
}