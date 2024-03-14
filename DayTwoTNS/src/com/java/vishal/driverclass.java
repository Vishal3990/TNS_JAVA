package com.java.vishal;
import java.util.Scanner;

public class driverclass {
	    public static void main(String[] args) {

	        employee e1 = new employee();
	        Scanner sc = new Scanner(System.in);
	        int empid, empage;
	        long empnumber;
	        String empname, empadd;

	        System.out.println("For Default Constructor: ");
	        System.out.println("Enter Employee's Id: ");
	        empid = sc.nextInt();
	        System.out.println("Enter Employee's Age: ");
	        empage = sc.nextInt();
	        System.out.println("Enter Employee's Phone Number: ");
	        empnumber = sc.nextLong();
	        sc.nextLine();
	        System.out.println("Enter Employee's Name: ");
	        empname = sc.nextLine();
	        System.out.println("Enter Employee's Address: ");
	        empadd = sc.nextLine();

	        e1.setEmployeeId(empid);
	        e1.setAge(empage);
	        e1.setEmployeeName(empname);
	        e1.setEmployeeaddress(empadd);
	        e1.setEmployeeNo(empnumber);

	        System.out.println(e1);

	        System.out.println("For Parameterized Construction");
	        System.out.println("Enter Employee's Id: ");
	        empid = sc.nextInt();
	        System.out.println("Enter Employee's Age: ");
	        empage = sc.nextInt();
	        System.out.println("Enter Employee's Phone Number: ");
	        empnumber = sc.nextLong();
	        sc.nextLine();
	        System.out.println("Enter Employee's Name: ");
	        empname = sc.nextLine();
	        System.out.println("Enter Employee's Address: ");
	        empadd = sc.nextLine();

	        employee e2 = new employee(empid,empage,empname,empadd,empnumber);
	        System.out.println(e2);
	        sc.close();
	    }
	}
