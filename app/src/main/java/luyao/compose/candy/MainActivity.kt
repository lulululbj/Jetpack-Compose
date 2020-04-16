package luyao.compose.candy

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppContent()
        }
    }
}

@Composable
fun AppContent() {
    MaterialTheme {
        Column {
            Button(onClick = {
            }) {
                Text(text = "Text")
            }
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    AppContent()
}