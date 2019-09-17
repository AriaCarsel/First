package com.carsel.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    String text=null;
    Button btn;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.inp);
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(this);
        out=findViewById(R.id.out);
    }
    @Override
    public void onClick(View view) {
        text=editText.getText().toString();
        out.setText(text);
        Log.i("TAG","clicked........................");
    }
}
