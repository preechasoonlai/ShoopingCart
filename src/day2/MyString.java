/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;
import java.util.Scanner;
/**
 *
 * @author ARIT
 */
public class MyString {
    public static void main(String arge[]){
        
        System.out.print("Please enter your firt and last name:");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int spaceIndex = input.indexOf(" ");
        String firstName = input.substring(0,spaceIndex);
        String lastName = input.substring(spaceIndex);
        
        System.out.println("first name = " + firstName) ;
        System.out.println("last name = " + lastName) ;
    }
}
