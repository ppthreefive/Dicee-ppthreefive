package com.phillippham.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);
        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        Button rollButton = findViewById(R.id.roll_button);
        rollButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Dicee", "The button has been pressed.");

                Random randomNumberGenerator = new Random();

                int randomNumL = randomNumberGenerator.nextInt(6);
                int randomNumR = randomNumberGenerator.nextInt(6);

                Log.d("Dicee", "The left random number is: " + randomNumL);
                Log.d("Dicee", "The right random number is: " + randomNumR);

                leftDice.setImageResource(diceArray[randomNumL]);
                rightDice.setImageResource(diceArray[randomNumR]);
            }
        });
    }
}