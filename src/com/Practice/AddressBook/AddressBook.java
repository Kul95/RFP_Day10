package com.Practice.AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Person p1 = new Person("Kuldeep", "Sharma", "IMT", "Gurgoan", "Hariyana", 678579,87659825,"kuldeep@gmail.com");
        Person p2 = new Person("Summit", "Yadav", "Bandra", "Mumbai", "Maharastra", 546739,98345623,"xyz@gmail.com");
        Person p3 = new Person("Komal", "Sinde", "xyz", "Nagpur", "Maharastra", 256534,896598323,"john@gmail.com");
        Person p4 = new Person("Yogendran", "Saini", "abc", "Haydrabad", "Telengana", 125034,67452983,"harry@gmail.com");
        HashMap<Long, Person> list1 = new HashMap<>();
        list1.put(p1.phoneNumber, p1);
        list1.put(p2.phoneNumber, p2);
        list1.put(p3.phoneNumber, p3);
        list1.put(p4.phoneNumber, p4);
//        System.out.println(list1);


// Search by name......
        System.out.println(list1.containsValue(p1));
        if (list1.containsValue("Sumit")) {
            System.out.println("Value is present in the HashMap.");
        } else {
            System.out.println("value is not present ");
        }

        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println(" 1  Insert ");
            System.out.println(" 2  Delete ");
            System.out.println(" 3  Display ");
            System.out.println(" 4  Update");
            System.out.println("Enter your choice!");


            ch = sc.nextInt();
            switch (ch) {
                // Create
                case 1:
                    System.out.println(list1.put(p1.phoneNumber, p1));
                    System.out.println(list1.put(p2.phoneNumber, p2));
                    System.out.println(list1.put(p3.phoneNumber, p3));
                    System.out.println(list1.put(p4.phoneNumber, p4));

                    break;
                // delete operation
                case 2:
                    System.out.println(list1.remove(p1.phoneNumber));

                    break;
                //display.....
                case 3:
                    for (Map.Entry<Long, Person> entry : list1.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    //Update...
                case 4:

                    Scanner sc1=new Scanner(System.in);
                    System.out.println("Enter your phone number:");
                    int val=sc.nextInt();
                    for(Map.Entry<Long,Person>entry:list1.entrySet()){
                        if(entry.getValue().phoneNumber==val) {
                            System.out.println(list1.remove(entry.getKey()));
                            break;

                        }
                    }

            }
        }
        while (ch != 0);
    }
}
