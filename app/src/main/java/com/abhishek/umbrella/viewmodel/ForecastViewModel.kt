package com.abhishek.umbrella.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ForecastViewModel : ViewModel() {
    val city = MutableLiveData<String>("")
}