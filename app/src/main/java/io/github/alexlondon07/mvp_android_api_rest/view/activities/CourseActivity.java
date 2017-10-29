package io.github.alexlondon07.mvp_android_api_rest.view.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.R;
import io.github.alexlondon07.mvp_android_api_rest.model.Course;
import io.github.alexlondon07.mvp_android_api_rest.presenter.CoursePresenter;
import io.github.alexlondon07.mvp_android_api_rest.repository.CourseRepository;
import io.github.alexlondon07.mvp_android_api_rest.view.BaseActivity;
import io.github.alexlondon07.mvp_android_api_rest.view.adapter.CourseAdapter;

public class CourseActivity extends BaseActivity<CoursePresenter> implements ICourseView {

    private ListView courseList;
    private CourseAdapter courseAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        setPresenter(new CoursePresenter(new CourseRepository()));
        getPresenter().inject(this, getValidateInternet());
        createProgresDialog();
        getPresenter().getCoursesPresenter();

        courseList = (ListView) findViewById(R.id.course_list_view);


    }

    @Override
    public void showCourseList(final ArrayList<Course> courseArrayList) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                callAdapter(courseArrayList);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().getCoursesPresenter();
    }

    private void callAdapter(ArrayList<Course> courseArrayList) {
        courseAdapter = new CourseAdapter(this, R.id.course_list_view, courseArrayList);
        courseList.setAdapter(courseAdapter);
    }


    @Override
    public void showAlertDialog(final int title, final int message) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getShowAlertDialog().showAlertDialog(title, message, false, R.string.accept, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getPresenter().getCoursesPresenter();
                    }
                }, R.string.option_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
            }
        });
    }

    @Override
    public void showAlertError(int title, int message) {
        showAlertDialog(title, message);
    }
}
