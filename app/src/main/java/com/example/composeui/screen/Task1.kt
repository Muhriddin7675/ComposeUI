package com.example.composeui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeui.R

@Composable
fun WeatherCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF9BBF71))
        ) {}

        Row(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
                .background(Color(0xFFD8B075))
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1.3f)
            ) {}

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                WeatherItem(text = "MORNING", temperature = "- 1°")
            }

        }
        Row(
            modifier = Modifier
                .weight(8f)
                .fillMaxWidth()
                .background(Color(0xFFC3934D))
                .padding(8.dp)
        ) {

            Column(
                modifier = Modifier.weight(1.3f)
            ) {
                Image(
                    modifier = Modifier
                        .padding(24.dp),
                    painter = painterResource(id = R.drawable.ic_cloud),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    WeatherItem(text = "DAY", temperature = "+ 3°")
                }

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    WeatherItem(text = "Mostly", temperature = "Sunny")
                }

                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center
                ) {
//                    WeatherItem(text = "Wind:N 5 mph", temperature = "Humidity: 45%")
                    Text(
                        text = "Wind:N 5 mph",
                        style = MaterialTheme.typography.h6,
                        color = Color.White
                    )
                    Text(
                        text = "Humidity: 45%",
                        style = MaterialTheme.typography.h6,
                        color = Color.White
                    )
                }


            }

        }
        Row(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
                .background(Color(0xFFA65941))
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1.3f)
            ) {
                // Placeholder for image
            }

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                WeatherItem(text = "EVENING", temperature = "0°")
            }
        }
        Row(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
                .background(Color(0xFF93442B))
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1.3f)
            ) {
                // Placeholder for image
            }

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                WeatherItem(text = "NIGHT", temperature = "- 2°")
            }
        }
    }
}


@Composable
fun WeatherItem(text: String, temperature: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.h6,
            color = Color.White
        )
        Text(
            text = temperature,
            style = MaterialTheme.typography.h4,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeatherCard() {
    WeatherCard()
}