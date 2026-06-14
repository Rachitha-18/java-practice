package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Level1StreamPractice {
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
        List<Integer> evenList=nums.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
        List<Integer> oddList=nums.stream().filter(n-> n%2 != 0).collect(Collectors.toList());
        List<Integer> numGreaterThanFive=nums.stream().filter(n-> n > 5).collect(Collectors.toList());
        List<String> nameList=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<Integer> nameLength=names.stream().map(String::length).collect(Collectors.toList());
        List<Integer> sortedNums=nums.stream().sorted().collect(Collectors.toList());
        List<Integer> descSortedNums=nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> uniqueNums=nums.stream().distinct().collect(Collectors.toList());
        List<Integer> firstThreeNums=nums.stream().limit(3).collect(Collectors.toList());
        List<String> nameListUpper=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        List<Integer> numDivByThreeList=nums.stream().filter(n-> n%3 == 0).collect(Collectors.toList());
        List<String> nameListA=names.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        List<String> nameLowerList=nameList.stream().map(String::toLowerCase).collect(Collectors.toList());
        //Even nos
        System.out.println("Even nos");
        evenList.forEach(System.out::println);
        //Odd nos
        System.out.println("Odd nos");
        oddList.forEach(System.out::println);
        //Greater than Five
        System.out.println("Greater than Five");
        numGreaterThanFive.forEach(System.out::println);
        //Uppercase Names
        System.out.println("Uppercase Names");
        nameList.forEach(System.out::println);
        //Length of each Names
        System.out.println("Length of each Names");
        nameLength.forEach(System.out::println);
        //Ascending sorted Names
        System.out.println("Ascending sorted Names");
        sortedNums.forEach(System.out::println);
        //Descending sorted Names
        System.out.println("Descending sorted Names");
        descSortedNums.forEach(System.out::println);
        //Unique nos
        System.out.println("Unique nos");
        uniqueNums.forEach(System.out::println);
        //First Three nos
        System.out.println("First Three nos");
        firstThreeNums.forEach(System.out::println);
        //Uppercase Names & sorted
        System.out.println("Uppercase Names");
        nameListUpper.forEach(System.out::println);
        //Lowercase Names
        System.out.println("Lowercase Names");
        nameLowerList.forEach(System.out::println);
        //Names starts with 'a'
        System.out.println("Names starts with 'a'");
        nameListA.forEach(System.out::println);
        //No divisible by 3
        System.out.println("No divisible by 3");
        numDivByThreeList.forEach(System.out::println);
    }

}
