package io.github.alexlondon07.mvp_android_api_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alexlondon07 on 10/18/17.
 */

public class CourseResponse implements Serializable {

    @SerializedName("status")
    @Expose
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
