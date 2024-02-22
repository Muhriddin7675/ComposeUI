package com.example.composeui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R
import com.example.composeui.data.ProductData

@Composable
fun FoodProduct() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF100F1F))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 16.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 16.dp)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 20.dp, end = 8.dp, top = 8.dp, bottom = 8.dp)
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.White)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 16.dp)
                )
            }
            Column(
                modifier = Modifier
                    .weight(0.2f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.2f)
                        .padding(12.dp)
                )
            }
        }

        val productResurs = listOf(
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 300 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 500 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 700 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 800 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 900 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 100 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),
            ProductData(
                "Food Name",
                R.drawable.image_category,
                "$ 300 000",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard"
            ),

            )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(0.dp),
            modifier = Modifier
                .fillMaxSize()
        ) {
            productResurs.forEach {
                item {
                    FoodItem(it)
                }
            }
        }

    }
}

@Composable
fun FoodItem(it: ProductData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Image(
            modifier = Modifier
                .padding(18.dp, 0.dp, 0.dp, 0.dp)
                .weight(2f)
                .clip(shape = RoundedCornerShape(10.dp))
                .size(100.dp),
            painter = painterResource(id = it.image),
            contentScale = ContentScale.Crop,

            contentDescription = null
        )

        Column(
            modifier = Modifier
                .weight(4f)
        ) {
            Column {
                Text(
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp),
                    text = it.name,
                    color = Color.White
                )
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = it.description,
                    color = Color.Gray,
                    fontSize = 10.sp,

                    )
            }
            Row {
                Text(
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp),
                    text = "$300.00", color = Color.White
                )

                Spacer(modifier = Modifier.weight(4f))
                Box(
                    modifier = Modifier
                        .size(65.dp, 20.dp)
                        .clip(shape = RoundedCornerShape(30.dp))
                        .background(color = Color.Red)
                        .align(alignment = Alignment.Bottom)


                ) {
                    Text(
                        text = "Add Card",
                        color = Color.White,
                        modifier = Modifier
                            .align(alignment = Alignment.Center)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewFoodProductScreen() {
    FoodProduct()
}
