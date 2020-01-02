package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button = (Button) findViewById(R.id.ask_button);

        final ImageView image_8ball = (ImageView) findViewById(R.id.image_8ball);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic-8-ball-android-Archangel-Rey", "Okay" );

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("magic-8-ball-android-Archangel-Rey", "The message is " + number);

                image_8ball.setImageResource(ballArray[number]);
            }
        });



    }
}
