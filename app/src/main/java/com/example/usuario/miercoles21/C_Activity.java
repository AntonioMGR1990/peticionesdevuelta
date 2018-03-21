package com.example.usuario.miercoles21;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnVolver;
    private Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_);
        btnVolver = findViewById(R.id.btnVolver);
        btnCancel = findViewById(R.id.btnCancel);
        btnVolver.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnVolver:
                setResult(Activity.RESULT_OK);
                finish();
                break;
            case R.id.btnCancel:
                setResult(Activity.RESULT_CANCELED);
                finish();
                break;
        }
    }
}
