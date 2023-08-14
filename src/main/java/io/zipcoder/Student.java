package io.zipcoder;
import java.util.*;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    List<Double> examScores;

    public Student(){
        firstName = "Jane";
        lastName = "Doe";
        examScores = new ArrayList<Double>();


    }

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = Arrays.asList(examScores);
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setExamScores(Double[] scores){
        this.examScores = Arrays.asList(scores);
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public double getExamScore(int exam){
        return examScores.get(exam);
    }

    public String getExamScores(){
        StringBuilder stringScores = new StringBuilder();

        stringScores.append("Exam Scores:\n");

        for (int i = 0; i < examScores.size(); i++){
            stringScores.append(String.format("    Exam %d -> %.0f\n", (i + 1), examScores.get(i)));
        }

        return stringScores.toString();
    }

    public void addExamScore(Double score){
        examScores.add(score);
    }

    public void setExamScore(Integer exam, Double score){
        examScores.set(exam - 1, score);
    }

    public Double getAverageExamScore(){
        double total = 0;

        for (Double s : examScores){
            total += s;
        }
        return (total / examScores.size());
    }

    public String toString(){
        StringBuilder string = new StringBuilder();

        string.append(String.format("Student Name: %s %s\n", firstName, lastName));
        string.append(String.format("> Average Score: %f\n", getAverageExamScore()));
        string.append(getExamScores());


        return string.toString();

    }
}
