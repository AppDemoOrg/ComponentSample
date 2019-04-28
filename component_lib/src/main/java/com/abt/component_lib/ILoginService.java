package com.abt.component_lib;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;

public interface ILoginService {

    void launch(Context context, String targetClass);

    Fragment newUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);

}
