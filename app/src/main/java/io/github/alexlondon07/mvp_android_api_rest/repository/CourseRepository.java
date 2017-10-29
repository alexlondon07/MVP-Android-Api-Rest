package io.github.alexlondon07.mvp_android_api_rest.repository;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.helper.ServicesFactory;
import io.github.alexlondon07.mvp_android_api_rest.model.Course;
import io.github.alexlondon07.mvp_android_api_rest.services.ICoursesServices;
import retrofit.RetrofitError;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public class CourseRepository  implements ICourseRepository{

    private ICoursesServices services;

    public CourseRepository() {
        ServicesFactory servicesfactory = new ServicesFactory();
        services = (ICoursesServices) servicesfactory.getInstance(ICoursesServices.class);
    }

    @Override
    public ArrayList<Course> getCourseList() throws RepositoryError {
        try {
            ArrayList<Course> courses = services.getCourseList();
            return courses;
        }catch (RetrofitError repositoryError) {
            repositoryError.printStackTrace();
            throw MapperError.convertRetrofitErrorToRepositoryError(repositoryError);
        }
    }
}
