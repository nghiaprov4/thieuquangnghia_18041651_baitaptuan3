package com.example.thieuquangnghia_18041651_baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        Fade fade=new Fade();
        View decor=getWindow().getDecorView();

        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen4.this, screen2.class));
            }
        });

    }
}