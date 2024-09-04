package com.carhero.carherov2.ui.home

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.R
import com.carhero.carherov2.databinding.ActivityHomeBinding
import com.carhero.carherov2.databinding.ActivityLoginBinding
import com.carhero.carherov2.ui.home.model.FeaturedInfo
import com.carhero.carherov2.ui.home.view.FeaturedAdapter
import com.carhero.carherov2.ui.addvehicle.AddVehicleActivity

class HomeActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }

    private lateinit var binding: ActivityHomeBinding
    private lateinit var featuredAdapter: FeaturedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = Color.parseColor("#027DFF")
        window.decorView.systemUiVisibility = 0
        initUI()
    }

    private fun initUI() {
        initAdapter()
        binding.llAddVehicle.setOnClickListener {
            startActivity(AddVehicleActivity.getIntent(this))
        }
    }

    private fun initAdapter() {
        val listOfFeature = arrayListOf<FeaturedInfo>()
        listOfFeature.add(FeaturedInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(FeaturedInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(FeaturedInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(FeaturedInfo(0,"ree","fewf","dewdew"))
        featuredAdapter = FeaturedAdapter(this)
        binding.rvFeatured.apply {
            adapter = featuredAdapter
            layoutManager = LinearLayoutManager(this@HomeActivity,RecyclerView.HORIZONTAL,false)
        }
        featuredAdapter.listOfDataItems = listOfFeature
    }
}