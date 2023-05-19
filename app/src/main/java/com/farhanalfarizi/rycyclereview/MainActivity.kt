package com.farhanalfarizi.rycyclereview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanalfarizi.rycyclereview.adapter.AdapterTeamBola
import com.farhanalfarizi.rycyclereview.databinding.ActivityMainBinding
import com.farhanalfarizi.rycyclereview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listpemain = ArrayList<Pemain>()
        listpemain.add(Pemain(nama = "Thibaut Courtois", R.drawable.courtois,"Penjaga Gawang","2.00 m","Bree(Belgia)","11 Mei 1992"))
        listpemain.add(Pemain(nama = "Karim Benzema", R.drawable.benzema,"Penyerang","1,85 m","Lyon (Perancis)","19 Desember 1987"))
        listpemain.add(Pemain(nama = "Marcelo Vieira da Silva", R.drawable.marcello,"Belakang","1,74 m","Rio de Janeiro (Brasil)","12 Mei 1988"))
        listpemain.add(Pemain(nama = "Sergio Ramos García", R.drawable.ramos,"Belakang","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        listpemain.add(Pemain(nama = "Zinedine Yazid Zidane", R.drawable.zidan,"Belakang","1,85 m","Marseille (Prancis))","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola (this,listpemain,object : AdapterTeamBola.OnclickListener{
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })
    }
}