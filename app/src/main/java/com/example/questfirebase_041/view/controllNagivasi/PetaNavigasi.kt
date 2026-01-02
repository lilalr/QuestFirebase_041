package com.example.questfirebase_041.view.controllNagivasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questfirebase_041.view.EntrySiswaScreen
import com.example.questfirebase_041.view.HomeScreen
import com.example.questfirebase_041.view.route.DestinasiDetail
import com.example.questfirebase_041.view.route.DestinasiEntry
import com.example.questfirebase_041.view.route.DestinasiHome

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier){
    HostNavigasi(navController = navController)
}

