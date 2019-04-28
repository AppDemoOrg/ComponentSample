package com.abt.mine_component;

import android.content.Context;
import android.content.Intent;

import com.abt.component_lib.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.putExtra(MineActivity.ID, userId);
        context.startActivity(intent);
    }
}
