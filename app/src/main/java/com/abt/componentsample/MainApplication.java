package com.abt.componentsample;

import android.app.Application;

import com.abt.component_lib.AppConfig;
import com.abt.component_lib.IAppComponent;

public class MainApplication extends Application implements IAppComponent {

    private static MainApplication application;

    public static MainApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent)object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
