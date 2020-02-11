package com.abhishek.umbrella.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abhishek.umbrella.repository.ServiceRepository
import kotlinx.coroutines.launch

class HomeViewModel(repository: ServiceRepository) : ViewModel() {
    val welcomeText = MutableLiveData<String>()
    val isActionAvailable = MutableLiveData<Boolean>(false)

    init {
        viewModelScope.launch {
            welcomeText.value = repository.getGreeting().message
            isActionAvailable.value = true
        }
    }
}