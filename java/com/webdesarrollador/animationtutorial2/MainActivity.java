package com.webdesarrollador.animationtutorial2;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView chico = (ImageView) findViewById(R.id.animation_chico);
        AnimationDrawable chicoAnimation = (AnimationDrawable) chico.getBackground();
        chicoAnimation.start();
    }
    //Vamos a la actividad donde tenemos la animación tween
    public void goToTween(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}

