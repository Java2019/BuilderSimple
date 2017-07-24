package com.nemo.buildersimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Family family = new Family();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, family.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.nameFarther:
                startActivity(new Intent(this, nameFarther.class));
                break;
            case R.id.nameMorther:
                startActivity(new Intent(this, nameMorther.class));
                break;
            case R.id.nameDaughter:
                startActivity(new Intent(this, nameDaughter.class));
                break;
        }
    }
}
