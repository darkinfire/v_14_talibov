package com.example.talibov_v_14;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {
    final int CAMERA_REQUEST = 1;
    Button Scan;
    ImageButton poisk, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        Scan = findViewById(R.id.Scan);
    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.Scan:
                Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(captureIntent);
                break;
            case R.id.poisk:
                intent = new Intent(this, Search.class);
                startActivity(intent);
                break;
            case R.id.logout:
                intent = new Intent(this, Autorizatia.class);
                startActivity(intent);
                break;
        }

    }
}
