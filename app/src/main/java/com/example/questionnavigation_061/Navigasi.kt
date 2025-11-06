package com.example.questionnavigation_061

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulirku,
    Data,
}

@Composable
fun DataApp(
    navController: NavController = rememberNavController(),
    modifier: Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi, Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)
        ) }
}

