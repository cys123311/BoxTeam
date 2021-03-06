package com.example.boxteam.lc.base;



import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.lc.interfaces.IBasePresenter;
import com.example.boxteam.lc.interfaces.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView {


    protected P presenter;
    Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = getLayout();
        if(layout <= 0){
            new RuntimeException("layout id not allow 0 or <0");
        }else{
            setContentView(getLayout());
        }
        unbinder = ButterKnife.bind(this);
        presenter = createPrenter();
        if(presenter != null){
            presenter.attachView(this);
        }
        initView();
        initData();
    }

    protected abstract int getLayout();
    protected abstract P createPrenter();
    protected abstract void initView();
    protected abstract  void initData();

    @Override
    public void showLoading(int visible) {

    }

    @Override
    public void showToast(String tips) {
        Toast.makeText(this, "没有数据", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.unAttachView();
        }
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
