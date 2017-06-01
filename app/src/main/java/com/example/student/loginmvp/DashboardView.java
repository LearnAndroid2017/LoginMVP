package com.example.student.loginmvp;

import java.util.List;

 interface DashboardView {
    void showProgress();
    void hideProgress();
    void setItems(List<String> items);
    void showMessage(String msg);
}
