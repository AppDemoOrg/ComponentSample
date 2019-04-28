package com.abt.componentsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.abt.component_lib.ServiceFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmLoginService().launch(MainActivity.this, "");
            }
        });

        findViewById(R.id.mine).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmMineService().launch(MainActivity.this,1);
            }
        });

        findViewById(R.id.show).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmLoginService().newUserFragment(getFragmentManager(), R.id.container, bundle);
            }
        });

    }
}
