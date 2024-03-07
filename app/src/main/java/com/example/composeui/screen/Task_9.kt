package com.example.composeui.screen

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R

@Composable
fun Freelancer() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            Modifier
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .align(Alignment.CenterEnd)
            ) {
                Text(
                    text = "Share",
                    fontSize = 32.sp,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .border(1.dp, Color.Black)
                        .padding(8.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Done",
                    fontSize = 32.sp,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .border(1.dp, Color.Black)
                        .padding(8.dp)

                )
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        ) {
            Column(modifier = Modifier.padding(start = 32.dp, top = 24.dp)) {
                Text(
                    text = "Freelancer",
                    fontSize = 36.sp,
           )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Creatde Jul  8, 2013 | Edited: sec ago")
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Row(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
                    .background(color = Color(0xFF00C1D8))
                    .padding(start = 24.dp)

            ) {
                Text(
                    text = "The Indea",
                    Modifier.weight(1f).align(Alignment.CenterVertically),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight()
                        .weight(0.3f)
                        .size(24.dp,24.dp)
                        .padding(18.dp))

            }
               Row(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
                    .background(color = Color(0xFF01D38E))
                    .padding(start = 24.dp)

            ) {
                Text(
                    text = "The Indea",
                    Modifier.weight(1f).align(Alignment.CenterVertically),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight()
                        .weight(0.3f)
                        .size(24.dp,24.dp)
                        .padding(18.dp))

            }
               Row(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
                    .background(color = Color(0xFF008883))
                    .padding(start = 24.dp)

            ) {
                Text(
                    text = "The Indea",
                    Modifier.weight(1f).align(Alignment.CenterVertically),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight()
                        .weight(0.3f)
                        .size(24.dp,24.dp)
                        .padding(18.dp))

            }
               Row(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
                    .background(color = Color(0xFFF2C200))
                    .padding(start = 24.dp)

            ) {
                Text(
                    text = "The Indea",
                    Modifier.weight(1f).align(Alignment.CenterVertically),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight()
                        .weight(0.3f)
                        .size(24.dp,24.dp)
                        .padding(18.dp))

            }
               Row(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
                    .background(color = Color(0xFFDD6E00))
                    .padding(start = 24.dp)

            ) {
                Text(
                    text = "The Indea",
                    Modifier.weight(1f).align(Alignment.CenterVertically),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight()
                        .weight(0.3f)
                        .size(24.dp,24.dp)
                        .padding(18.dp))

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewFreelancer() {
    Freelancer()
}