package com.company;

/**
 * class Student
 * @author MMNazari1380
 * @version 1
 */

public class Student {

    private String firstName;
    private String lastName;
    private String id;
    private int grade;


    /**
     *
     * @param nam first name of student
     * @param family last name of student
     * @param ID id of studene
     * @param nomre nomre of student
     */
    public Student(String nam,String family,String ID,int nomre){
        firstName=nam;
        lastName=family;
        id=ID;
        grade=nomre;


    }

    /**
     * gets the first name
     * @return first name field
     */

    public String getFirstName(){

        return firstName;
    }

    /**
     * sets first name field
     * @param nam
     */
    public void setFirstName(String nam){

        firstName=nam;
    }

    /**
     * gets last name
     * @return last name field
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * sets last name
     * @param family
     */
    public void setLastName(String family){

        lastName=family;
    }

    /**
     * gets id
     * @return id field
     */
    public String getID(){

        return id;
    }

    /**
     * sets id
     * @param ID
     */
    public void setID(String ID){
        id=ID;
    }

    /**
     * gets grade
     * @return grade
     */
    public int getGrade(){
        return grade;
    }

    /**
     * sets grade
     * @param nomre
     */
    public void setGrade(int nomre){
        grade=nomre;
    }

    /**
     * prints the students fields
     */
    public void print(){
        System.out.print("first name : "+firstName);
        System.out.print("            last name :"+lastName);
        System.out.print("             id : "+id);
        System.out.println("           grade : "+grade);
    }
}
