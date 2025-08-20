package com.example.financeapp.Activities.Dashboard.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.R


@Composable
@Preview
fun CardSection(onClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .height(230.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }) {
        Image(
            painter = painterResource(R.drawable.card),
            null,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(R.drawable.sim),
            null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
        )
        Image(
            painter = painterResource(R.drawable.visa),
            null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "1234 5678 9012 3456",
                color = Color.White,
                fontSize = 18.sp,
                )
            Text(
                text = "03/12",
                color = Color.White,
                fontSize = 18.sp,
                )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .align ( Alignment.BottomCenter )
                .clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd =  12.dp))
                .background(Color.White.copy(alpha = 0.2f))
                .padding(16.dp)
        ){
            Column {
                Text(
                    text = "Your Balance",
                    color = Color.White,
                    fontSize = 17.sp
                )
                Text(
                    text =  "$ 12,345.67",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

    }
}