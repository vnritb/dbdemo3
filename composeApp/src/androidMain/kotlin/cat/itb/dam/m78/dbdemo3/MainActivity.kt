package cat.itb.dam.m78.dbdemo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cat.itb.dam.m78.dbdemo3.view.App2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App2()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App2()
}