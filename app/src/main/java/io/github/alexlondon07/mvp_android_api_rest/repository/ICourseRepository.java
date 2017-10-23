package io.github.alexlondon07.mvp_android_api_rest.repository;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.model.Course;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public interface ICourseRepository {

    ArrayList<Course> getCourseList() throws RepositoryError;
}
