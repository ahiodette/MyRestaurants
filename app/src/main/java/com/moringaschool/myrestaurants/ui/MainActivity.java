package com.moringaschool.myrestaurants.ui;


import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.myrestaurants.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mFindRestaurantsButton.setOnClickListener(this);
    }
            @Override
            public void onClick(View v){
                if (v==mFindRestaurantsButton){
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }

            }
    }
