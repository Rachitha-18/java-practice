package streams;

import employee.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Level2StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 5, 3);
        List<String> names = Arrays.asList(
                "john",
                "ram",
                "smith",
                "alex",
                "john",
                "alex"
        );
        List<Employee> employees = Arrays.asList(
                new Employee("John", 28, 50000),
                new Employee("Alex", 35, 80000),
                new Employee("Ram", 24, 40000),
                new Employee("Smith", 45, 100000),
                new Employee("Amit", 30, 60000)
        );
        long evenCount=nums.stream().filter(n-> n%2 == 0).count();
        long nameStartWithACount=names.stream().filter(s -> s.startsWith("a")).count();
        int max =  nums.stream().max(Integer::compareTo).orElse(0);
        int min =  nums.stream().min(Integer::compareTo).orElse(0);
        int sum =  nums.stream().mapToInt(Integer::intValue).sum();
        double avg =  nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        long evenSum=nums.stream().filter(n-> n%2 == 0).mapToInt(Integer::intValue).sum();
        double avgSalary =  employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        Employee highestSalaryEmployee =  employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        Employee lowestSalaryEmployee =  employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
        //Even count
        System.out.println("Even count");
        System.out.println(evenCount);
        //Count of Names starts with 'a'
        System.out.println("Count of Names starts with 'a'");
        System.out.println(nameStartWithACount);
        //Max no
        System.out.println("Max no");
        System.out.println(max);
        //Min No
        System.out.println("Min No");
        System.out.println(min);
        //Sum of numbers
        System.out.println("Sum of numbers");
        System.out.println(sum);
        //Average of numbers
        System.out.println("Average of numbers");
        System.out.println(avg);
        //Sum of even nos
        System.out.println("Sum of even nos");
        System.out.println(evenSum);
        //Average Employee Salary
        System.out.println("Average Employee Salary");
        System.out.println(avgSalary);
        //Highest Salary Employee
        System.out.println("Lowest Salary Employee");
        System.out.println(lowestSalaryEmployee);

    }
}
