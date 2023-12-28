package com.example.talibov_v_14;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity implements View.OnClickListener {

    private TextView text1, text2, text3;
    private CheckBox checkBox1, checkBox2, checkBox3;
    private ImageButton comeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        comeBack = findViewById(R.id.comeBack);

        text1 = findViewById(R.id.textView9);
        text2 = findViewById(R.id.textView10);
        text3 = findViewById(R.id.textView12);

        checkBox1 = findViewById(R.id.checkBox2);
        checkBox2 = findViewById(R.id.checkBox3);
        checkBox3 = findViewById(R.id.checkBox4);

        final int originalTextColor = text1.getCurrentTextColor();

        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView = getTextViewForCheckBox(buttonView);
                if (isChecked) {
                    textView.setTextColor(Color.BLUE);
                } else {
                    textView.setTextColor(originalTextColor);
                }
            }
        };

        checkBox1.setOnCheckedChangeListener(onCheckedChangeListener);
        checkBox2.setOnCheckedChangeListener(onCheckedChangeListener);
        checkBox3.setOnCheckedChangeListener(onCheckedChangeListener);

    }

    private TextView getTextViewForCheckBox(View checkBox) {
        switch (checkBox.getId()) {
            case R.id.checkBox2:
                return text1;
            case R.id.checkBox3:
                return text2;
            case R.id.checkBox4:
                return text3;
            default:
                throw new IllegalArgumentException("Unknown CheckBox");
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        Intent intent;
        if (view.getId() == R.id.comeBack) {
            intent = new Intent(this, PersonalArea.class);
            startActivity(intent);
        }

    }
}
