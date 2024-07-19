package com.example.learntogether

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ArticleDetail()
                }
            }
        }
    }
}

@Composable
fun ArticleDetail() {
    Article(
        title = stringResource(R.string.articleTitle),
        introduction =stringResource(R.string.articleIntroduction) ,
        body =stringResource(R.string.articleBody),
        image = painterResource(R.drawable.article_image),
}

@Composable
fun Article(title: String,introduction: String,body: String,image: Painter) {
    Column(){
        Image(
            painter =image,
            contentDescription = "Jackpot Compose Button"
        )
        Text(
            text= title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = introduction,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    LearnTogetherTheme {
        ArticleDetail()
    }
}