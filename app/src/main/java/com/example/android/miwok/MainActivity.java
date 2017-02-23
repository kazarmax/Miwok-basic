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
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        TextView familyTextView = (TextView) findViewById(R.id.family);
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        View.OnClickListener categoryOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.numbers:
                        showCategoryActivity(NumbersActivity.class);
                        break;
                    case R.id.family:
                        showCategoryActivity(FamilyActivity.class);
                        break;
                    case R.id.colors:
                        showCategoryActivity(ColorsActivity.class);
                        break;
                    case R.id.phrases:
                        showCategoryActivity(PhrasesActivity.class);
                        break;
                }
            }
        };
        numbersTextView.setOnClickListener(categoryOnClickListener);
        familyTextView.setOnClickListener(categoryOnClickListener);
        colorsTextView.setOnClickListener(categoryOnClickListener);
        phrasesTextView.setOnClickListener(categoryOnClickListener);
    }

    private void showCategoryActivity(Class<?> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }

}
