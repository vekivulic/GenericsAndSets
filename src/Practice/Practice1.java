/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Address;
import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vekivulic
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Integer x=1;
         int primitive=x;
        
        
        List<String> list= new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
//        String value=list.get(1);
//        System.out.println(value);
        list.add("Cao)");
        list.add("Bye");
        
        list.add(2, "Zdravo");
        list.set(3, "Dovidjenja");
      //  boolean b=contains.list("Zdravo");
        
        Set<String>noDupes=new HashSet<>(list);
        // lets me populate all the sets with valubes from list 
        list=new ArrayList<>(noDupes);
        // list has no dupicates now 
        
        String s=list.get(2);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(String item: list){
            System.out.println(item);
        }
    }
}
//    
//    Address address= new Address("","","","","","","");
//    address.setAddress1("1234 St ");
//    address.setCity("Milwaukee");
//    address.setState("WI");
//    address.setZipCode("53228");
//    address.setEmail("veki@mmexpresswi.com");
//    address.setPhone("414-321-0034");
//        System.out.println(address.toString());
//        
//        Address address1= new Address();
//    address1.setAddress1("1234 St ");
//    address1.setCity("Chicago");
//    address1.setState("WI");
//    address1.setZipCode("53228");
//    address1.setEmail("veki@mmexpresswi.com");
//    address1.setPhone("414-321-0034");
//    
//    if(address.equals(address1)){
//        System.out.println("The address are the Same ");
//    }else{
//        System.out.println("The addresses are not the same ");
//    }
//    // NEVER TEST OBJECTS ==  use equals method 
//    List<Address>addresses=new ArrayList<>();
//    if(address.getCity().equals("Milwaukee")){
//    addresses.add(address);
//    }
//    if(address1.equals(address)){
//    addresses.add(address1);
//    }
//    for (Address a: addresses){
//        System.out.println(a);
//    }
//     Set<String>noDupes=new HashSet<>(list);
//        // lets me populate all the sets with valubes from list 
//        list=new ArrayList<>(noDupes);
//        // list has no dupicates now 
//        
//    Employee e1 =new Employee("Smith", "Bob", "98080808080","");
//    
//    List employeeList=new ArrayList();
//    employeeList.add(e1);
//    
//    for(Object e: employeeList){
//        Employee emp=(Employee)e;
//        System.out.println(emp);
//    }
//    }
//}
