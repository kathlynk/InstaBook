package com.example.instabook;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yll1cl2mbGBXEDxTWBBvUND5cyaQmkSsBRh2YAio")
                .clientKey("STm1WfPdzV2OJQK8Vp9fYEZyI3pXDOkMwj3OZKss")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
