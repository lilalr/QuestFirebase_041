package com.example.questfirebase_041.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase_041.modeldata.Siswa
import com.example.questfirebase_041.repositori.RepositorySiswa
import kotlinx.coroutines.launch
import java.io.IOException
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<Siswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}

