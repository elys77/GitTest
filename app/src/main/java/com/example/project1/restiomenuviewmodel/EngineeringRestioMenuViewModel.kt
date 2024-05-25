package com.example.project1.restiomenuviewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project1.R
import kotlinx.coroutines.launch

class EngineeringRestioMenuViewModel : ViewModel() {
    val CoffeeItems = mutableStateListOf(
        MenuItem(R.drawable.saltbab, "소금 삼겹 덮밥", "3500", 10)
    )

    val NonCoffeeItems = mutableStateListOf(
        MenuItem(R.drawable.basicpopo, "420 쌀국수", "4200", 15)
    )

    val DrinksItems = mutableStateListOf(
        MenuItem(R.drawable.wangdon, "120 돈가스", "6300", 5)
    )

    val DessertItems = mutableStateListOf(
        MenuItem(R.drawable.wangdon, "120 돈가스", "6300", 5)
    )


    fun decreaseCoffeeQuantity(index: Int) {
        viewModelScope.launch {
            if (CoffeeItems[index].quantity > 0) {
                CoffeeItems[index].quantity -= 1
            }
        }
    }

    fun decreaseNonCoffeeQuantity(index: Int) {
        viewModelScope.launch {
            if (NonCoffeeItems[index].quantity > 0) {
                NonCoffeeItems[index].quantity -= 1
            }
        }
    }

    fun decreaseDrinksQuantity(index: Int) {
        viewModelScope.launch {
            if (DrinksItems[index].quantity > 0) {
                DrinksItems[index].quantity -= 1
            }
        }
    }

    fun decreaseDessertQuantity(index: Int) {
        viewModelScope.launch {
            if (DessertItems[index].quantity > 0) {
                DessertItems[index].quantity -= 1
            }
        }
    }
}