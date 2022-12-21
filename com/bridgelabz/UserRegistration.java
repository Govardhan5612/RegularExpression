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

    public void validLastName() {
        /**
         * UC2 Regular expression for user last name
         */
        System.out.print("Enter last name (First letter upper case minimum three letters) : ");
        String lastName = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        if (status == true) {
            System.out.println(lastName + " is valid last name");
        } else {
            System.out.println(lastName + " is not valid last name");
            validLastName();
        }
    }

    public void valid_email() {
        /**
         * UC3 Regula expression for email
         * Eg :- abc.xyz@bl.co.in
         */
        System.out.print("Enter email id (abc.xyz@bl.co.in) : ");
        String email = input.next();
        boolean status = Pattern.compile("[a-z]{3,}[.]{1}[a-z]{0,}[@]{1}[a-z]{2,}[.]{1}[co]{2}[.]{1}[in]{0,2}").matcher(email).matches();
        if (status == true) {
            System.out.println(email + " is valid email");
        } else {
            System.out.println(email + " is not valid email");
            valid_email();
        }
    }

    public void validMobileNumber() {
        /**
         * UC4 Regular expression for mobile number with country code
         */
        System.out.print("Enter mobile number with country code (91 9XXXXXXXXX) : ");
        String mobileNumber = input.nextLine();
        boolean status = Pattern.compile("[0-9]{1,3}[ ]{1}[7-9]{1}[0-9]{9}").matcher(mobileNumber).matches();
        if (status == true) {
            System.out.println(mobileNumber + " is valid mobile number");
        } else {
            System.out.println(mobileNumber + " is not valid mobile number");
            validMobileNumber();
        }
    }

    public void validPassword() {
        /**
         * Regular expression for password
         * UC5 -Rule 1 : minimum 8 characters
         * UC6 -Rule 2 : minimum one upper case
         * UC7 -Rule 3 : Minimum one numeric value
         * UC8 -Rule 4 : Exactly one special Character
         */
        System.out.print("Enter password : ");
        String password = input.next();
        boolean status = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&*]).{8,}$").matcher(password).matches();
        if (status == true) {
            System.out.println(password + " is valid password");
        } else {
            System.out.println(password + " is not valid password");
            validPassword();
        }
    }

    public void emailSamples() {
        /**
         * UC9 : Test all email samples valid and invalid emails
         */
        System.out.print("Enter email : ");
        String email = input.next();
        boolean status = Pattern.compile("[a-z]{3,}[-.+]{0,1}[10]{0,3}[@]{1}[10]{0,3}[a-z]{0,5}[.]{0,1}[a-z]{0,3}[,.]{0,1}[a-z]{0,3}").matcher(email).matches();
        if (status == true) {
            System.out.println(email + " is valid email");
        } else {
            System.out.println(email + " is not valid email");
        }
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validFirstName();
        user.validLastName();
        user.valid_email();
        user.validMobileNumber();
        user.validPassword();
        user.emailSamples();
    }
}
