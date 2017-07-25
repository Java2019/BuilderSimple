package com.nemo.buildersimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class nameMorther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_morther);
        findViewById(R.id.bFinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.text);
                Intent intent = new Intent();
                intent.putExtra("name", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
