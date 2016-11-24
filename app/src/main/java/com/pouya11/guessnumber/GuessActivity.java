package com.pouya11.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class GuessActivity extends AppCompatActivity {

    EditText txtGuess;
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        txtGuess = (EditText) findViewById(R.id.txt_guess);

        Random r = new Random();

        number = r.nextInt(9000) + 1000;
    }

    public void btn1Clicked(View view) {
        txtGuess.append("1");
    }

    public void btnGuessClicked(View view) {
        int guessNumber = Integer.parseInt(txtGuess.getText().toString());
        if(guessNumber == number){
            Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
        }else if(guessNumber > number){
            Toast.makeText(this, "Too high!!!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "You low :|", Toast.LENGTH_LONG).show();
        }
    }
}
