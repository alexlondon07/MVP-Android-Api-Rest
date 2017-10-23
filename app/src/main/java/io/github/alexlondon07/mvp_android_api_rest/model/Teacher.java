package io.github.alexlondon07.mvp_android_api_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by alexlondon07 on 10/11/17.
 */

public class Teacher implements Serializable {

    @SerializedName("id_teacher")
    @Expose
    private int idTeacher;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("avatar")
    @Expose
    private String avatar;

    @SerializedName("teacherSocialMedias")
    @Expose
    private ArrayList<SocialMedia> teacherSocialMedias;


    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ArrayList<SocialMedia> getTeacherSocialMedias() {
        return teacherSocialMedias;
    }

    public void setTeacherSocialMedias(ArrayList<SocialMedia> teacherSocialMedias) {
        this.teacherSocialMedias = teacherSocialMedias;
    }
}
