package io.github.alexlondon07.mvp_android_api_rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alexlondon07 on 10/11/17.
 */

public class SocialMedia implements Serializable {

    @SerializedName("id_social_media")
    @Expose
    private int idSocialMedia;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("icon")
    @Expose
    private String icon;


    public int getIdSocialMedia() {
        return idSocialMedia;
    }

    public void setIdSocialMedia(int idSocialMedia) {
        this.idSocialMedia = idSocialMedia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
