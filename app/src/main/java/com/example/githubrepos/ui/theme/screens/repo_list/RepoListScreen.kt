package com.example.githubrepos.ui.theme.screens.repo_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.githubrepos.ui.theme.screens.repo_list.preview.fakeRepoList

@Composable
fun RepoListScreen(
    itemClicked:() -> Unit
) {
    LazyColumn (
        Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)


    ){
        items(fakeRepoList){
            repoItem ->
            RepoItem (repoItemUiModel = repoItem, itemClicked = itemClicked )
        }
    }


}