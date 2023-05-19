package com.farhanalfarizi.rycyclereview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.farhanalfarizi.rycyclereview.databinding.ListItemPemainBinding
import com.farhanalfarizi.rycyclereview.model.Pemain
import java.text.FieldPosition

class AdapterTeamBola (private val context : Context,
                        private var data : List<Pemain>?,
                        private val itemclick : OnclickListener)
                : RecyclerView.Adapter<AdapterTeamBola.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListItemPemainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.foto.setImageResource(item?.foto ?: 0)
        holder.nama.text = item?.nama

        holder.itemView.setOnClickListener {
            itemclick.detailData(item)
        }
     }
        override fun getItemCount(): Int = data?.size ?: 0

        inner class ViewHolder(val binding: ListItemPemainBinding) :
            RecyclerView.ViewHolder(binding.root) {
            var foto = binding.image
            var nama = binding.txtnama
        }

        interface OnclickListener {
            fun detailData(item: Pemain?)

        }
    }
