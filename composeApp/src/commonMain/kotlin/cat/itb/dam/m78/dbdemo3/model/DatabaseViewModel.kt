package cat.itb.dam.m78.dbdemo3.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class DatabaseViewModel : ViewModel() {
    val allTexts = mutableStateOf<List<String>>(emptyList())

    init {
        fetchAllTexts()
    }

    private fun fetchAllTexts() {
        viewModelScope.launch {
            val myTableQueries = database.myTableQueries
            allTexts.value = myTableQueries.selectAll().executeAsList()
        }
    }
}