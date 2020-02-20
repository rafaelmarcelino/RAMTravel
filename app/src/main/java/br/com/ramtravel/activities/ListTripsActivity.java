package br.com.ramtravel.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.ramtravel.R;

public class ListTripsActivity extends AppCompatActivity {

    private static final String LIST_TRIPS = "List Trips";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_trips);
        setTitle(LIST_TRIPS);
    }
}
