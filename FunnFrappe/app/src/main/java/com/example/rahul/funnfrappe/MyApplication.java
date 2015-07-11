package com.example.rahul.funnfrappe;

import android.app.Application;
import android.content.Context;

/**
 * Created by rahul on 7/9/2015.
 */
 public class MyApplication extends Application {

        private static Context context;

        public void onCreate(){
            super.onCreate();
            MyApplication.context = getApplicationContext();
        }

        public static Context getAppContext() {
            return MyApplication.context;
        }
    }

