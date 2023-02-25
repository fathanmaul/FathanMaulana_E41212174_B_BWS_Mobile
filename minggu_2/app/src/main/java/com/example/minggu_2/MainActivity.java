package com.example.minggu_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar act = getSupportActionBar();
        act.hide();
        setContentView(R.layout.activity_main);

//        Button btn = (Button) findViewById(R.id.button_send);
//        EditText txt_1 = (EditText) findViewById(R.id.txt);
//
//        btn.setOnClickListener(v -> {
//            String str = txt_1.getText().toString();
//            Intent intent = new Intent(MainActivity.this, Activity_2.class);
//            intent.putExtra("message_key", str);
//            startActivity(intent);
//            txt_1.setText("");
//        });
    }
}