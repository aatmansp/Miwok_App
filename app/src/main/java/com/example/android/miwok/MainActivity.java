

package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

 import com.example.android.miwok.ColorsActivity;
 import com.example.android.miwok.FamilyActivity;
 import com.example.android.miwok.NumbersActivity;
 import com.example.android.miwok.PhrasesActivity;
 import com.example.android.miwok.R;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        TextView numbers = (TextView) findViewById(R.id.numbers);


        numbers.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);


                startActivity(numbersIntent);
            }
        });


        TextView family = (TextView) findViewById(R.id.family);


        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {

                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);


                startActivity(familyIntent);
            }
        });


        TextView colors = (TextView) findViewById(R.id.colors);


        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {

                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);


                startActivity(colorsIntent);
            }
        });


        TextView phrases = (TextView) findViewById(R.id.phrases);


        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {

                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);


                startActivity(phrasesIntent);
            }
        });
    }
}
