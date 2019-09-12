package com.bignerdranch.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton=(Button) findViewById(R.id.roll_button);
        final ImageView   leftDicee=(ImageView) findViewById(R.id.image_leftDice);
        final ImageView  rightDicee=(ImageView) findViewById(R.id.image_rightDice);

        final  int[] dicearray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                int number=rand.nextInt(6);
                leftDicee.setImageResource(dicearray[number]);
                number=rand.nextInt(6);
                rightDicee.setImageResource(dicearray[number]);
            }
        });
    }
}
