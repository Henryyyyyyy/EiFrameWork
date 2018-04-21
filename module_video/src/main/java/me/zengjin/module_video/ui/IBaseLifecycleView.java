package me.zengjin.module_video.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * Created by Administrator on 2018/4/8.
 */

public interface IBaseLifecycleView extends LifecycleObserver{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void oncreate();

}
