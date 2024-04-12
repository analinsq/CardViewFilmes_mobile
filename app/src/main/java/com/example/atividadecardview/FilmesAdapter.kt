package com.example.atividadecardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmesAdapter(private val filmesList: List<Filmes>) :
    RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {

    inner class FilmesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFilmes: ImageView = itemView.findViewById(R.id.imageFilmes)
        val textTitle: TextView = itemView.findViewById(R.id.textTitulo)
        val textDescription: TextView = itemView.findViewById(R.id.textDescricao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filmes, parent, false)
        return FilmesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FilmesViewHolder, position: Int) {
        val currentItem = filmesList[position]

        holder.imageFilmes.setImageResource(currentItem.imageResourceId)
        holder.textTitle.text = currentItem.titulo
        holder.textDescription.text = currentItem.descricao
    }

    override fun getItemCount() = filmesList.size
}
