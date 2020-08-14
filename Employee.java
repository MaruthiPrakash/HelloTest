package com.PraticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
         int id;
         String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+" "+name;
    }
}
   class EmployeeTest{
       public static void main(String[] args) {
           List<Employee> list = new ArrayList<>();
           list.add(new Employee(111,"AAA"));
           list.add( new Employee(333,"CCC"));
           list.add(new Employee(222,"BBB"));

           Collections.sort(list,(e1,e2) -> (e1.id < e2.id) ? 1:(e1.id < e2.id) ? 0: -1);
           System.out.println(list);

       }
   }


