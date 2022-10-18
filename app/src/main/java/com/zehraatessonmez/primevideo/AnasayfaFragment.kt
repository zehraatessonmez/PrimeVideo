package com.zehraatessonmez.primevideo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Scroller
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.zehraatessonmez.primevideo.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val sliderList = ArrayList<SlideModel>()


        sliderList.add(SlideModel(R.drawable.fleabag,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.theboys,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.goodomens,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.runs,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.upload,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.hanna,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.undone,ScaleTypes.FIT))
        sliderList.add(SlideModel(R.drawable.mrsmaisel,ScaleTypes.FIT))

        tasarim.imageSlider.setImageList(sliderList,ScaleTypes.FIT)


        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"The Report","thereport",2020,"Scott Z. Burns")
        val f2 = Filmler(3,"Good Omens","goodomens",2019,"Douglas Mackinnon")
        val f3 = Filmler(4,"7500","seven",2017,"Patrick Vollrath")
        val f4 = Filmler(5,"Upload","upload",2022,"Greg Daniels")

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)


        tasarim.rv.layoutManager = StaggeredGridLayoutManager(filmlerListesi.size,StaggeredGridLayoutManager.VERTICAL)

        val adapterFilm = FilmlerAdapter(requireContext(),filmlerListesi)

        tasarim.rv.adapter = adapterFilm

        val dizilerListesi = ArrayList<Diziler>()
        val d1 = Diziler(1,"The Boys","theboys",2018,"Matt Shakman")
        val d2 = Diziler(3,"Undone","undone",2022,"Hisko Hulsing")
        val d3 = Diziler(4,"Hanna","hanna",2019,"Joe Wright")
        val d4 = Diziler(5,"Fleabag","fleabag",2016,"Phoebe Waller-Bridge")

        dizilerListesi.add(d1)
        dizilerListesi.add(d2)
        dizilerListesi.add(d3)
        dizilerListesi.add(d4)

        tasarim.rvDizi.layoutManager = StaggeredGridLayoutManager(dizilerListesi.size,StaggeredGridLayoutManager.VERTICAL)

        val adapterDizi = DizilerAdapter(requireContext(),dizilerListesi)

        tasarim.rvDizi.adapter = adapterDizi



        return tasarim.root
    }


}