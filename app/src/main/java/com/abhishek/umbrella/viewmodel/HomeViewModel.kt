package com.abhishek.umbrella.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.abhishek.umbrella.model.WeatherInfo
import com.abhishek.umbrella.repository.WeatherRepository
import com.abhishek.umbrella.view.HomeFragmentDirections
import kotlinx.coroutines.launch

private const val city = "San Francisco"

class HomeViewModel(repository: WeatherRepository) : ViewModel() {
    val weather = MutableLiveData<WeatherInfo>()
    val isBusy = MutableLiveData<Boolean>(false)

    init {
        viewModelScope.launch {
            isBusy.value = true
            weather.value = repository.getWeatherByCity(city)
            isBusy.value = false
        }
    }

    fun showForecast(view: View) {
        view.findNavController().navigate(
            HomeFragmentDirections.actionHomeToForecast(city)
        )
    }
}