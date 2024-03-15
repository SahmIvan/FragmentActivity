package com.example.fragmenrpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.util.Log
import com.example.fragmenrpractice.fragments.CategoryFragment
import com.example.fragmenrpractice.fragments.HomeFragment
import com.example.fragmenrpractice.fragments.Buy
import com.example.fragmenrpractice.fragments.Carrito


class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavbar : BottomNavigationView
    private var MainActivityTag = "MENU_ITEM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Se crea un fragmento de inicio
        bottomNavbar = findViewById(R.id.button_nav_menu)
//        Se le asigna un listener al bottomNavigationView
        bottomNavbar.setOnItemSelectedListener { menuItem ->
//            Se le asigna un listener al bottomNavigationView
            when(menuItem.itemId){
//                Se le asigna un listener al bottomNavigationView para llevar al fragmento de inicio
                R.id.home_menu -> {
                    Log.i(MainActivityTag,"Home Seleccionado")
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit()
                }
//                Lleva al fragmento de categorías
                R.id.category_menu -> {
                    Log.i(MainActivityTag, "Categorias Seleccionadas")
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, categoryFragment).commit()

                }
//                Lleva al fragmento de compras
                R.id.buy_menu -> {
                    Log.i(MainActivityTag, "Comprar Seleccionadas")
                    val carritoContainer = Buy()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, carritoContainer).commit()

                }
//                Lleva al fragmento de carrito
                R.id.carrito_menu -> {
                    Log.i(MainActivityTag, "Carrito Seleccionadas")
                    val buyContainer = Carrito()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,buyContainer).commit()

                }
            }
                true
        }
    }

}