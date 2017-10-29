package io.github.alexlondon07.mvp_android_api_rest.presenter;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.R;
import io.github.alexlondon07.mvp_android_api_rest.model.Course;
import io.github.alexlondon07.mvp_android_api_rest.repository.ICourseRepository;
import io.github.alexlondon07.mvp_android_api_rest.repository.RepositoryError;
import io.github.alexlondon07.mvp_android_api_rest.view.activities.ICourseView;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public class CoursePresenter extends BasePresenter<ICourseView> {

    private ICourseRepository courseRepository;

    public CoursePresenter(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void getCoursesPresenter(){
        if(getValidateInternet().isConnected()){
            createThreadCourse();
        }else {
            getView().showAlertDialog(R.string.error, R.string.validate_internet);
        }
    }

    private void createThreadCourse() {
        getView().showProgress(R.string.loading_message);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                getCourseRepository();
            }
        });
        thread.start();
    }

    public void getCourseRepository(){
        try {
            ArrayList<Course> courseArrayList = courseRepository.getCourseList();
            getView().showCourseList(courseArrayList);
        }catch (RepositoryError repositoryError){
            getView().showAlertError(R.string.error, R.string.validate_internet);
        }finally {
            getView().hideProgress();
        }
    }
}
