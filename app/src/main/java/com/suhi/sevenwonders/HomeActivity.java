package com.suhi.sevenwonders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button buttonTajMahal,buttonPetra,buttonColosseum,buttonMachuPicchu,buttonChichenItza,buttonGreatWall,buttonChristRedeemer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonTajMahal=findViewById(R.id.button_tajmahal);
        buttonPetra=findViewById(R.id.button_petra);
        buttonColosseum=findViewById(R.id.button_colosseum);
        buttonMachuPicchu=findViewById(R.id.button_machupicchu);
        buttonChichenItza=findViewById(R.id.button_chichenitza);
        buttonGreatWall=findViewById(R.id.button_greatwall);
        buttonChristRedeemer=findViewById(R.id.button_christredeemer);


        buttonTajMahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Taj Mahal");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Taj Mahal", Toast.LENGTH_SHORT).show();
            }
        });



        buttonPetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Petra");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Petra", Toast.LENGTH_SHORT).show();
            }
        });



        buttonColosseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Colosseum");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Colosseum", Toast.LENGTH_SHORT).show();
            }
        });


        buttonMachuPicchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Machu Picchu");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Machu Picchu", Toast.LENGTH_SHORT).show();
            }
        });

        buttonChichenItza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Chichen Itza");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Chichen Itza", Toast.LENGTH_SHORT).show();
            }
        });



        buttonGreatWall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Great Wall");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Great Wall", Toast.LENGTH_SHORT).show();
            }
        });



        buttonChristRedeemer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Christ The Redeemer");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Christ The Redeemer", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
