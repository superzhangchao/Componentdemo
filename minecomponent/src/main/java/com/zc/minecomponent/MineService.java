package com.zc.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.zc.componentlib.service.IMineService;

public class MineService implements IMineService {
    @Override
    public void startActivity(Context context, String targetClass) {
        Intent intent = new Intent(context,MineActivity.class);
        intent.putExtra("ID",targetClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
