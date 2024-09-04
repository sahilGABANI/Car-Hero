package com.carhero.carherov2.ui.addvehicle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carhero.carherov2.R
import com.carhero.carherov2.base.BaseActivity
import com.carhero.carherov2.base.extension.subscribeAndObserveOnMainThread
import com.carhero.carherov2.base.extension.throttleClicks
import com.carhero.carherov2.databinding.ActivityAddVehicleBinding
import com.carhero.carherov2.databinding.ActivityHomeBinding
import com.carhero.carherov2.ui.addvehicle.selectvehiclebottomsheet.SelectVehicleBottomSheet
import com.carhero.carherov2.ui.vehiclelist.VehicleListActivity

class AddVehicleActivity : BaseActivity() {


    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, AddVehicleActivity::class.java)
        }
    }

    private lateinit var binding: ActivityAddVehicleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityAddVehicleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        binding.edtSelectVehicleType.throttleClicks().subscribeAndObserveOnMainThread {
            openSelectVehicleType()
        }.autoDispose()
        binding.btnAddVehicle.throttleClicks().subscribeAndObserveOnMainThread {
            startActivity(VehicleListActivity.getIntent(this))
        }.autoDispose()
    }

    private fun openSelectVehicleType() {
        val selectVehicleBottomSheet = SelectVehicleBottomSheet.newInstance()
        selectVehicleBottomSheet.show(supportFragmentManager,SelectVehicleBottomSheet::class.java.name)
    }
}