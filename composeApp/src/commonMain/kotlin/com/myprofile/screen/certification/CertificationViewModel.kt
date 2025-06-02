package com.myprofile.screen.certification

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myprofile.data.CatFactRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CertificationViewModel(
    private val catFactRepository: CatFactRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow<CertificationUiState>(CertificationUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.value = CertificationUiState.Success(catFactRepository.fetchFact())
        }
    }
}

sealed class CertificationUiState {
    object Loading : CertificationUiState()
    data class Success(val catFact: String) : CertificationUiState()
}