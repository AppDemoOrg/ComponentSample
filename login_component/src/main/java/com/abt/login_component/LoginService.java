package com.abt.login_component;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.abt.component_lib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.putExtra(LoginActivity.EXTRA_TARGET_ACTIVITY, targetClass);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserFragment fragment = new UserFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, fragment).commit();
        return fragment;
    }
}
