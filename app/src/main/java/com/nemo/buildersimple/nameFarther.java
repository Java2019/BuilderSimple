package com.nemo.buildersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class nameFarther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_farther);
        findViewById(R.id.bFinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText)findViewById(R.id.text);
                //new Family().getFather().setName(editText.getText().toString());
                //finish();
                Toast.makeText(nameFarther.this, new Family().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
