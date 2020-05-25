package com.proggraphique.petitougrand;



import android.os.Bundle;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* Ce tutorial est issu d'un tutorial http://developer.android.com/training/graphics/opengl/index.html :
openGLES.zip HelloOpenGLES20
 */


public class OpenGLES20Activity extends Activity {

    // le conteneur View pour faire du rendu OpenGL
    private GLSurfaceView mGLView;






    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Création de View et association à Activity
           MyGLSurfaceView : classe à implémenter et en particulier la partie renderer */

        /* Pour le plein écran */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mGLView = new MyGLSurfaceView(this);
        /* Définition de View pour cette activité */
        setContentView(mGLView);




       RelativeLayout ll = new RelativeLayout(this);

        Button moins = new Button(this);
        moins.setText("moins");

        Button egal = new Button(this);
        egal.setText("egal");

        Button plus = new Button(this);
        plus.setText("plus");

        Button arreter = new Button(this);
        arreter.setText("arreter");

        ll.addView(moins);
        ll.addView(egal);
        ll.addView(plus);
        ll.addView(arreter);

        //LayoutParams lButtonParams = new RelativeLayout.LayoutParams( LayoutParams.WRAP_CONTENT , LayoutParams.WRAP_CONTENT );

        this.addContentView(ll,new
                RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));




    }
}
