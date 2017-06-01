package com.example.student.loginmvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,LoginView {

    EditText edt_usernm,edt_pass;
    Button btn_signIn;
    TextView txt_signUp;
    ProgressBar progressBar;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=(ProgressBar)findViewById(R.id.progress);
        edt_usernm= (EditText) findViewById(R.id.editText);
        edt_pass= (EditText) findViewById(R.id.editText2);
        btn_signIn= (Button) findViewById(R.id.button2);
        txt_signUp= (TextView) findViewById(R.id.textView2);
        txt_signUp.setOnClickListener(this);
        btn_signIn.setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }



    @Override
    public void onClick(View view) {
        presenter.onClick_login(edt_usernm.getText().toString(),edt_pass.getText().toString());
        /*
        if(view==txt_signUp){
            startActivity(new Intent(MainActivity.this,RegisterActivity.class));
        }
        if(view==btn_signIn){
            if(edt_usernm.getText().toString().equals("test") && edt_pass.getText().toString().equals("123")){
                startActivity(new Intent(MainActivity.this,DashboardActivity.class));
            }
        }
        */

    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        edt_usernm.setError("Not valid username");
    }

    @Override
    public void setPasswordError() {
        edt_pass.setError("Not valid password");
    }

    @Override
    public void gotoDashboard() {
        startActivity(new Intent(MainActivity.this,DashboardActivity.class));
        finish();
    }
}
