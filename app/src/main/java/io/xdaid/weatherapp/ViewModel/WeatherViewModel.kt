package io.xdaid.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import io.xdaid.weatherapp.Repository.WeatherRepository
import io.xdaid.weatherapp.Server.ApiClient
import io.xdaid.weatherapp.Server.ApiService
import retrofit2.create

class WeatherViewModel(val repository: WeatherRepository):ViewModel() {

    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCurrentWeather(lat:Double,lon:Double,units:String)=
        repository.getCurrentWeather(lat,lon,units)

    fun loadForecastWeather(lat:Double,lon:Double,units:String)=
        repository.getForecastWeather(lat,lon,units)

}