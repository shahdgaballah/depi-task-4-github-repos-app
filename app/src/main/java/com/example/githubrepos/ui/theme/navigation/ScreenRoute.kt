package com.example.githubrepos.ui.theme.navigation

sealed class ScreensRoute(val route: String){
    data object RepoListScreen:ScreensRoute(route="repo_list")
    data object RepoDetailsScreen:ScreensRoute(route = "repo_details")
}