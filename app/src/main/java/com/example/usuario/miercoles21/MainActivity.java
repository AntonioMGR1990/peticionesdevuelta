package com.example.usuario.miercoles21;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int REQ_B=1;
    private static final int REQ_C=2;
    private static final int REQ_X=3;
    private Button btnB;
    private Button btnC;
    private Button btnX;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnB = findViewById(R.id.BotonB);
        btnC = findViewById(R.id.BotonC);
        findViewById(R.id.BotonX).setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        texto = findViewById(R.id.NombreTextView);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BotonB:
                Intent intentb = new Intent(MainActivity.this,B_Activity.class);
                startActivityForResult(intentb,REQ_B);
                break;
            case R.id.BotonC:
                Intent intentc = new Intent(MainActivity.this,C_Activity.class);
                startActivityForResult(intentc,REQ_C);
                break;
            case R.id.BotonX:
                Intent intentx = new Intent(MainActivity.this,X_Activity.class);
                startActivityForResult(intentx,REQ_X);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Intent aux = new Intent();
        if(data!=null){
            aux = data;
        }
        switch (requestCode){
            case REQ_B:
                if (resultCode== Activity.RESULT_OK){
                    Toast.makeText(this,"vengo de B -- OK",Toast.LENGTH_SHORT).show();
                }
                if(resultCode==Activity.RESULT_CANCELED){
                    Toast.makeText(this,"vengo de B -- CANCEL",Toast.LENGTH_SHORT).show();
                }
                break;
            case REQ_C:
                if (resultCode== Activity.RESULT_OK){
                    Toast.makeText(this,"vengo de C -- OK",Toast.LENGTH_SHORT).show();
                    texto.setText(aux.getStringExtra("nombre"));
                }
                if(resultCode==Activity.RESULT_CANCELED){
                    Toast.makeText(this,"vengo de C -- CANCEL",Toast.LENGTH_SHORT).show();
                    texto.setText(aux.getStringExtra("nombre"));
                }
                break;
            case REQ_X:
                if (resultCode== Activity.RESULT_OK){
                    Toast.makeText(this,"vengo de X -- OK",Toast.LENGTH_SHORT).show();
                    texto.setText(aux.getStringExtra("nombre"));
                }
                if(resultCode==Activity.RESULT_CANCELED){
                    Toast.makeText(this,"vengo de X -- CANCEL",Toast.LENGTH_SHORT).show();
                    texto.setText(aux.getStringExtra("nombre"));
                }
                break;
        }
    }
}
