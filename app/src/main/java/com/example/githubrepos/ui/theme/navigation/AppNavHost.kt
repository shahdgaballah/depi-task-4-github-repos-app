package com.example.githubrepos.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubrepos.ui.theme.screens.repo_list.RepoItem
import com.example.githubrepos.ui.theme.screens.repo_list.RepoListScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreensRoute.RepoListScreen.route,
        ) {

        composable(route = ScreensRoute.RepoListScreen.route ){
            RepoListScreen(){
                navController.navigate(ScreensRoute.RepoDetailsScreen.route)
            }

        }
        composable(route = ScreensRoute.RepoDetailsScreen.route){

        }
    }
}