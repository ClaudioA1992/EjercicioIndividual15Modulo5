package cl.awakelab.ejercicioindividual15modulo5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.ejercicioindividual15modulo5.databinding.ItemBinding

/*
* [x] Implementar clase Adapter
* [x] Heredar RecyclerView.Adapter
* [x] Creaciones de los métodos: onCreateViewHolder, getItemCount, onBindViewHolder
* [x] Crear clase ViewHolder (hereda de clase RecyclerView.ViewHolder)
* [x] Agregar constructor
* [x] Crear objeto de lista de datos, como data class
* [x] Crear lista
* [x] Asignar tamaño de la lista en getItemCount
* [x] Definir binding class del item
* [x] Cambiar view por ItemBinding (o el nombre que tenga el layout de items que contiene el recyclerView)
* */

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {


    var listaDeDatos =  mutableListOf<Pokemon>();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listaDeDatos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaDeDatos[position]
        holder.bind(item, position)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.listaDeDatos = pokedex.toMutableList()
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pokemon: Pokemon, position: Int) {
            binding.textViewName.text = pokemon.nombre
            binding.textViewType.text = pokemon.tipo
            binding.textViewNumber.text = (position+1).toString() + ".-"
        }

    }

}

