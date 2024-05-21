package com.example.reservamesa.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reservamesa.databinding.AdapterMesasBinding
import com.example.reservamesa.model.Mesa

class MesasAdapter (var mesas: MutableList<Mesa>): RecyclerView.Adapter<MesasAdapter.MesaHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MesaHolder {
        AdapterMesasBinding.inflate(LayoutInflater.from(parent.context), parent, false).run {
            return MesaHolder(this)
        }
    }

    override fun onBindViewHolder(holder: MesaHolder, position: Int) {
        mesas[position].run {
//            holder.binding.txtName.text = this.name
//            holder.binding.txtPeople.text = this.people.toString()
        }
    }

    override fun getItemCount(): Int = mesas.size

    inner class MesaHolder(val binding: AdapterMesasBinding):
        RecyclerView.ViewHolder(binding.root)
}