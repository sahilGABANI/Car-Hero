package com.carhero.carherov2.ui.vehiclelist.confirmationBottomSheet

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carhero.carherov2.R
import com.carhero.carherov2.base.BaseBottomSheetDialogFragment
import com.carhero.carherov2.base.extension.subscribeAndObserveOnMainThread
import com.carhero.carherov2.base.extension.throttleClicks
import com.carhero.carherov2.databinding.FragmentConfirmationBottomSheetBinding
import com.carhero.carherov2.databinding.FragmentDeleteVehicleBottomSheetBinding
import com.carhero.carherov2.ui.vehiclelist.deletevehicle.DeleteVehicleBottomSheet
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ConfirmationBottomSheet  : BaseBottomSheetDialogFragment() {

    private var _binding: FragmentConfirmationBottomSheetBinding? = null
    private val binding get() = _binding!!
    companion object {
        fun newInstance(
        ): ConfirmationBottomSheet {
            return ConfirmationBottomSheet()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BSDialogThemeRegular)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConfirmationBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomSheet = (view.parent as View)
        bottomSheet.backgroundTintMode = PorterDuff.Mode.CLEAR
        bottomSheet.setBackgroundColor(Color.TRANSPARENT)

        dialog?.apply {
            val behavior: BottomSheetBehavior<*> = BottomSheetBehavior.from(bottomSheet)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
            behavior.peekHeight = 0
            behavior.isHideable
            behavior.addBottomSheetCallback(mBottomSheetBehaviorCallback)
        }

        initUI()
    }

    private fun initUI() {
        binding.deleteButton.throttleClicks().subscribeAndObserveOnMainThread {
            dismiss()
        }.autoDispose()

        binding.cancelButton.throttleClicks().subscribeAndObserveOnMainThread {
            dismiss()
        }.autoDispose()
    }



    private val mBottomSheetBehaviorCallback: BottomSheetBehavior.BottomSheetCallback =
        object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED || newState == BottomSheetBehavior.STATE_HIDDEN) {
                    dismiss()
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {}
        }



}