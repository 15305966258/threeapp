package com.example.text3three;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId=item.getItemId();
        TextView mText = findViewById(R.id.tv);

        switch (itemId){
            case R.id.list_view_vertical_stander:
                mText.setTextSize(10);
                break;
            case R.id.list_view_vertical_reverse:
                mText.setTextSize(16);
                break;
            case R.id.list_view_horizontal_stander:
                mText.setTextSize(20);
                break;
            case R.id.stagger_view_vertical_stander:
                mText.setTextColor(Color.RED);
                break;
            case R.id.stagger_view_vertical_reverse:
                mText.setTextColor(Color.BLACK);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}