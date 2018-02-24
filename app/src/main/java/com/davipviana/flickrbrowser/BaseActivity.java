package com.davipviana.flickrbrowser;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Davi Viana on 15/02/2018.
 */

public class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;
    public static final String FLICKR_QUERY = "FLICKR_QUERY";
    public static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    protected Toolbar activateToolbar() {
        if(this.toolbar == null) {
            this.toolbar = (Toolbar) findViewById(R.id.app_bar);

            if(this.toolbar != null) {
                setSupportActionBar(this.toolbar);
            }
        }

        return this.toolbar;
    }

    protected Toolbar activateToolbarWithHomeEnabled() {
        activateToolbar();

        if(this.toolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        return this.toolbar;
    }

}
