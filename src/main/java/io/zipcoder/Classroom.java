package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Classroom {
    Student[] students;

    public Classroom(){
        students = new Student[30];
    }

    public Classroom(int numStudents){
        students = new Student[numStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Student[] getStudents(){
        return students;
    }

    public double getAverageExamScore(){
        double total = 0;
        for (Student s : students){
            total += s.getAverageExamScore();
        }
        return (total / students.length);
    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                continue;
            }
            else {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        Student[] updatedArray = new Student[students.length - 1];
        int index = 0;

        for (int i = 0; i < students.length; i++){
            if ((students[i].getFirstName() == firstName) && (students[i].getLastName() == lastName)){
                continue;
            }
            else{
                updatedArray[index] = students[i];
            }
            index++;
        }

        students = updatedArray;
    }

    public Student[] getStudentsByScore(){
        List<Double> list = new ArrayList<>();
        Student[] array = new Student[students.length];

        for (int i = 0; i < students.length; i++){
            list.add(students[i].getAverageExamScore());
        }
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < students.length; i++){

        }

        return array;
    }

    public Map<Student, String> getGradeBook(){
        return null;
    }
}
