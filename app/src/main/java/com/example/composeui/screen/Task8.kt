package com.example.composeui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeui.R
import com.example.composeui.data.ProfilData

@Composable
fun InstagramProfilScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        val profilResurs = arrayListOf(
            ProfilData(R.drawable.person,"Deborah Kim", Color(0xFFFD8C20),158),
            ProfilData(R.drawable.person,"Dima Cergey", Color(0xFFFE5036),2000),
            ProfilData(R.drawable.person,"Muhiddin V", Color(0xFFFC305B),1534),
            ProfilData(R.drawable.person,"Deborah Daniyel", Color(0xFFA83165),1582),
            ProfilData(R.drawable.person,"Deborah M", Color(0xFF4D303A),123),
        )



        LazyColumn(verticalArrangement = Arrangement.spacedBy(0.dp)) {
            profilResurs.forEach {
                item {
                    ProfilItem(it)
                }
            }
        }
    }
}

@Composable
fun ProfilItem(it: ProfilData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .background(it.color)
    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
        ){
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)){
                Image(
                    painter = painterResource(id = R.drawable.preson_2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(74.dp)
                        .padding(12.dp)
                        .clip(shape = CircleShape)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop,
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(4f),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = it.name,
                    style = MaterialTheme.typography.h4,
                    color = Color.White

                )
                Text(
                    text = (it.followers.toString() + " followers"),
                    style = MaterialTheme.typography.h6,
                    color = Color.White
                )
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)){
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(16.dp)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewInstagramProfilBuildScreen() {
    InstagramProfilScreen()
}