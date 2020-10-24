package edu.csustan.cs4950.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("REGfjwIK73SazKlAW4cj5EHr2wp2ZmVYhAHQJGAX")
                .clientKey("BfQAHDIfRnD5O27mjZ3FQSEubDkvAoEv9QCintBL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
