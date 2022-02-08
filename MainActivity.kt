package com.example.test

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"example toast",Toast.LENGTH_LONG).show()
        binding.alertBtn.setOnClickListener {
                val dialogBuilder = AlertDialog.Builder(this)


                dialogBuilder.setMessage("Do you want to close this application ?")
                    .setCancelable(false)
                    .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                            _, _ -> finish()
                    })
                    .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                            dialog, _ -> dialog.cancel()
                    })

                val alert = dialogBuilder.create()
                alert.setTitle("AlertDialogExample")
                alert.show()
            }

    connector()
    }

    private fun connector() {

        binding.moveBtn.setOnClickListener {
            moveToSecondPage()
        }

    }
    private fun moveToSecondPage() {
        val objectIntent= Intent(this, secondactivity::class.java)
        startActivity(objectIntent)
    }


}
