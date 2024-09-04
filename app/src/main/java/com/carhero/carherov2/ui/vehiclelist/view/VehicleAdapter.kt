package com.carhero.carherov2.ui.vehiclelist.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.ui.carwash.view.VehicleViewItem
import com.carhero.carherov2.ui.vehiclelist.model.VehicleDetailsInfo

class VehicleAdapter(
    private val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var adapterItems = listOf<AdapterItem>()

    var listOfDataItems: List<VehicleDetailsInfo>? = null
        set(listOfReelsInfo) {
            field = listOfReelsInfo
            updateAdapterItems()
        }

    @SuppressLint("NotifyDataSetChanged")
    @Synchronized
    private fun updateAdapterItems() {
        val adapterItems = mutableListOf<AdapterItem>()

        listOfDataItems?.forEach {
            adapterItems.add(AdapterItem.HomePostViewItem(it))
        }

        this.adapterItems = adapterItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ViewType.VehicleViewItemType.ordinal -> {
                VehicleAdapterViewHolder(VehicleViewItem(context).apply {

                })
            }
            else -> throw IllegalArgumentException("Unsupported ViewType")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val adapterItem = adapterItems.getOrNull(position) ?: return
        when (adapterItem) {
            is AdapterItem.HomePostViewItem -> {
                (holder.itemView as VehicleViewItem).bind(
                    adapterItem.dataVideo,
                )
            }
            else  -> {

            }
        }
    }

    override fun getItemCount(): Int {
        return adapterItems.size
    }

    override fun getItemViewType(position: Int): Int {
        return adapterItems[position].type
    }

    private class VehicleAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)

    sealed class AdapterItem(val type: Int) {
        data class HomePostViewItem(var dataVideo: VehicleDetailsInfo) :
            AdapterItem(ViewType.VehicleViewItemType.ordinal)
    }

    private enum class ViewType {
        VehicleViewItemType
    }
}