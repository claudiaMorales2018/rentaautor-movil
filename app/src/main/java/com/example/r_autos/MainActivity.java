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

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtPassword;
    Button btnLogin;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edtUsuario = findViewById(R.id.edtUsuario);
            edtPassword = findViewById(R.id.edtPassword);
            btnLogin = findViewById(R.id.btnLogin);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    validarUsuario("http://192.168.0.6/CheckListRautos/Validar.php");
                }
            });


        }


private void validarUsuario(String ULR){
            StringRequest stringRequest= new StringRequest(Request.Method.POST, ULR, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
            if (!response.isEmpty()){
                Intent intent = new Intent(getApplicationContext(),PrincipalActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(MainActivity.this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(MainActivity.this,error.toString(), Toast.LENGTH_SHORT).show();
                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                   Map<String, String> parametro = new HashMap<String,String>();
                   parametro.put("Usuario_Login",edtUsuario.getText().toString());
                   parametro.put("Usuario_PWG",edtPassword.getText().toString());

                    return parametro;
                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
}
    }

