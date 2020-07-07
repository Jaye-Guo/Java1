package ws5;

	import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
	
public class StreamWorkshop {
	 public static void main(String[] args) {
	    List<Staff> staffList = new ArrayList<>();
	    staffList.add(new Staff("6c0231c1", "John", 5, 4293));
	    staffList.add(new Staff("270d0145", "Mike", 6, 6530));
	    staffList.add(new Staff("e75a1d7e", "Jean", 3, 2220));
	    staffList.add(new Staff("c1c0a83a", "Kim", 4, 3390));
	           
	    
	    // Exercise 1: Using streams' forEach(), 
	    // print the name of every staff
	    System.out.println("[Exercise 1: ForEach]");
	    staffList.forEach(s -> System.out.println(s.getName()));

	    // Exercise 2: Using streams' sum(), compute 
	    // the total salary of all staff
	    System.out.println("\n[Exercise 2: Sum]");
	    double sum = staffList.stream().map(s -> s.getSalary()).reduce((s1,s2) -> s1+s2).get();
	    System.out.println(sum);
	    
	    // Exercise 3: Using streams' filter(), 
	    // retrieve all salary that are more than 
	    // 3500 into a List, then print each of the 
	    // object within the List
	    System.out.println("\n[Exercise 3: Filter]");
	    staffList.stream().filter(s -> s.getSalary() > 3500).forEach(System.out::println);
	    
	    // Exercise 4: Using streams' map(), print 
	    // the list of increments that are less 
	    // than 200; given a staff's increment is 
	    // such that a grade of 5 and above 
	    // will yield a 8% increment (off of the staff's 
	    // current salary), while any other grades
	    // will only yield a 4% increment.
	    System.out.println("\n[Exercise 4: Map]");
	    //List<Staff> salaryIncrement = new S();
	    staffList.stream().map(s -> {if (s.getGrade() >= 5)
	    	return s.getSalary()*0.08;
	    return s.getSalary()*0.04;}).forEach(s -> {if (s >200)
	    	System.out.println(s);
	    });
	    
	    
	    // Exercise 5: Using streams' sort(), sort 
	    // the staff by salary in ascending 
        // order (least salary first) and print out
	    // each staff object
	    // You may need to add necessary methods
	    // to Staff class 
	    System.out.println("\n[Exercise 5: Sort]");
	    staffList.stream().sorted(Comparator.comparing(Staff::getSalary)).forEach(System.out::println);
	    
	    
	    // Exercise 6: Using streams' max(), display 
	    // the highest salary among the staff      
	    System.out.println("\n[Exercise 6: Max]");
	    Float max = staffList.stream().map(p -> p.salary).max((p1, p2) -> {if (p1>p2) 
	    	return 1;
	    if (p1<p2)
	    	return -1;
	    return 0;
	    }).get();
	    System.out.println(max);
	    
	    // Exercise 7: Using streams' reduce(), 
	    // implement your own "max" function 
	    // to display the highest salary among the staff
	    System.out.println("\n[Exercise 7: Reduce]");
	    Staff maxSalary = staffList.stream().reduce((p1,p2) -> 
	    {if (p1.getSalary() > p2.getSalary())
    		return p1;
    	return p2;}).get();
	    System.out.println(maxSalary);
	    
	 }


}
