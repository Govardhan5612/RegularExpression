package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Govardhan Reddy
 */
public class UserRegistration {
    /**
     * Create a class for user registration
     */
    Scanner input = new Scanner(System.in);

    public void validFirstName() {
        /**
         * UC1 Regular expression for user first name
         */
        System.out.print("Enter first name (First letter Upper case and minimum three letters) : ");
        String firstName = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (status == true) {
            System.out.println(firstName + " is valid first name");
        } else {
            System.out.println(firstName + " is not valid first name");
            validFirstName();
        }

    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validFirstName();
    }
}
