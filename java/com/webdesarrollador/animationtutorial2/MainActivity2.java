package com.webdesarrollador.animationtutorial2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button boton = (Button) findViewById(R.id.boton);
        Animation animation_boton = AnimationUtils.loadAnimation(this, R.anim.animation_tween);
        boton.startAnimation(animation_boton);
    }
    //Vamos a la actividad donde tenemos la animación por frames
    public void goToFrame(View view) {
        finish();
    }
    //Muestro mensaje al pulsar el boton con id=boton
    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), "Hola", Toast.LENGTH_SHORT).show();
    }
}


