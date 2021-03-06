package com.example.usuario.miercoles21;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_Activity extends AppCompatActivity implements View.OnClickListener{

    private Intent intent=new Intent();
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
                intent.putExtra("nombre","nombre del intent:volver");
                setResult(Activity.RESULT_OK,intent);
                finish();
                break;
            case R.id.btnCancel:
                intent.putExtra("nombre","nombre del intent:cancel");
                setResult(Activity.RESULT_CANCELED,intent);
                finish();
                break;
        }
    }
}
