package com.example.githubrepos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepos.ui.theme.GithubreposTheme

@Composable
fun IssueItem(modifier: Modifier = Modifier) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 12.dp)
            .background(color = Color.White, shape = RoundedCornerShape(12.dp))

    ){
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
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text= "issue issue issue issue issueeeeeeeeeeeeeeeeeeeeeee",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    modifier = Modifier
                        .padding(start = 15.dp),
                    text="Open"
                )

            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text="NONE")
            Spacer(modifier = Modifier.height(8.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,

            ) {
                Text(text="Created At: ")
                Text(text="0000-00-00, 00:00 AM")
            }

        }
    }
}

@Preview
@Composable
private fun PreviewIssueItem () {
    GithubreposTheme {
        IssueItem()
    }
}








