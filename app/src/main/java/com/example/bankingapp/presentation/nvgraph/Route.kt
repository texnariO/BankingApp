package com.example.bankingapp.presentation.nvgraph

import androidx.navigation.NamedNavArgument

sealed class Route (
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList()
){
    object LoginScreen: Route(route = "login_screen")
    object RegistrationScreen: Route(route = "registration_screen")
    object ForgotPasswordScreen: Route(route = "forgot_password_screen")
    object HomeScreen: Route(route = "home_screen")

    object OnBoardingScreen: Route(route = "on_boarding_screen")

    object AppStartWorkingFirst: Route(route = "first_start_app")
    object AuthenticationRoute: Route(route = "auth")
}