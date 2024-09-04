package com.carhero.carherov2.ui.vehiclelist

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.R
import com.carhero.carherov2.base.BaseActivity
import com.carhero.carherov2.base.extension.subscribeAndObserveOnMainThread
import com.carhero.carherov2.base.extension.throttleClicks
import com.carhero.carherov2.databinding.ActivityAddVehicleBinding
import com.carhero.carherov2.databinding.ActivityVehicleListBinding
import com.carhero.carherov2.ui.addvehicle.AddVehicleActivity
import com.carhero.carherov2.ui.home.model.FeaturedInfo
import com.carhero.carherov2.ui.vehiclelist.model.VehicleDetailsInfo
import com.carhero.carherov2.ui.vehiclelist.view.VehicleAdapter

class VehicleListActivity : BaseActivity() {


    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, VehicleListActivity::class.java)
        }
    }
    private lateinit var vehicleAdapter: VehicleAdapter

    private lateinit var binding: ActivityVehicleListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityVehicleListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initAdapter()
        binding.btnAddVehicle.throttleClicks().subscribeAndObserveOnMainThread {
            startActivity(AddVehicleActivity.getIntent(this))
        }.autoDispose()
    }

    private fun initAdapter() {
        val listOfFeature = arrayListOf<VehicleDetailsInfo>()
        listOfFeature.add(VehicleDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(VehicleDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(VehicleDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(VehicleDetailsInfo(0,"ree","fewf","dewdew"))
        vehicleAdapter = VehicleAdapter(this)
        binding.rvVehicleList.apply {
            layoutManager = LinearLayoutManager(this@VehicleListActivity,RecyclerView.VERTICAL,false)
            adapter = vehicleAdapter
        }
        vehicleAdapter.listOfDataItems = listOfFeature
    }
}