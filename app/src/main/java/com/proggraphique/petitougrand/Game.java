package com.proggraphique.petitougrand;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Game extends Activity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        mGLView = new MyGLSurfaceView(this);
        /* Définition de View pour cette activité */
        setContentView(mGLView);
    }

    public void onButtonClick(){

    }
}
