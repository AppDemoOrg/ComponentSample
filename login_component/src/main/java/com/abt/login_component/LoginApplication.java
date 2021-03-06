package com.abt.login_component;

import android.app.Application;

import com.abt.component_lib.IAppComponent;
import com.abt.component_lib.ServiceFactory;

public class LoginApplication extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
