package com.zc.logincomponent;

import android.app.Application;

import com.zc.componentlib.IAppComponent;
import com.zc.componentlib.ServiceFactory;


public class LoginApp extends Application implements IAppComponent {

    private static Application application;
    public Application getApplication(){
        return  application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
