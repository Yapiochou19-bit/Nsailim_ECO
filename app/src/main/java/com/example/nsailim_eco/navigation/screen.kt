package com.example.nsailim_eco.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash")

    object Onboarding : Screen("onboarding")

    object Login : Screen("login")

    object Home : Screen("home")

    object Learn : Screen("learn")

    object Lesson : Screen("lesson")

    object Quiz : Screen("quiz")

    object QuizSuccess : Screen("quiz_success")

    object Challenge : Screen("challenge")

    object Validation : Screen("validation")

    object Rewards : Screen("rewards")

    object Profile : Screen("profile")

    object Company : Screen("company")
}