package io.xdaid.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import io.xdaid.weatherapp.Repository.CityRepository
import io.xdaid.weatherapp.Server.ApiClient
import io.xdaid.weatherapp.Server.ApiService
import retrofit2.create

class CityViewModel(val repository: CityRepository) :ViewModel(){
    constructor():this(CityRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCity(q:String,limit:Int)=
        repository.getCities(q,limit)
}