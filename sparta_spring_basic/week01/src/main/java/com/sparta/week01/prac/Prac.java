package com.sparta.week01.prac;


public class Prac {
    public static void main(String[] args) {

        String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int days = 35;
        Course course = new Course();

        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

    }
}


