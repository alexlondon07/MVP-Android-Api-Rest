package io.github.alexlondon07.mvp_android_api_rest.view.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import io.github.alexlondon07.mvp_android_api_rest.R;
import io.github.alexlondon07.mvp_android_api_rest.model.Course;

/**
 * Created by alexlondon07 on 10/22/17.
 */

public class CourseAdapter extends ArrayAdapter<Course> {

    private ArrayList<Course> courseArrayList;
    private Activity context;
    private Course course;
    private TextView name, theme, project, teacher;

    public CourseAdapter(Activity context,  int resource, ArrayList<Course> courseArrayList){
        super(context, resource, courseArrayList);
        this.context = context;
        this.courseArrayList = courseArrayList;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_item, parent, false);
        this.course = this.courseArrayList.get(position);
        loadView(convertView);
        name.setText(course.getName());
        theme.setText(course.getThemes());
        project.setText(course.getProject());
        return convertView;
    }

    private void loadView(View convertView) {
        name = convertView.findViewById(R.id.course_item_name);
        theme = convertView.findViewById(R.id.course_item_theme);
        project = convertView.findViewById(R.id.course_item_project);
    }

}
