package java8;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByCode {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sachin", 2));
        employees.add(new Employee("Rahul", 1));
        employees.add(new Employee("Sachin", 2));
        employees.add(new Employee("Neha", 1));
        employees.add(new Employee("Pooja", 3));

        //For GroupingBy pas 1 argument 2nd is default toList
        Map<Integer, Set<Employee>>map=employees.stream().collect(Collectors.groupingBy(e->e.getAge(),Collectors.toSet()));
        map.forEach((age,list)->
                System.out.println("Age:"+age +"->" + list)
        );

        //For GroupingBy pas 2 argument 2nd is default toList, but we can override
        Map<Integer,Set<Employee>>setMap=employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toSet()));
        System.out.println("**************************************");
        map.forEach((age,employee)->{
            System.out.println("Age:"+age +"->" + employee);
        });

        //For GroupingBy pas 3 argument 2nd is default toList, but we can override
//        1st -> for getAge
//        2nd -> for sorting
//        3rd -> collect into to List
        Map<Integer,Set<Employee>>sortedByAge=employees.stream().collect(Collectors.groupingBy(e->e.getAge(),TreeMap::new,Collectors.toSet()));
        System.out.println("**************************************");
        sortedByAge.forEach((age,sortedEmployees)->{
            System.out.println("Age:"+age +"->" + sortedEmployees);

        });
    }

}
