package io.github.alexlondon07.mvp_android_api_rest.presenter;

import io.github.alexlondon07.mvp_android_api_rest.helper.IValidateInternet;
import io.github.alexlondon07.mvp_android_api_rest.view.IBaseView;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public class BasePresenter <T extends IBaseView> {
    private T view;
    private IValidateInternet validateInternet;

    public BasePresenter() {
    }

    public void inject(T view, IValidateInternet validateInternet){
        this.view = view;
        this.validateInternet = validateInternet;
    }

    public T getView() {
        return view;
    }

    public IValidateInternet getValidateInternet() {
        return validateInternet;
    }

}
