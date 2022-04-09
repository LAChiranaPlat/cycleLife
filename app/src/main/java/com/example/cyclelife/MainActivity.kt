package com.example.cyclelife

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.TextView
import com.example.cyclelife.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var actividad:ActivityMainBinding
    lateinit var boxUser:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        actividad= ActivityMainBinding.inflate(layoutInflater)

        setContentView(actividad.root)

        val button=actividad.btnSaludo

        registerForContextMenu(button)


        boxUser=actividad.tilUser

        actividad.face.setOnClickListener{

            startActivity(packageManager.getLaunchIntentForPackage("com.facebook.katana"))

        }

        actividad.whats.setOnClickListener{

            startActivity(packageManager.getLaunchIntentForPackage("com.whatsapp"))

        }

        actividad.inst.setOnClickListener{

            startActivity(packageManager.getLaunchIntentForPackage("com.instagram.android"))

        }

        actividad.tt.setOnClickListener{

            startActivity(packageManager.getLaunchIntentForPackage("com.google.android.youtube"))

        }



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflador:MenuInflater=menuInflater
        inflador.inflate(R.menu.menumain,menu)

        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.a->{
                Log.i("result","Lanzando Facebook")
                return true
            }

            R.id.b->{
                Log.i("result","Lanzando Twitter")
                return true
            }

            R.id.c->{
                Log.i("result","Lanzando Whatsapp")
                return true
            }

            R.id.d->{
                Log.i("result","Estableciendo seguridad...")
                return true
            }

            R.id.e->{
                Log.i("result","Cerrando...")
                return true
            }
            else->super.onOptionsItemSelected(item)

        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?,
    ) {
        val inflador=menuInflater
        inflador.inflate(R.menu.menumain,menu)

        super.onCreateContextMenu(menu, v, menuInfo)
    }


    fun saludar(x: View){

        startActivity( Intent(this,system::class.java).apply {

            putExtra("usuario","Alexander")

        })

    }


}