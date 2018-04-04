package me.zengjin.base_framework.demo;

import android.content.Intent;

import me.zengjin.base_framework.BR;
import me.zengjin.base_framework.R;
import me.zengjin.base_framework.base.AbstractDataBindingActivity;
import me.zengjin.base_framework.databinding.ActivityVmTestBinding;


public class VmTestActivity extends AbstractDataBindingActivity<MyPresenter,ActivityVmTestBinding> implements TestContract.View {



    @Override
    public int setContentView() {
        return R.layout.activity_vm_test;
    }
    @Override
    protected void initData() {
        binding.setVariable(BR.presenter,presenter);
    }

    @Override
    protected MyPresenter newPresent() {
        return new MyPresenter(this);
    }

    @Override
    public void onRefundSuccess() {
        startActivity(new Intent(VmTestActivity.this,VmTestActivity.class));
    }
}
