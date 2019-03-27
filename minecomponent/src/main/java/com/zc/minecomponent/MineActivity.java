package com.zc.minecomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MineActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        if (getIntent()!=null){
            String stringExtra =  getIntent().getStringExtra("ID");
            TextView view = (TextView) findViewById(R.id.tv_content);
            view.setText(stringExtra);
        }
    }
}
