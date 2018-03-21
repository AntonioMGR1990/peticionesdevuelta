package com.example.usuario.miercoles21;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class X_Activity extends B_Activity {


    private Intent intent=new Intent();
    private Button btnVolver;
    private Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnVolver:
                intent.putExtra("nombre","nombre del intentX:volver");
                setResult(Activity.RESULT_OK,intent);
                finish();
                break;
            case R.id.btnCancel:
                intent.putExtra("nombre","nombre del intentX:cancel");
                setResult(Activity.RESULT_CANCELED,intent);
                finish();
                break;
        }
    }
}
