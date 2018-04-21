package me.zengjin.eiframework.demo.serviceloaders;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.ServiceLoader;

import me.zengjin.eiframework.MainActivity;
import me.zengjin.eiframework.R;
import me.zengjin.module_video.serviceloader.IPlayVideo;


/**
 * Created by Administrator on 2018/4/4.
 */
//@EntryGenerator(packageName = "asdas",entryTemplate = LoaderJavaActivity.class)
public class LoaderJavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        Log.e("iioos", "onCreate");
        ServiceLoader<IPlayVideo> serviceLoader = ServiceLoader.load(IPlayVideo.class);
        Iterator<IPlayVideo> it = serviceLoader.iterator();
        while (it.hasNext()) {
            IPlayVideo service = it.next();
           service.onPlay();
        }
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        Log.e("iioos", "jump");
    }
}, 4000);

    }
}
