package io.xdaid.weatherapp.Adapter

import android.content.Intent
import android.icu.util.Calendar
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.xdaid.weatherapp.Activity.MainActivity
import io.xdaid.weatherapp.databinding.CityViewHolderBinding
import io.xdaid.weatherapp.databinding.ForecastViewholderBinding
import io.xdaid.weatherapp.model.CityResponseApi_
import io.xdaid.weatherapp.model.WeatherResponse
import java.text.SimpleDateFormat

class CityAdapter: RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    private lateinit var binding: CityViewHolderBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        binding = CityViewHolderBinding.inflate(inflater,parent,false)
        return ViewHolder()

    }

    override fun onBindViewHolder(holder: CityAdapter.ViewHolder, position: Int) {
        val binding = CityViewHolderBinding.bind(holder.itemView)
        binding.CityTxt.text = differ.currentList[position].name
        binding.root.setOnClickListener {
            val intent = Intent(binding.root.context, MainActivity::class.java)
            intent.putExtra("lat", differ.currentList[position].lat)
            intent.putExtra("lon", differ.currentList[position].lon)
            intent.putExtra("name", differ.currentList[position].name)
            binding.root.context.startActivity(intent)
        }

    }

    inner class ViewHolder:RecyclerView.ViewHolder(binding.root)

    override fun getItemCount()=differ.currentList.size

    private val  differCallback = object :DiffUtil.ItemCallback<CityResponseApi_.CityResponseApi_Item>(){
        override fun areItemsTheSame(
            oldItem: CityResponseApi_.CityResponseApi_Item,
            newItem: CityResponseApi_.CityResponseApi_Item
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: CityResponseApi_.CityResponseApi_Item,
            newItem: CityResponseApi_.CityResponseApi_Item
        ): Boolean {
            return oldItem == newItem
        }

    }
   val differ = AsyncListDiffer(this, differCallback)

}