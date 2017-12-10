package com.example.android.griffonagecounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.griffonagecounter.R;

public class MainActivity extends AppCompatActivity {

    public static Button btn;

    // Number of adults counted
    int adultNumbers = 0;

    // Number of subadults counted
    int subadNumbers = 0;

    // Number of immatures counted
    int immNumbers = 0;

    // Number of juveniles counted
    int juvNumbers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase Adults by 1.
     */
    public void addAdult(View v) {
        adultNumbers = adultNumbers + 1;
        displayAdults(adultNumbers);
    }

    /**
     * Decrease Adults by 1.
     */
    public void remAdult(View v) {
        adultNumbers = adultNumbers - 1;
        displayAdults(adultNumbers);
    }

    /**
     * Increase Subdults by 1.
     */
    public void addSubadult(View v) {
        subadNumbers = subadNumbers + 1;
        displaySubadults(subadNumbers);
    }

    /**
     * Decrease Subdults by 1.
     */
    public void remSubadult(View v) {
        subadNumbers = subadNumbers - 1;
        displaySubadults(subadNumbers);
    }

    /**
     * Increase Immatures by 1.
     */
    public void addImmatures(View v) {
        immNumbers = immNumbers + 1;
        displayImmatures(immNumbers);
    }

    /**
     * Decrease Immatures by 1.
     */
    public void remImmatures(View v) {
        immNumbers = immNumbers - 1;
        displayImmatures(immNumbers);
    }

    /**
     * Increase Juveniles by 1.
     */
    public void addJuveniles(View v) {
        juvNumbers = juvNumbers + 1;
        displayJuveniles(juvNumbers);
    }

    /**
     * Decrease Juveniles by 1.
     */
    public void remJuveniles(View v) {
        juvNumbers = juvNumbers - 1;
        displayJuveniles(juvNumbers);
    }

    /**
     * Reset count.
     */


    /**
     * Displays the Adults numbers.
     */
    public void displayAdults(int numbers) {
        TextView scoreView = (TextView) findViewById(R.id.adult);
        scoreView.setText(String.valueOf(numbers));
    }

    /**
     * Displays the Subadults numbers.
     */
    public void displaySubadults(int numbers) {
        TextView scoreView = (TextView) findViewById(R.id.subadult);
        scoreView.setText(String.valueOf(numbers));
    }

    /**
     * Displays the Immatures numbers.
     */
    public void displayImmatures(int numbers) {
        TextView scoreView = (TextView) findViewById(R.id.immature);
        scoreView.setText(String.valueOf(numbers));
    }

    /**
     * Displays the Juveniles numbers.
     */
    public void displayJuveniles(int numbers) {
        TextView scoreView = (TextView) findViewById(R.id.juvenile);
        scoreView.setText(String.valueOf(numbers));
    }

    public void reset(View view) {
        btn = (Button) findViewById(R.id.dial);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altdial = new AlertDialog.Builder(MainActivity.this);
                altdial.setMessage(" ").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                adultNumbers = 0;
                                subadNumbers = 0;
                                immNumbers = 0;
                                juvNumbers = 0;
                                displayAdults(adultNumbers);
                                displaySubadults(subadNumbers);
                                displayImmatures(immNumbers);
                                displayJuveniles(juvNumbers);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = altdial.create();
                alert.setTitle("Reset");
                alert.show();
            }
        });
    }
}
