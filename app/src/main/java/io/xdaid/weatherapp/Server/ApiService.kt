package io.xdaid.weatherapp.Server

import io.xdaid.weatherapp.model.CityResponseApi_
import io.xdaid.weatherapp.model.CurrentResponseApi_
import io.xdaid.weatherapp.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Call<CurrentResponseApi_>

    @GET("data/2.5/forecast")
    fun getForecastWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Call<WeatherResponse>

    @GET("geo/1.0/direct")
    fun getCities(
        @Query("q") q: String,
        @Query("limit") limit: Int,
        @Query("appid") apiKey: String
    ): Call<CityResponseApi_>


}