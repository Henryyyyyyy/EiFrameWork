package me.zengjin.eiframework.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.ServiceLoader;

import me.zengjin.eiannotations.EntryGenerator;
import me.zengjin.eiframework.R;



/**
 * Created by Administrator on 2018/4/4.
 */
@EntryGenerator(packageName = "asdas",entryTemplate = LoaderJavaActivity.class)
public class LoaderJavaActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        Log.e("iioos","onCreate");
        ServiceLoader<IMyServiceLoader> serviceLoader = ServiceLoader.load(IMyServiceLoader.class,IMyServiceLoader.class.getClassLoader());
        Iterator<IMyServiceLoader> it = serviceLoader.iterator();
        if (it.hasNext()) {
            Log.e("iioos","---"+it.next().sayHello());

        }

    }
}
