package io.github.alexlondon07.mvp_android_api_rest.view.activities;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.model.Course;
import io.github.alexlondon07.mvp_android_api_rest.view.IBaseView;

/**
 * Created by alexlondon07 on 10/25/17.
 */

public interface ICourseView extends IBaseView {

    void showCourseList(ArrayList<Course> courseArrayList);

    void showAlertDialog(int error, int validate_internet);

    void showAlertError(int title, int message);
}
