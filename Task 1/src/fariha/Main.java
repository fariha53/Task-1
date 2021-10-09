
/*
Name= Fariha Chowdhury
Id = 2012020053
Section = B
Email = cse_2012020053@lus.ac.bd
Date= 17/07/2021
*/
package fariha;
import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {

                Scanner input= new Scanner(System.in);
                String section;
                System.out.print("Enter your Section:");
                section = input.nextLine();
                 Info info = new Info();
                 Hobby hobby = new Hobby();
                 System.out.println("Name :"+ info.name);
                System.out.println("Section :"+ section);
                 System.out.println("ID : "+info.id);
                 System.out.println("Hobby Name : "+ hobby.hobbyName);





            }
        }
