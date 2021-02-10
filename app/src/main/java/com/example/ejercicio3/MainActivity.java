package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUrl;
    private Button btnVis;
    private Button btnEjc1;
    private Button btnEjc2;
    private Button btnDP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUrl = (EditText) findViewById(R.id.txtUrl);
        btnVis = (Button) findViewById(R.id.btnVisualizar);
        btnEjc1 = (Button) findViewById(R.id.btnEjc1);
        btnEjc2 = (Button) findViewById(R.id.btnEjc2);
        btnDP = (Button) findViewById(R.id.btnDp);

        btnVis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = txtUrl.getText().toString();

                Toast.makeText(MainActivity.this,"Buscando URL...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("nombre", url);
                startActivity(intent);
            }
        });

        btnEjc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://examendp.000webhostapp.com";

                Toast.makeText(MainActivity.this,"Buscando URL...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, WenViewActivity.class);
                intent.putExtra("nombre", url);
                startActivity(intent);
            }
        });

        btnEjc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://jacvdevelopments.000webhostapp.com";

                Toast.makeText(MainActivity.this,"Buscando URL...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("nombre", url);
                startActivity(intent);
            }
        });

        btnDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.dportenis.mx";

                Toast.makeText(MainActivity.this,"Buscando URL...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("nombre", url);
                startActivity(intent);
            }
        });
    }

}
