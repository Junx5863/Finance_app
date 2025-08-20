package com.example.financeapp.Activities.Dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.R


@Composable
@Preview
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 48.dp, end = 16.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column {
            Text(
                text = "Hello, Nicolas Zamb",
                color = colorResource(R.color.darkBlue),
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "darkSould4010@gmail.com",
                color = colorResource(R.color.darkBlue),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )

        }
        Image(
            painter = painterResource(id = R.drawable.men),
            null,
            modifier = Modifier.size(50.dp)
        )
    }
}