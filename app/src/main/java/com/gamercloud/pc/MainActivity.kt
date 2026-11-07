package com.gamercloud.pc

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val layout = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                setPadding(32, 32, 32, 32)
                setBackgroundColor(Color.rgb(10, 20, 42))
            }

            val title = TextView(this).apply {
                text = "GAMER CLOUD PC"
                textSize = 28f
                setTextColor(Color.WHITE)
                gravity = Gravity.CENTER
            }

            val subtitle = TextView(this).apply {
                text = "YOUR GAMING PC IN THE CLOUD"
                textSize = 14f
                setTextColor(Color.rgb(120, 190, 255))
                gravity = Gravity.CENTER
            }

            val status = TextView(this).apply {
                text = "PC VIRTUAL: APAGADA"
                textSize = 18f
                setTextColor(Color.LTGRAY)
                gravity = Gravity.CENTER
                setPadding(0, 45, 0, 25)
            }

            val button = Button(this).apply {
                text = "ENCENDER MI PC"
                setOnClickListener {
                    status.text = "DEMO: PC VIRTUAL PREPARADA"
                }
            }

            val storage = TextView(this).apply {
                text = "ALMACENAMIENTO: 100 GB"
                textSize = 15f
                setTextColor(Color.WHITE)
                gravity = Gravity.CENTER
                setPadding(0, 35, 0, 0)
            }

            layout.addView(title)
            layout.addView(subtitle)
            layout.addView(status)
            layout.addView(button)
            layout.addView(storage)

            setContentView(layout)

        } catch (e: Exception) {
            android.util.Log.e(
                "GamerCloudPC",
                "Error al iniciar la aplicación",
                e
            )
            throw e
        }
    }
}