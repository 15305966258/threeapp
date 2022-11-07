package com.example.text3two;

import android.content.DialogInterface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/**
 * AlertDialog普通对话框
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View layout = inflater.inflate(R.layout.activity_main, null);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this)
                .setView(layout);
        alertDialog.show();//别忘了show
    }
}