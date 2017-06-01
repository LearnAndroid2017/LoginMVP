package com.example.student.loginmvp;

 interface LoginView {

    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void gotoDashboard();
}
