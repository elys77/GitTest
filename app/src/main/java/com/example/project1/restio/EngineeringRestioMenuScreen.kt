package com.example.project1.restio

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project1.restiomenuviewmodel.EngineeringRestioMenuViewModel

@Composable
fun EngineeringCoffeeScreen(viewModel: EngineeringRestioMenuViewModel = viewModel()) {
    Column {
        MenuGrid(
            menuItems = viewModel.CoffeeItems,
            onItemClick = { index ->
                viewModel.decreaseCoffeeQuantity(index)
            }
        )
    }
}

@Composable
fun EngineeringNonCoffeeeScreen(viewModel: EngineeringRestioMenuViewModel = viewModel()) {
    Column {
        MenuGrid(
            menuItems = viewModel.NonCoffeeItems,
            onItemClick = { index ->
                viewModel.decreaseNonCoffeeQuantity(index)
            }
        )
    }
}

@Composable
fun EngineeringDrinkScreen(viewModel: EngineeringRestioMenuViewModel = viewModel()) {
    Column {
        MenuGrid(
            menuItems = viewModel.DrinksItems,
            onItemClick = { index ->
                viewModel.decreaseDrinksQuantity(index)
            }
        )
    }
}

@Composable
fun EngineeringDessertScreen(viewModel: EngineeringRestioMenuViewModel = viewModel()) {
    Column {
        MenuGrid(
            menuItems = viewModel.DessertItems,
            onItemClick = { index ->
                viewModel.decreaseDessertQuantity(index)
            }
        )
    }
}