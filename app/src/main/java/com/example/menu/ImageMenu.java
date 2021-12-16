package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ImageMenu extends AppCompatActivity {

    EditText etAngle;
    ImageView imageView;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_menu);
        setTitle("제주도 풍경");

        etAngle = (EditText) findViewById(R.id.etAngle);
        imageView = (ImageView) findViewById(R.id.imageView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.imagemenu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRotate:
                imageView.setRotation(Float.parseFloat(etAngle.getText().toString()));
                return true;
            case R.id.item1:
                imageView.setImageResource(R.drawable.jeju1);
                return true;
            case R.id.item2:
                imageView.setImageResource(R.drawable.jeju14);
                return true;
            case R.id.item3:
                imageView.setImageResource(R.drawable.jeju6);
                return true;
        }
        return false;
    }
}