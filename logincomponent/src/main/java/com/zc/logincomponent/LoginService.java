package com.zc.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.zc.componentlib.service.IloignService;

public class LoginService implements IloignService {
    @Override
    public void startActivity(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        intent.putExtra(LoginActivity.EXTRA_TARGET_CLASS,targetClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
            UserInfoFragment userInfoFragment = new UserInfoFragment();
            userInfoFragment.setArguments(bundle);
            fragmentManager.beginTransaction().add(viewId,userInfoFragment).commit();
            return userInfoFragment;
    }
}
