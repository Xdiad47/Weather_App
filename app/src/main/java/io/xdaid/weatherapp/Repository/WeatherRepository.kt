package io.xdaid.weatherapp.Repository

import io.xdaid.weatherapp.Server.ApiService

class WeatherRepository(val api:ApiService) {

    fun getCurrentWeather(latitude:Double,longitude:Double,units:String)=
        api.getCurrentWeather(latitude,longitude,units,"You-weather-key-here")

    fun getForecastWeather(latitude:Double,longitude:Double,units:String)=
        api.getForecastWeather(latitude,longitude,units,"You-weather-key-here")


}