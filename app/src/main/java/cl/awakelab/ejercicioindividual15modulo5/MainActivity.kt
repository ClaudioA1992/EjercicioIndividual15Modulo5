package cl.awakelab.ejercicioindividual15modulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelab.ejercicioindividual15modulo5.databinding.ActivityMainBinding

/* Pasos para crear un recycler view
* [x] Adapter + View Holder
* [x] Agregar constraints de layouts
* [x] Cambiar altura de constraints layout de item layout a wrap content
* [x] Definir ids
* [x] Item layout
* [x] Recycler view
* [x] Asignar layout manager
* [x] Obtener los datos
* */

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.recyclerView.adapter = adapter
    }

}