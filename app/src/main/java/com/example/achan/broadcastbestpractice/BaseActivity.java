package com.example.achan.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Achan on 2016/10/12.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityController.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}
