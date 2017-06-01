package com.example.student.loginmvp;

import java.util.List;
import java.util.Locale;


class DashboardPresenterImpl implements DashboardPresenter, DashboardInteractor.OnFinishListener {

     private DashboardView dashboardView;
     private DashboardInteractorImpl interactor;

     DashboardPresenterImpl(DashboardView dashboardView, DashboardInteractorImpl interactor) {
        this.dashboardView = dashboardView;
        this.interactor = interactor;
    }

    @Override
    public void onResume() {
        if(dashboardView!=null){
            dashboardView.showProgress();
        }
        interactor.findItems(this);
    }

    @Override
    public void onItemClick(int position) {
        if (dashboardView != null) {
            dashboardView.showMessage(String.format(Locale.ENGLISH,"Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        dashboardView=null;
    }

    @Override
    public void onFinish(List<String> items) {
        if (dashboardView != null) {
            dashboardView.setItems(items);
            dashboardView.hideProgress();
        }
    }

    public DashboardView getDashboardView() {
        return dashboardView;
    }
}
