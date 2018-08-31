package com.example.rere.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText txtemail, txtpassword;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);

        Log.i(TAG, "OnCreate");
    }

    private boolean adaError(){
        boolean ada = false;
        if(TextUtils.isEmpty(txtemail.getText().toString())){
            txtemail.setError("Gaboleh Kosong dong :)");
        }

        if(TextUtils.isEmpty(txtpassword.getText().toString())){
            txtpassword.setError("Gaboleh Kosong dong :)");
        }
        return ada;

    }

    public void login(View v){
        if(!adaError()){
            Toast.makeText(
                    getApplicationContext(),
                    "Button daftar clicked",
                    Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            bundle.putString("email", txtemail.getText().toString());

            Intent i = new Intent(this, DashboardActivity.class);
            /*i.putExtras(bundle);*/
            startActivity(i);
        }
    }
}
