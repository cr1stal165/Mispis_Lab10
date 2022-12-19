package silnov.course;

import silnov.course.Lecturer;

import java.util.*;

public class Course {

    public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
        this.lecturers = teaches;
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    private Collection<Lecturer> lecturers;
    private String name;
    private int id;
    private float hours;

    public void addLecturerToCourse() {

    }

    public void removeLecturerFromCourse() {

    }

    public Collection<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(Collection<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}