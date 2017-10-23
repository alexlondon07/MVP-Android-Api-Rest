package io.github.alexlondon07.mvp_android_api_rest.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.github.alexlondon07.mvp_android_api_rest.helper.IValidateInternet;
import io.github.alexlondon07.mvp_android_api_rest.helper.ShowAlertDialogs;
import io.github.alexlondon07.mvp_android_api_rest.helper.ValidateInternet;
import io.github.alexlondon07.mvp_android_api_rest.presenter.BasePresenter;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements  IBaseView{

    private IValidateInternet validateInternet;
    private ProgressDialog progressDialog;
    private T presenter;
    private ShowAlertDialogs showAlertDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validateInternet = new ValidateInternet( BaseActivity.this );
        this.showAlertDialog =  new ShowAlertDialogs(this);
    }


    @Override
    public void showProgress(int message) {
        progressDialog.setMessage(getResources().getString(message));
        progressDialog.show();
    }

    public void createProgresDialog (){
        this.progressDialog = new ProgressDialog(this);
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void showMessage(String msj) {

    }

    public IValidateInternet getValidateInternet() {
        return validateInternet;
    }

    public void setValidateInternet(IValidateInternet validateInternet) {
        this.validateInternet = validateInternet;
    }

    public ProgressDialog getProgressDialog() {
        return progressDialog;
    }

    public void setProgressDialog(ProgressDialog progressDialog) {
        this.progressDialog = progressDialog;
    }

    public T getPresenter() {
        return presenter;
    }

    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }

    public ShowAlertDialogs getShowAlertDialog() {
        return showAlertDialog;
    }

    public void setShowAlertDialog(ShowAlertDialogs showAlertDialog) {
        this.showAlertDialog = showAlertDialog;
    }
}
