package me.zengjin.module_video.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2018/4/8.
 */

public class BannerView extends View implements IBaseLifecycleView {
    public BannerView(Context context) {
        super(context);
    }

    public BannerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BannerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
    }


    @Override
    public void oncreate() {
        Log.e("qwrex","oncreate");
    }
}
