package medina.diana.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_Peliculas()
        var adapter=AdaptadorMovies(this,peliculas)
        var listview: ListView=findViewById(R.id.listV)
        listview.adapter=adapter
    }

    fun llenar_Peliculas(){
        val pelicula1=Pelicula(1,getString(R.string.peli1), getString(R.string.peli1_desc),120,R.drawable.suits)
        peliculas.add(pelicula1)

        val pelicula2=Pelicula(2,getString(R.string.peli2), getString(R.string.peli2_desc),90,R.drawable.leapyear)
        peliculas.add(pelicula2)

        val pelicula3=Pelicula(3,getString(R.string.peli3), getString(R.string.peli3_desc),110,R.drawable.mib)
        peliculas.add(pelicula3)

        val pelicula4=Pelicula(4,getString(R.string.peli4), getString(R.string.peli4_desc),95,R.drawable.smallville)
        peliculas.add(pelicula4)

        val pelicula5=Pelicula(5,getString(R.string.peli5), getString(R.string.peli5_desc),105,R.drawable.toystory)
        peliculas.add(pelicula5)
    }
}