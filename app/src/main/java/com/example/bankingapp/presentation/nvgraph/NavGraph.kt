package com.example.bankingapp.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = startDestination ){
        navigation(
            route = Route.AuthenticationRoute.route,
            startDestination = Route.LoginScreen.route
        ){
            composable(Route.LoginScreen.route){

            }
            composable(Route.RegistrationScreen.route){

            }
            composable(Route.ForgotPasswordScreen.route){

            }
        }
        navigation(
            route = Route.AppStartWorkingFirst.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(Route.OnBoardingScreen.route){

            }
        }
    }
}
//popUpTo("auth") inclusive = true

@Composable
inline fun <reified T: HiltViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return hiltViewModel()
    val parentEntry = remember(this){
        navController.getBackStackEntry(navGraphRoute)
    }
    return hiltViewModel(parentEntry)
}