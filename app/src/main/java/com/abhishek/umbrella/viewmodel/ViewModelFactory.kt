package com.abhishek.umbrella.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abhishek.umbrella.repository.ServiceRepository
import javax.inject.Inject

// FIXME Avoid consolidating all viewModel logic into one factory

@Suppress("UNCHECKED_CAST")
class ViewModelFactory @Inject constructor(
    private val repository: ServiceRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when (modelClass) {
            HomeViewModel::class.java -> HomeViewModel(repository) as T
            else -> throw IllegalArgumentException("Unable to create class ${modelClass.simpleName}")
        }
    }
}