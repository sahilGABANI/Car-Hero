package com.carhero.carherov2.ui.carwash

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.R
import com.carhero.carherov2.base.BaseActivity
import com.carhero.carherov2.databinding.ActivityAddVehicleBinding
import com.carhero.carherov2.databinding.ActivityCarwashListBinding
import com.carhero.carherov2.ui.carwash.model.CarWashDetailsInfo
import com.carhero.carherov2.ui.carwash.view.CarWashAdapter
import com.carhero.carherov2.ui.vehiclelist.VehicleListActivity
import com.carhero.carherov2.ui.vehiclelist.model.VehicleDetailsInfo
import com.carhero.carherov2.ui.vehiclelist.view.VehicleAdapter

class CarWashListActivity : BaseActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, CarWashListActivity::class.java)
        }
    }

    private lateinit var carWashAdapter: CarWashAdapter

    private lateinit var binding: ActivityCarwashListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityCarwashListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initAdapter()

    }

    private fun initAdapter() {
        val listOfFeature = arrayListOf<CarWashDetailsInfo>()
        listOfFeature.add(CarWashDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(CarWashDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(CarWashDetailsInfo(0,"ree","fewf","dewdew"))
        listOfFeature.add(CarWashDetailsInfo(0,"ree","fewf","dewdew"))
        carWashAdapter = CarWashAdapter(this)
        binding.rvCarWashList.apply {
            layoutManager = LinearLayoutManager(this@CarWashListActivity,RecyclerView.VERTICAL,false)
            adapter = carWashAdapter
        }
        carWashAdapter.listOfDataItems = listOfFeature
    }
}