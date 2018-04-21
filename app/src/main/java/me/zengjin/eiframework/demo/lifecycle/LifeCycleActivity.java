package me.zengjin.eiframework.demo.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.zengjin.module_video.ui.BannerView;

public class LifeCycleActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BannerView view=new BannerView(this);
        getLifecycle().addObserver(view);
        setContentView(view);
        new Thread(() -> {

        }).start();
    }
}
