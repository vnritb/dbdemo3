package cat.itb.dam.m78.dbdemo3.view
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App2() {
    MaterialTheme {

        //Llista amb tots els registres, obtinguda del ViewModel
        //val all = viewModel.allTexts.value
        //var inputText by remember { mutableStateOf("") }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Hello")
        }
    }
}