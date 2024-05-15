package io.xdaid.weatherapp.Activity

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import io.xdaid.weatherapp.Adapter.CityAdapter
import io.xdaid.weatherapp.R
import io.xdaid.weatherapp.ViewModel.CityViewModel
import io.xdaid.weatherapp.databinding.ActivityCityListBinding
import io.xdaid.weatherapp.databinding.ActivityMainBinding
import io.xdaid.weatherapp.model.CityResponseApi_
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CityListActivity : AppCompatActivity() {

    lateinit var binding: ActivityCityListBinding
    private val cityAdapter by lazy { CityAdapter() }
    private val cityViewModel: CityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.apply {
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            statusBarColor = Color.TRANSPARENT
        }

        binding.apply {
            CityEdit.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }



                override fun afterTextChanged(s: Editable?) {

                    progressBar2.visibility = View.VISIBLE
                    cityViewModel.loadCity(s.toString(),10)
                        .enqueue(object :Callback<CityResponseApi_> {
                        override fun onResponse(
                            call: Call<CityResponseApi_>,
                            response: Response<CityResponseApi_>
                        ) {

                            if (response.isSuccessful){
                                val data=response.body()
                                data?.let {
                                    progressBar2.visibility = View.GONE
                                    cityAdapter.differ.submitList(it)
                                    cityView.apply {
                                        layoutManager=LinearLayoutManager(
                                            this@CityListActivity,
                                            LinearLayoutManager.HORIZONTAL,
                                            false
                                        )
                                        adapter = cityAdapter
                                    }
                                }
                            }

                        }

                        override fun onFailure(call: Call<CityResponseApi_>, t: Throwable) {

                        }

                    })

                }
            })

        }
    }
}