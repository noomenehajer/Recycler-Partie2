package com.example.tprecycle

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tprecycle.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.card_cell.*


class MainActivity : AppCompatActivity(),GovClickListener {

    lateinit var idFABAdd: FloatingActionButton
    private lateinit var binding: ActivityMainBinding
    private lateinit var MyAddapter: CardAdapter

    var Remove = false
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        idFABAdd = findViewById(R.id.idFABAdd)

        populateGOV()


        val mainActivity = this
        MyAddapter=  CardAdapter(GovList, mainActivity)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = MyAddapter

        idFABAdd.setOnClickListener {
            idFABAdd.isSelected != idFABAdd.isSelected
            Remove=!Remove
            if (Remove){

                idFABAdd.setImageResource(R.drawable.ic_delete)
            }
        }
        }

    }



    override fun onClick(Gov: Gov)
    {
        if (Remove){
            GovList.remove(Gov)
            MyAddapter.notifyDataSetChanged()
        }else {
            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra(GOV_ID_EXTRA, Gov.id)
            startActivity(intent)
        }
    }

    private fun populateGOV() {
        val ariana = Gov(
            R.drawable.ariana,
            "Ariana",
            1
        )
        GovList.add(ariana)

        val beja = Gov(
            R.drawable.beja,
            "Béja",
            2
        )
        GovList.add(beja)

        val ben_arous = Gov(
            R.drawable.ben_arous,
            "Ben Arous",
            3
        )
        GovList.add(ben_arous)

        val bizerte = Gov(
            R.drawable.bizerte,
            "Bizerte",
            4
        )
        GovList.add(bizerte)

        val bouzid = Gov(
            R.drawable.bouzid,
            "Sidi Bouzid",
            5
        )
        GovList.add(bouzid)

        val gabes = Gov(
            R.drawable.gabes,
            "Gabès",
            6
        )
        GovList.add(bouzid)

        val gafsa = Gov(
            R.drawable.gafsa,
            "Gafsa",
            7
        )
        GovList.add(gafsa)

        val jendouba = Gov(
            R.drawable.jendouba,
            "Jendouba",
            8
        )
        GovList.add(jendouba)

        val kairaoune = Gov(
            R.drawable.kairaoune,
            "Kairouan",
            9
        )
        GovList.add(kairaoune)

        val kasserine = Gov(
            R.drawable.kasserine,
            "Kasserine",
            10
        )
        GovList.add(kasserine)

        val kebili = Gov(
            R.drawable.kebili,
            "Kébili",
            11
        )
        GovList.add(kebili)

        val kef = Gov(
            R.drawable.kef,
            "kef",
            12
        )
        GovList.add(kef)

        val mahdia = Gov(
            R.drawable.mahdia,
            "Mahdia",
            13
        )
        GovList.add(mahdia)

        val manouba = Gov(
            R.drawable.manouba,
            "Manouba",
            14
        )
        GovList.add(manouba)

        val mednine = Gov(
            R.drawable.mednine,
            "Médenine",
            15
        )
        GovList.add(mednine)

        val monastir = Gov(
            R.drawable.monastir,
            "Monastir",
            16
        )
        GovList.add(monastir)

        val nabel = Gov(
            R.drawable.nabel,
            "Nabeul",
            17
        )
        GovList.add(nabel)


        val sfax = Gov(
            R.drawable.sfax,
            "Sfax",
            18
        )
        GovList.add(sfax)

        val siliana = Gov(
            R.drawable.siliana,
            " Siliana",
            19
        )
        GovList.add(siliana)


        val souse = Gov(
            R.drawable.souse,
            "Sousse",
            20
        )
        GovList.add(souse)


        val tatouine = Gov(
            R.drawable.tataouine,
            "tatouine",
            21
        )
        GovList.add(tatouine)

        val tounes = Gov(
            R.drawable.tounes,
            "Tunis",
            22
        )
        GovList.add(tounes)

        val tozer = Gov(
            R.drawable.tozer,
            "Tozeur",
            23
        )
        GovList.add(tozer)

        val zaghoune = Gov(
            R.drawable.zaghoune,
            "Zaghouan",
            24
        )

    }


}