package com.example.boxteam.lc.base;


import com.example.boxteam.lc.interfaces.IBaseModel;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseModel implements IBaseModel {

    CompositeDisposable compositeDisposable = new CompositeDisposable();


    @Override
    public void addDisposable(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    @Override
    public void clear() {
        compositeDisposable.clear();
    }
}
