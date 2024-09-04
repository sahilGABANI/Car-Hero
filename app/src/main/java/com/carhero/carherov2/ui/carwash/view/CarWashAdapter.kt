package com.carhero.carherov2.ui.carwash.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.ui.carwash.model.CarWashDetailsInfo
import com.carhero.carherov2.ui.vehiclelist.model.VehicleDetailsInfo

class CarWashAdapter(
    private val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var adapterItems = listOf<AdapterItem>()

    var listOfDataItems: List<CarWashDetailsInfo>? = null
        set(listOfReelsInfo) {
            field = listOfReelsInfo
            updateAdapterItems()
        }

    @SuppressLint("NotifyDataSetChanged")
    @Synchronized
    private fun updateAdapterItems() {
        val adapterItems = mutableListOf<AdapterItem>()

        listOfDataItems?.forEach {
            adapterItems.add(AdapterItem.CarWashViewItem(it))
        }

        this.adapterItems = adapterItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ViewType.CarWashViewItemType.ordinal -> {
                CarWashAdapterViewHolder(CarWashViewItem(context).apply {

                })
            }
            else -> throw IllegalArgumentException("Unsupported ViewType")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val adapterItem = adapterItems.getOrNull(position) ?: return
        when (adapterItem) {
            is AdapterItem.CarWashViewItem -> {
                (holder.itemView as CarWashViewItem).bind(
                    adapterItem.dataVideo,
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return adapterItems.size
    }

    override fun getItemViewType(position: Int): Int {
        return adapterItems[position].type
    }

    private class CarWashAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)

    sealed class AdapterItem(val type: Int) {
        data class CarWashViewItem(var dataVideo: CarWashDetailsInfo) :
            AdapterItem(ViewType.CarWashViewItemType.ordinal)
    }

    private enum class ViewType {
        CarWashViewItemType
    }
}