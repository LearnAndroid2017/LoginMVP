package com.example.student.loginmvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_usernm,edt_pass;
    Button btn_signIn;
    TextView txt_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_usernm= (EditText) findViewById(R.id.editText);
        edt_pass= (EditText) findViewById(R.id.editText2);
        btn_signIn= (Button) findViewById(R.id.button2);
        txt_signUp= (TextView) findViewById(R.id.textView2);
        txt_signUp.setOnClickListener(this);
        btn_signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==txt_signUp){
            startActivity(new Intent(MainActivity.this,RegisterActivity.class));
        }
        if(view==btn_signIn){
            if(edt_usernm.getText().toString().equals("test") && edt_pass.getText().toString().equals("123")){
                startActivity(new Intent(MainActivity.this,DashboardActivity.class));
            }
        }
    }

}
