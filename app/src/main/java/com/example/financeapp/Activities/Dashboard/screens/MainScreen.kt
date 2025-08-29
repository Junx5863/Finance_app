package com.example.financeapp.Activities.Dashboard.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.Activities.Dashboard.components.ActionButtonRow
import com.example.financeapp.Activities.Dashboard.components.BottomNavigationBar
import com.example.financeapp.Activities.Dashboard.components.CardSection
import com.example.financeapp.Activities.Dashboard.components.ExpenseItem
import com.example.financeapp.Activities.Dashboard.components.HeaderSection
import com.example.financeapp.Domain.ExpenseDomain
import com.example.financeapp.R


@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    val expenses = listOf(
        ExpenseDomain("Restaurant", 572.12, "restaurant", "17 May 2023 17:00"),
        ExpenseDomain("Netflix", 42.12, "mcdonald", "18 May 2023 14:00"),
        ExpenseDomain("Cinema", 899.12, "cinema", "19 May 2023 16:00"),
        ExpenseDomain("Restaurant", 572.12, "restaurant", "20 May 2023 19 :00"),
    )
    MainScreen(
        onCardClick = {},
        expenses = expenses
    )
}


@Composable
fun MainScreen(
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),

        ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {
            item { HeaderSection() }
            item { CardSection ( onCardClick ) }
            item { ActionButtonRow() }
            items(expenses){ item -> ExpenseItem(item = item) }


        }

        BottomNavigationBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(80.dp),
            onItemSelected = {itemId ->
                if(itemId == R.id.wallet){
                    // Handle Wallet navigation
                } else if(itemId == R.id.market){
                    // Handle Market navigation
                } else if(itemId == R.id.trade){
                    // Handle Trade navigation
                } else if(itemId == R.id.futures){
                    // Handle Futures navigation
                }
            }
        )
    }

}


