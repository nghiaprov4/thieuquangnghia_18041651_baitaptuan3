package com.example.thieuquangnghia_18041651_baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Fade fade=new Fade();
        View decor=getWindow().getDecorView();
        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );

        final ImageView image2=findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(screen2.this,screen3.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(screen2.this,image2,
                        ViewCompat.getTransitionName(image2));
                startActivity(intent,optionsCompat.toBundle());
            }
        });
        final ImageView imageView=findViewById(R.id.image3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(screen2.this,screen4.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(screen2.this,imageView,
                        ViewCompat.getTransitionName(imageView));
                startActivity(intent,optionsCompat.toBundle());
            }
        });
    }
}