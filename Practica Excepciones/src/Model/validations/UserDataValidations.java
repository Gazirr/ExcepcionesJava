/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.validations;

import exceptions.NonAlphabeticException;
import exceptions.NonNumberException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabrielheralv
 */
public class UserDataValidations {



    public static void isNumeric(String num) throws NonNumberException {
        for (char a : num.toCharArray()) {
            if (!Character.isDigit(a)) {
                throw new NonNumberException("Puede contener palabras o letras");
            }
        }
    }

    public static void isAlphabetic(String word) throws NonAlphabeticException {
        for (char b : word.toCharArray()) {
            if (!Character.isAlphabetic(b)) {
                throw new NonAlphabeticException("Puede contener Numeros ");
            }
        }
    }

}
