package medina.diana.peliculas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorMovies:BaseAdapter {
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, pelis:ArrayList<Pelicula>){
        this.context=context
        this.peliculas=pelis
    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador=LayoutInflater.from(context)
        val vista=inflador.inflate(R.layout.pelicula_view,null)

        var image: ImageView=vista.findViewById(R.id.ivImg)
        var titulo: TextView=vista.findViewById(R.id.tv_nombre)

        var pelicula:Pelicula=peliculas[p0]
        image.setImageResource(pelicula.img)
        titulo.setText(pelicula.nombre)
        return vista

    }
}