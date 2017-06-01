package com.example.student.loginmvp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;



 class DashboardInteractorImpl implements DashboardInteractor{

    @Override
    public void findItems(final OnFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinish(createList());
            }
        },2000);
    }

    private List<String> createList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7"
        );
    }
}
