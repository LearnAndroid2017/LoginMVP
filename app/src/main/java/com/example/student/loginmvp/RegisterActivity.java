package com.example.student.loginmvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_fname,edt_uname,edt_pass;
    Button btn_signUp;
    TextView txt_signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edt_fname=(EditText)findViewById(R.id.editText3);
        edt_uname=(EditText)findViewById(R.id.editText4);
        edt_pass=(EditText)findViewById(R.id.editText7);
        btn_signUp=(Button) findViewById(R.id.button);
        txt_signIn=(TextView) findViewById(R.id.textView2);
        txt_signIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==txt_signIn){
            startActivity(new Intent(RegisterActivity.this,MainActivity.class));
        }
    }
}
