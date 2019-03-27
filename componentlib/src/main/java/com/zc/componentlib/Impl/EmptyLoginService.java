package com.zc.componentlib.Impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.zc.componentlib.service.IloignService;

public class EmptyLoginService implements IloignService {
    @Override
    public void startActivity(Context context, String activity) {

    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
