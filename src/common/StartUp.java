/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Employee e1 =new Employee("Veki", "Vulic", "500-00-0000");
    Employee e2 =new Employee("Karl", "Smidth", "500-56-0078");
    Employee e3 =new Employee("Emily", "Brown", "500-55-5555");
    Employee e4 =new Employee("Jordan", "MayFlower", "500-09-0990");
    
    
    
    //Lab #2 – Create a List of Employee objects without using Generics. 
   
    List employeeList=new ArrayList();
    employeeList.add(e1);
    employeeList.add(e2);
    employeeList.add(e3);
    employeeList.add(e4);
  
     for(Object e: employeeList){
        Employee emp=(Employee)e;
        System.out.println(emp);
    }
        
    //Lab #3 – do the same work as you did in lab #2 but this time use generics    
    List <Employee> genericList=new ArrayList<>();
    genericList.add(e1);
    genericList.add(e2);
    genericList.add(e3);
    genericList.add(e4);
        
    for(Employee e: genericList){
       
        System.out.println(e);
    }
    
    
    //Lab #4 – Create 4 dog objects, making sure you have at least one duplicate 
    Dog dog1=new Dog("Husky", 12345);
    Dog dog2=new Dog("Pug", 1236);
    Dog dog3= new Dog("Poodle",1245);
    Dog dog4=new Dog("Husky",12345);
    
    List <Dog> dogList=new ArrayList<>();
    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);
    dogList.add(dog4);
    
        System.out.println("\nDog list with duplicates :\n");
    for (Dog d: dogList){
        System.out.println(d);
    }
        System.out.println("\nDog set without duplicates: \n");
    Set <Dog> dogSet=new HashSet<>();
    dogSet.addAll(dogList);
    
    for(Dog d: dogSet){
        System.out.println(d);
    }
    }
    
}
