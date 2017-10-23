package io.github.alexlondon07.mvp_android_api_rest.services;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.model.Course;
import retrofit.http.GET;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public interface ICoursesServices {

    @GET("/courses")
    ArrayList<Course> getCourseList();
}
