package com.cursoandroid.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var textToSpeach: TextToSpeech? = null//Variable global de tipo TextToSpeech ?: que puede llegar a tener valor null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//res/layout/activity_main

        textToSpeach = TextToSpeech(this, this);

        //TODO: Vincular una vista a una actividad (poner en la vista: android:id="@+id/name")

        findViewById<Button>(R.id.btnPlay).setOnClickListener{speak()};//evento click



    }

    private fun speak (){
        //tipo de componente y como parametro su id
        var message: String = findViewById<TextView>(R.id.TextBoxMessage).text.toString();
        Log.i("Message TextView", message)

        if(!message.isEmpty()){
            findViewById<TextView>(R.id.textView).text = "Listo!"
        }else {
            findViewById<TextView>(R.id.textView).text = "Introduzca un texto";
            message = "Por la gran puta";
        }

        textToSpeach!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "");//utilizamos el textToSpeach
        // TODO: !! significa que no lleva un valor null al momento de llamar al metodo
    }

    override fun onInit(status: Int) {
        if(status == TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.textView).text = "Listo!";
            textToSpeach!!.setLanguage(Locale("ES"));//significa que no lleva un valor null al momento de llamar al metodo
        } else {
            findViewById<TextView>(R.id.textView).text = "No disponible :(";
        }
    }

    override fun onDestroy() {

        if(textToSpeach != null){
            textToSpeach!!.stop();
            textToSpeach!!.shutdown();
        }
        super.onDestroy();
    }
}