package cat.itb.dam.m78.dbdemo3.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cat.itb.dam.m78.dbdemo3.model.database
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val myTableQueries = database.myTableQueries
        //myTableQueries.insert("some Text")
        val all = myTableQueries.selectAll().executeAsList()
        //val one = myTableQueries.find(1).executeAsOneOrNull()


        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(all[0])
        }
    }
}