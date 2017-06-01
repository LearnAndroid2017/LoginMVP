package com.example.student.loginmvp;



 class LoginPresenterImpl implements LoginPresenter,LoginInteractor.OnLoginFinishListener {

    private LoginView loginView;
    private LoginInteractor interactor;

     LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl();
    }

    @Override
    public void onClick_login(String username, String password) {
        if(loginView!=null){
            loginView.showProgress();
        }
        interactor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
        loginView=null;
    }

    @Override
    public void onUsernameError() {
        if(loginView!=null){
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if(loginView!=null){
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if(loginView!=null){
            loginView.gotoDashboard();
        }
    }
}
