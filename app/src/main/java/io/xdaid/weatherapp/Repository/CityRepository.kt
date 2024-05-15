package io.xdaid.weatherapp.Repository

import io.xdaid.weatherapp.Server.ApiService

class CityRepository(val api:ApiService) {
    fun getCities(q:String, limit:Int) =
        api.getCities(q, limit,"You-weather-key-here")
}