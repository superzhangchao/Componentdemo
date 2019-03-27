package com.zc.componentlib;

import com.zc.componentlib.Impl.EmptyLoginService;
import com.zc.componentlib.Impl.EmptyMineService;
import com.zc.componentlib.service.IMineService;
import com.zc.componentlib.service.IloignService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return  instance;
    }
    private ServiceFactory(){}

    private IloignService mLoginService;
    private IMineService mMineService;

    public IloignService getLoginService(){
        if (mLoginService ==null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }
    public IMineService getMineService() {
        if (mMineService ==null){
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }


    public void setLoginService(IloignService loginService){

        mLoginService = loginService;
    }

    public void setMineService(IMineService mineService) {
        mMineService = mineService;
    }
}
