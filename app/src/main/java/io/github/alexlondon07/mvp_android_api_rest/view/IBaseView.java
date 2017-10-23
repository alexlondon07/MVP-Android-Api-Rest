package io.github.alexlondon07.mvp_android_api_rest.view;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public interface IBaseView {

    public void showProgress(int message);
    public void hideProgress();
    public void showMessage(String msj);
}
