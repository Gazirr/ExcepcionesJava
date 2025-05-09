/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.console;

import Model.validations.UserDataValidations;
import exceptions.NonAlphabeticException;
import exceptions.NonNumberException;
import java.util.Scanner;


/**
 *
 * @author gabrielheralv
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        do {
            System.out.println("------------------------------");
            System.out.println("MENU: ");
            System.out.println("1.- Tester isNumeric");
            System.out.println("2.- Tester isAlphabetic");
            System.out.println("9.- Salir");
            System.out.println("------------------------------");
            System.out.print("Option: ");
            option = sc.next();

            switch (option) {
                case "1":
                    testisNumeric();
                    break;
                case "2":
                    testisAlphabetic();
                    break;
                case "z":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Incorrect Option");
            }
        } while (!option.equals("z"));
    }

    

    static void testisNumeric() {
        System.out.println("--------Number Validator--------");
        System.out.println("                                ");
        System.out.println("--Enter Number--");
        String num = sc.next().replaceAll(" ", "");
        try{
           UserDataValidations.isNumeric(num); 
            System.out.println("Es un Numero");
        }catch (NonNumberException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        

    }

    static void testisAlphabetic() {
        System.out.println("--------Alphabetic Validator--------");
        System.out.println("                                    ");
        System.out.println("--Enter a Word--");
        String word = sc.next().replaceAll(" ", "");
        try{
            UserDataValidations.isAlphabetic(word);
            System.out.println("Es una Palabra");
        }catch(NonAlphabeticException ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
