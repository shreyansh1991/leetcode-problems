package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomClassComparableTest {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(30, "Shreyansh"));
        employeeList.add(new Employee(31, "Swapnil"));
        employeeList.add(new Employee(29, "Sarjit"));
        employeeList.add(new Employee(28, "Shubham"));
        employeeList.add(new Employee(32, "Raghvendra"));
        employeeList.add(new Employee(33, "Saurabh"));
        employeeList.add(new Employee(25, "Pranjal"));
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }


}
