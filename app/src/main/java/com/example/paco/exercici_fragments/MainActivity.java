package com.example.paco.exercici_fragments;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements fragmento1.OnFragmentInteractionListener, fragmento2.OnFragmentInteractionListener, fragmento3.OnFragmentInteractionListener{


    private LinearLayout layoutFragment1;
    private FrameLayout layoutFragment2, layoutFragment3;
    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        layoutFragment1 = (LinearLayout)findViewById(R.id.layoutFragment1);
        layoutFragment2 = (FrameLayout)findViewById(R.id.viewFragmento2);
        layoutFragment3 = (FrameLayout)findViewById(R.id.viewFragmento3);



        layoutFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();

                ft.add(R.id.viewFragmento3, fragmento3.newInstance("we","we"));
                ft.commit();
            }
        });
        }

    public void onFragmentInteraction(Uri uri) {

    }


}
