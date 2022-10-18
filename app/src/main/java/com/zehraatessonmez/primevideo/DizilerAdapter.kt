package com.zehraatessonmez.primevideo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zehraatessonmez.primevideo.databinding.CardTasarimBinding

class DizilerAdapter(var mContext: Context, var dizilerListesi:List<Diziler>)
    : RecyclerView.Adapter<DizilerAdapter.CardTasarimTutucu>() {

    //card tasarımı temsil eder
    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val dizi = dizilerListesi.get(position)
        val t = holder.tasarim
        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(dizi.diziResimAdi,"drawable",mContext.packageName))

    }


    override fun getItemCount(): Int {
        return dizilerListesi.size
    }
}