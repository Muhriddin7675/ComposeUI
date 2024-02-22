package com.example.composeui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R

@Composable
fun FoodCategory() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF100F1F))
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.image_category),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp))
                    .blur(3.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = null,
                modifier = Modifier.padding(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = null,
                modifier = Modifier
                    .padding(24.dp)
                    .align(Alignment.TopEnd)
            )
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 56.dp)
            ) {
                Text(
                    text = "Different",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Kind of Food",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Food Category",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.absolutePadding(left = 24.dp)
                    .padding(top = 16.dp)
            )
            Row(modifier = Modifier
                .align(Alignment.CenterHorizontally)) {
                ItemFood()
                ItemFood()
                ItemFood()

            }
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Food Category",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.absolutePadding(left = 24.dp)
                    .padding(top = 16.dp)
            )
            Row(modifier = Modifier
                .align(Alignment.CenterHorizontally)) {
                ItemFood()
                ItemFood()
                ItemFood()

            }
        }

    }
}

@Composable
fun ItemFood() {
    Column(
    modifier = Modifier.padding(12.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.image_category),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(
                    shape = RoundedCornerShape(16.dp)
                )
                .width(100.dp)
                .height(100.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Foood Name",
            color = Color.White
        )
        Text(
            text = "$300.00",
            color = Color.White
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .width(100.dp)
                .height(32.dp)
                .align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Add Card",
                fontSize = 12.sp)
        }

    }
}

@Preview
@Composable
fun PreviewFoodCategoryScreen() {
    FoodCategory()
}