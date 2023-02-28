package com.example.v20

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.v20.databinding.ActivityMainBinding
import com.example.v20.databinding.CustomDialogueBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var binding1: CustomDialogueBinding
    //creating a variable of type dialog
    private lateinit var dialog: Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setting binding for custom dialog box
        //---------------------------------------
        binding1 = CustomDialogueBinding.inflate(layoutInflater)

        //setting variable dialog
        dialog = Dialog(this@MainActivity)
        /*
        dialog.setContentView(R.layout.custom_dialogue)
        * if not using view binding can use this
        *
        * */
        dialog.setContentView(binding1.root)
//        setting our custom Background Present in drawalbe
        dialog.window?.setBackgroundDrawableResource(R.drawable.bg_alert_box)




        //setting button action
        binding.btn1.setOnClickListener {
            dialog.show()
        }

        binding1.btnGood.setOnClickListener {
            dialog.dismiss()
        }

        binding1.btnFeedback.setOnClickListener {
            Toast.makeText(this@MainActivity, "Will add Later", Toast.LENGTH_SHORT).show()
        }
    }
}