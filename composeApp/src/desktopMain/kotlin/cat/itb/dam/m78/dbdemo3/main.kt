package cat.itb.dam.m78.dbdemo3

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "dbdemo3",
    ) {
        App()
    }
}