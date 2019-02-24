package com.example.navigatebetweenactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonSend.setOnClickListener {
            val message: String = editTextMsg.text.toString()

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_msg", message)
            startActivity(intent)
        }
            buttonShare.setOnClickListener {
                val intent  = Intent ()

                val message:String = editTextMsg.text.toString()

                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                startActivity(Intent.createChooser(intent,"Share To : "))
            }


            buttonRecyclerView.setOnClickListener {

                val intent = Intent(this,HobbiesActivity::class.java)
                startActivity(intent)
            }

    }
}
