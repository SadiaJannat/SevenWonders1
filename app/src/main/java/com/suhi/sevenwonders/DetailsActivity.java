package com.suhi.sevenwonders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    ImageView imagePlace;
    TextView textName,textDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        imagePlace=findViewById(R.id.image_place);
        textName=findViewById(R.id.text_name);
        textDescription=findViewById(R.id.text_description);


        String getName=getIntent().getExtras().getString("name");

        if (getName.equals("Taj Mahal"))
        {
            textName.setText("Taj Mahal");
            textDescription.setText(R.string.taj_mahal);
            imagePlace.setImageResource(R.drawable.tajmahal);
        }

        else if (getName.equals("Petra"))
        {
            textName.setText("Petra");
            textDescription.setText(R.string.petra);
            imagePlace.setImageResource(R.drawable.petra);
        }

        else if (getName.equals("Colosseum"))
        {
            textName.setText("Colosseum");
            textDescription.setText(R.string.colosseum);
            imagePlace.setImageResource(R.drawable.colosseum);
        }

        else if (getName.equals("Machu Picchu"))
        {
            textName.setText("Machu Picchu");
            textDescription.setText(R.string.machu_picchu);
            imagePlace.setImageResource(R.drawable.machupicchu);
        }

        else if (getName.equals("Chichen Itza"))
        {
            textName.setText("Chichen Itza");
            textDescription.setText(R.string.chichen_itza);
            imagePlace.setImageResource(R.drawable.chichenitza);
        }

        else if (getName.equals("Great Wall"))
        {
            textName.setText("Great Wall");
            textDescription.setText(R.string.great_wall);
            imagePlace.setImageResource(R.drawable.greatwallofchina);
        }

        else if (getName.equals("Christ The Redeemer"))
        {
            textName.setText("Christ The Redeemer");
            textDescription.setText(R.string.christ_redeemer);
            imagePlace.setImageResource(R.drawable.christtheredeemer);
        }




    }
}
