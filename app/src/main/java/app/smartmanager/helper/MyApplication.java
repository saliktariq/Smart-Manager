package app.smartmanager.helper;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
//    @SuppressLint("StaticFieldLeak")
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    private static int userAccessLevel = 0; //Review later for alternative way to set permission

    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getContext() {
        return MyApplication.context;
    }

    public static boolean setUserAccessLevel(int accessLevel){ //Review later for alternative
        userAccessLevel = accessLevel;
        return true;
    }

}