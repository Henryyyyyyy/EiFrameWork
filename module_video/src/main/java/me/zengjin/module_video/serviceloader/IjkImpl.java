package me.zengjin.module_video.serviceloader;

import android.util.Log;

public class IjkImpl implements IPlayVideo{
    @Override
    public void onPlay() {
        Log.e("exo","ijk  play");
    }

    @Override
    public void onStop() {

    }

//    @Override
//    public void init(Context context) {
//
//    }
}
