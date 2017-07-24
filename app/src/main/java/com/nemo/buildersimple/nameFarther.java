package com.nemo.buildersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class nameFarther extends AppCompatActivity {

    private Father father;
    private Family family;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_farther);
        findViewById(R.id.bFinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = (EditText)findViewById(R.id.text);
                try {
                    father.setName(editText.getText().toString());
                    family.setFather(father);
                }catch (Exception e){}
                //finish();
                Toast.makeText(nameFarther.this, family.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
