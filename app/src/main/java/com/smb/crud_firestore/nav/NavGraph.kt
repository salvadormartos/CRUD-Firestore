package com.smb.crud_firestore.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.smb.crud_firestore.screen.AddDataScreen
import com.smb.crud_firestore.screen.GetDataScreen
import com.smb.crud_firestore.screen.MainScreen
import com.smb.crud_firestore.util.SharedViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.route
    ) {
        // main screen
        composable(
            route = Screens.MainScreen.route
        ) {
            MainScreen(
                navController = navController,
            )
        }
        // get data screen
        composable(
            route = Screens.GetDataScreen.route
        ) {
            GetDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
        // add data screen
        composable(
            route = Screens.AddDataScreen.route
        ) {
            AddDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
    }
}