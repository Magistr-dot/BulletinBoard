package com.frigate.bulletinboard

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.frigate.bulletinboard.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()

    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout,
            binding.toolbarLayout.toolbar, R.string.open, R.string.close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.my_ads -> {
                Toast.makeText(this, "press ${item.itemId}", Toast.LENGTH_SHORT).show()
            }
            R.id.car -> {}
            R.id.pc -> {}
            R.id.sp -> {}
            R.id.sign_up -> {}
            R.id.sign_in -> {}
            R.id.sign_out -> {}
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}