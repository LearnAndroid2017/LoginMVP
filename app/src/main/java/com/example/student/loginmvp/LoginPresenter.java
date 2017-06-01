package com.example.student.loginmvp;


 interface LoginPresenter {
    void onClick_login(String username, String password);
    void onDestroy();
}

