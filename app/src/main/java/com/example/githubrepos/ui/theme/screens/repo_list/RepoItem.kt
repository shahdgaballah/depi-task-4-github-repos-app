package com.example.githubrepos.ui.theme.screens.repo_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepos.R
import com.example.githubrepos.ui.theme.GithubReposTheme
import com.example.githubrepos.ui.theme.Yellow
import com.example.githubrepos.ui.theme.screens.repo_list.preview.fakeRepoList

@Composable
fun RepoItem(
    repoItemUiModel: GithubRepoUiModel,
    modifier: Modifier = Modifier,
    itemClicked: () -> Unit
             ) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 12.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = MaterialTheme.shapes.medium
            )
            .clickable {
                //handle clicked repo item
                itemClicked()
            }
    ) {
        Image(
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp)
                .size(50.dp)
                .clip(shape = CircleShape), // RoundedCornerShape = (50)
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Column (
            modifier = Modifier
                .padding(8.dp)
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = repoItemUiModel.name, //stringResource(R.string.repo_name),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(text = repoItemUiModel.stars, //stringResource(R.string.stars_count),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium
                    )
                Image(
                    modifier = Modifier
                        .size(20.dp),
                        painter = painterResource(R.drawable.ic_star),
                    colorFilter = ColorFilter.tint(Yellow),
                        contentDescription = null
                    )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                repoItemUiModel.owner,
                //text= stringResource(R.string.repo_owner),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium
                )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text= repoItemUiModel.description, // stringResource(R.string.repo_description),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

        }

    }
}


@Preview
@Composable
private fun PreviewRepoItem() {
    GithubReposTheme {
        RepoItem(repoItemUiModel = fakeRepoList.first(), itemClicked = {})
    }
    
}
