package com.abt.mine_component;

import android.app.Activity;
import android.os.Bundle;

public class MineActivity extends Activity {

    public static final String ID = "ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
    }
}
