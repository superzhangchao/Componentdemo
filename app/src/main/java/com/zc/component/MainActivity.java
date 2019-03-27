package com.zc.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zc.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    private Button btJumpLogin;
    private Button btJumpMine;
    private Button btShowUI;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btJumpLogin = (Button) findViewById(R.id.bt_jumpLogin);
        btJumpMine = (Button) findViewById(R.id.bt_jumpMine);
        btShowUI= (Button) findViewById(R.id.showUI);

        btJumpLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getLoginService().startActivity(MainActivity.this,"");
            }
        });

        btJumpMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getMineService().startActivity(MainActivity.this,"I'm from MainActivity");
            }
        });
        btShowUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getLoginService().newUserInfoFragment(getSupportFragmentManager(),R.id.container,bundle);
            }
        });
    }
}
