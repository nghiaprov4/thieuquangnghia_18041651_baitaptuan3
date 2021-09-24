package com.example.thieuquangnghia_18041651_baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chaynhac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaynhac);

        findViewById( R.id.imageView10 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(chaynhac.this,danhsachnhac.class) );
                overridePendingTransition( R.anim.enter,R.anim.exit);


            }
        } );
    }
}