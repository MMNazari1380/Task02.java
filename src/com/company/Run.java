package com.company;

/**
 * @author MMNazari1380
 * @version 1
 */
public class Run {
    public static void main(String[] args) {
      Student nafare1 = new Student("Ehsan","Edalat","9031066",12);
      Student nafare2 = new Student("Seyed","Ahamdpanah","9031806",13);
      Student nafare3 = new Student("Ahamd","Asadi","9031054",14);

      nafare1.print();
      nafare1.setGrade(15);
      nafare1.print();

      nafare2.print();
      nafare2.setGrade(11);
      nafare2.print();

      nafare3.print();
      nafare3.setFirstName("Hamidreza");
      nafare3.print();


      Lab lab1 = new Lab(22,30,"yekshanbe");
      lab1.enrollStudent(nafare1);
      lab1.enrollStudent(nafare2);
      lab1.enrollStudent(nafare3);
      lab1.print();
    }
}
