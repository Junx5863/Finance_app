package com.example.financeapp.Repository

import com.example.financeapp.Domain.BugetDomain
import com.example.financeapp.Domain.ExpenseDomain

class MainRespository{
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 572.12, "restaurant", "17 May 2023 17:00"),
        ExpenseDomain("Netflix", 42.12, "mcdonald", "18 May 2023 14:00"),
        ExpenseDomain("Play Station 5", 899.12, "cinema", "19 May 2023 16:00"),
        ExpenseDomain("Restaurant", 572.12, "restaurant", "20 May 2023 19 :00"),
    )

    val budgets = mutableListOf(
        BugetDomain(title = "Home Load", price = 1200.0 , percent = 80.7 ),
        BugetDomain(title = "Subcription", price =550.0 , percent =78.0 ),
        BugetDomain(title = "Car Loan", price = 800.0, percent = 20.8),
    )
}