package com.ubproject.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Dashboard");

        GridLayout gridLayout = (GridLayout) findViewById(R.id.mainGrid);
        this.mainGrid = gridLayout;
        setSingleEvent(gridLayout);
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for (int i = 0; i < gridLayout.getChildCount(); ++i) {
            int j = i;
            ((CardView) gridLayout.getChildAt(i)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int n = j;
                    String str = "link";
                    Intent intent;
                    if (n == 0) {
                        intent = new Intent(MainActivity.this, Form.class);
                        startActivity(intent);
                    } else if (n == 1) {
                        intent = new Intent(MainActivity.this, GetInTouch.class);
                        startActivity(intent);
                    } else if (n == 2) {
                        intent = new Intent(MainActivity.this, Hello.class);
                        startActivity(intent);
                    } else if (n == 3) {
                        intent = new Intent(MainActivity.this, Payment.class);
                        startActivity(intent);
                    }else if (n ==4) {
                        intent = new Intent(MainActivity.this, ProfileA.class);
                        startActivity(intent);
                    } else if (n == 5) {
                        intent = new Intent(MainActivity.this, ProfileB.class);
                        startActivity(intent);
                    } else if (n == 6) {
                        intent = new Intent(MainActivity.this, Dashboard.class);
                        startActivity(intent);
                    }

                }
            });

        }

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.settings) {

        }
        return super.onOptionsItemSelected(menuItem);
    }
}