package com.company;

/**
 * @author MMNazari1380
 * @version 1
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    int sum;

    /**
     *
     * @param current for classes population
     * @param cap for max population
     * @param d day
     */
    public Lab(int current,int cap, String d) {

        currentSize=0;
        day = d;
        capacity = cap;
        students=new Student[cap];
    }

    /**
     * for enrolling students
     * @param nafar for enrolled student
     */
    public void enrollStudent(Student nafar) {
        if (currentSize < capacity) {
            students[currentSize] = nafar;
            currentSize++;
        }
        else
            System.out.println("Lab is full!!");
    }

    /**
     * prints Student informations
     */
    public void print() {
        for(int i=0;i< currentSize;i++){
            System.out.println("first name : "+students[i].getFirstName());
            System.out.println("last name : "+students[i].getLastName());
            System.out.println("id : "+students[i].getID());
            System.out.println("grade : "+students[i].getGrade());
        }

        System.out.println("average : "+avg);
    }

    /**
     * gets current
     * @return current population
     */
    public int getCurrentSize(){

        return currentSize;
    }

    /**
     * sets population
     * @param current for population
     */
    public void setCurrentSize(int current){

        currentSize=current;
    }

    /**
     * gets students
     * @return students
     */
    public Student[] getStudents() {

            return students;
    }

    /**
     * sets students
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     *
     * @return avg
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculates average
     */
    public void calculateAvg() {
        for(int i=0;i< currentSize;i++){

            sum+=students[i].getGrade();
        }
        avg=sum/currentSize;
    }

    /**
     * gets day
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     *  sets day
     * @param d for day
     */
    public void setDay(String d) {
        day=d;
    }

    /**
     * gets capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets cappacity
     * @param cap
     */
    public void setCapacity(int cap) {
        capacity=cap;
    }
}