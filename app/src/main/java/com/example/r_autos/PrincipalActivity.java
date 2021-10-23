package com.example.r_autos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    }

    public void onClick(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.btnInsertar:
                intent = new Intent(getApplicationContext(), MainActivityInsertar.class);
                startActivity(intent);
                break;

            case R.id.btnMostrar:
                intent = new Intent(getApplicationContext(), MainActivityMostrar.class);
                startActivity(intent);
                break;

        }
    }
}