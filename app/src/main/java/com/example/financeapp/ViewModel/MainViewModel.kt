package com.example.financeapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.financeapp.Repository.MainRespository

class MainViewModel(val repository: MainRespository): ViewModel() {
    constructor(): this(MainRespository())

    fun loadData() = repository.items
    fun loadBudgets() = repository.budgets
}