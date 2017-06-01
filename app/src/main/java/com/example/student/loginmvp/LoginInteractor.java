package com.example.student.loginmvp;

import android.widget.TextView;

import org.w3c.dom.Text;


 interface LoginInteractor {

    interface OnLoginFinishListener {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String usernm, String pass, OnLoginFinishListener listener);
}
