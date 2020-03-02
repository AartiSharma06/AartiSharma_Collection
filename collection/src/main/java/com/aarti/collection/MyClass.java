package com.aarti.collection;

import java.util.Scanner;

class MyClass{
	public static void main(String[] args) {
		CustomCollection<Integer> list = new CustomCollection<Integer>();
		 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("Default List  : "+list);
        System.out.println("Enter a number to add");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        list.add(x);
        
        System.out.println("List after addition of element : "+list);
         
        list.remove(0);
        System.out.println("List after removal of element from 0 index : "+list);
         
        System.out.println("Element at 0 index : " +list.get(0) );
        System.out.println("Element at 1 index : " +list.get(1) );
 
        System.out.println("Size of List : " +list.size());
	}
}
