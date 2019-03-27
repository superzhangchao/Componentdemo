package com.zc.minecomponent;

import android.app.Application;

import com.zc.componentlib.IAppComponent;
import com.zc.componentlib.ServiceFactory;

public class MineApp extends Application implements IAppComponent {
    private static Application application;
    public static Application getApplication(){
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
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
