package com.zc.componentlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface IloignService {
    void startActivity(Context context, String targetClass);
    Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
