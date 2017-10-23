package io.github.alexlondon07.mvp_android_api_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by alexlondon07 on 10/11/17.
 */

public class Course implements Serializable {

    @SerializedName("id_course")
    @Expose
    private int idCourse;

    @SerializedName("name")
    @Expose
    private String name;


    @SerializedName("themes")
    @Expose
    private String themes;

    @SerializedName("project")
    @Expose
    private String project;


    @SerializedName("teacher")
    @Expose
    private ArrayList<Teacher> teacher;



    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teacher = teacher;
    }
}
