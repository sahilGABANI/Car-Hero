package com.carhero.carherov2.ui.carwash.selectvehicle.view

import android.content.Context
import android.view.View
import com.carhero.carherov2.R
import com.carhero.carherov2.base.ConstraintLayoutWithLifecycle
import com.carhero.carherov2.databinding.ViewFeaturedBinding
import com.carhero.carherov2.ui.vehiclelist.model.VehicleDetailsInfo

class SelectYourVehicleViewItem(context: Context) : ConstraintLayoutWithLifecycle(context) {
    private lateinit var dataVideo: VehicleDetailsInfo
    private var binding: ViewFeaturedBinding? = null
    init {
        inflateUi()
    }

    private fun inflateUi() {
        val view = View.inflate(context, R.layout.view_featured, this)
        layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        binding = ViewFeaturedBinding.bind(view)

        binding?.apply {

        }
    }

    fun bind(dataVideo: VehicleDetailsInfo) {
        this.dataVideo = dataVideo
    }
}