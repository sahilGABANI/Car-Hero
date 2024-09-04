package com.carhero.carherov2.ui.home.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carhero.carherov2.ui.home.model.FeaturedInfo

class FeaturedAdapter(
    private val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var adapterItems = listOf<AdapterItem>()

    var listOfDataItems: List<FeaturedInfo>? = null
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
            ViewType.FeaturedViewItemType.ordinal -> {
                FeaturedAdapterViewHolder(FeaturedViewItem(context).apply {

                })
            }
            else -> throw IllegalArgumentException("Unsupported ViewType")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val adapterItem = adapterItems.getOrNull(position) ?: return
        when (adapterItem) {
            is AdapterItem.HomePostViewItem -> {
                (holder.itemView as FeaturedViewItem).bind(
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

    private class FeaturedAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)

    sealed class AdapterItem(val type: Int) {
        data class HomePostViewItem(var dataVideo: FeaturedInfo) :
            AdapterItem(ViewType.FeaturedViewItemType.ordinal)
    }

    private enum class ViewType {
        FeaturedViewItemType
    }
}