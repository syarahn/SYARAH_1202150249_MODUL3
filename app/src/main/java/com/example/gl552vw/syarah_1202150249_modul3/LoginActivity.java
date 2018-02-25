package com.example.gl552vw.syarah_1202150249_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void btn_login(View view) {
        et1 = (EditText)findViewById(R.id.username);
        et2 = (EditText)findViewById(R.id.password);

        if(et1.getText().toString().equals("EAD") && et2.getText().toString().equals("MOBILE") ) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Login success!",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"Wrong UserName or Password",Toast.LENGTH_LONG).show();
        }
    }
}
