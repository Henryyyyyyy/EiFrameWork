package me.zengjin.base_framework.demo;


import me.zengjin.base_framework.base.BasePresent;
import me.zengjin.base_framework.base.BaseView;

public class TestContract {


    public static abstract class Present extends BasePresent<View> {

        public Present(View view) {
            super(view);
        }

        public abstract void showTost(android.view.View view);

        public abstract void depositRefund(String id);
    }

    public interface View extends BaseView {

        void onRefundSuccess();
    }

}