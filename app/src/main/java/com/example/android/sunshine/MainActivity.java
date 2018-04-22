/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** View for template text */
    private TextView mWeatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // Find and get a reference to the weather display TextView by id "tv_weather_data"
        mWeatherDataTextView = findViewById(R.id.tv_weather_data);
        // Create an array of Strings that contain fake weather data
        String[] fakeWeather = { "Sun", "Rain", "Clouds"};
        // Append each String from the fake weather data array to the TextView
        for (String weatherItem : fakeWeather) {
            mWeatherDataTextView.append(weatherItem + "\n\n\n");
        }
    }
}