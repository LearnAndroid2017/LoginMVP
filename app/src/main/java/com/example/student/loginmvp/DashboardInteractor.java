package com.example.student.loginmvp;

import java.util.List;


 interface DashboardInteractor {

    interface OnFinishListener {
        void onFinish(List<String> items);
    }
    void findItems(OnFinishListener listener);
}
