import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.R


@SuppressLint("InvalidColorHexValue", "Range")
@Composable
fun LightBuildScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDFF44336))
    ) {
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(
                    text = "Light Build",
                    color = Color.White,
                    fontSize = 30.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(5f)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.lamp),
                contentDescription = null,
                modifier = Modifier
                    .padding(40.dp)
                    .align(Alignment.Center)
                    .size(260.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(2.5f)
                .fillMaxHeight(240f)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Valiyev Muhriddin",
                color = Color.White,
                fontSize = 30.sp,
            )
        }
        Row(
            modifier = Modifier
                .weight(2.5f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFC83939))
            ) {
                Image(
                    painter = painterResource(id = com.example.composeui.R.drawable.sun),
                    contentDescription = null,
                    modifier = Modifier.padding(18.dp)
                        .align(Alignment.Center)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD65A5A))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mobile_phone_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(35.dp)
                        .align(Alignment.Center)
                )
            }
        }
        Row(
            modifier = Modifier
                .weight(2.5f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xC49E0B0B))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.timer),
                    contentDescription = null,
                    modifier = Modifier.padding(35.dp)
                        .align(Alignment.Center)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xE6A62020))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.zontik),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(35.dp)
                        .align(Alignment.Center)

                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewLightBuildScreen() {
    LightBuildScreen()
}
