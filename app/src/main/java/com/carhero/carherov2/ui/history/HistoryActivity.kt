package com.carhero.carherov2.ui.history

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carhero.carherov2.R
import com.carhero.carherov2.base.BaseActivity
import com.carhero.carherov2.databinding.ActivityHistoryBinding
import com.carhero.carherov2.databinding.ActivityVehicleListBinding
import com.carhero.carherov2.ui.vehiclelist.VehicleListActivity
import com.carhero.carherov2.ui.vehiclelist.view.VehicleAdapter

class HistoryActivity : BaseActivity() {


    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, HistoryActivity::class.java)
        }
    }
    private lateinit var vehicleAdapter: VehicleAdapter

    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        initAdapter()
    }

    private fun initAdapter() {

    }
}