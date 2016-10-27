package com.example.juan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when btn_movie is touched */
    public void movieLoad(View view) {
        Toast.makeText(getApplicationContext(), "Popular Movies Launching!",
                Toast.LENGTH_LONG).show();
    }

    /** Called when btn_stockHawk is touched */
    public void stockHawkLoad(View view) {
        Toast.makeText(getApplicationContext(), "Stock Hawk Launching!",
                Toast.LENGTH_LONG).show();
    }
    /** Called when btn_buildItBigger is touched */
    public void buildItBiggerLoad(View view) {
        Toast.makeText(getApplicationContext(), "Build it Bigger Launching!",
                Toast.LENGTH_LONG).show();
    }
    /** Called when btn_makeAppMaterial is touched */
    public void makeAppMaterialLoad(View view) {
        Toast.makeText(getApplicationContext(), "Make App Material Launching!",
                Toast.LENGTH_LONG).show();
    }
    /** Called when btn_goUbiquitous is touched */
    public void goUbiquitousLoad(View view) {
        Toast.makeText(getApplicationContext(), "Go Ubiquitous Launching!",
                Toast.LENGTH_LONG).show();
    }

    /** Called when btn_capstone is touched */
    public void capstoneLoad(View view) {
        Toast.makeText(getApplicationContext(), "Capstone Launching!",
                Toast.LENGTH_LONG).show();
    }


}
