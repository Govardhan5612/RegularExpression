package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Govardhan Reddy
 */
public class UserRegistration {
    /**
     * Use exception handling
     * use static patterns
     */
    static Pattern firstName = Pattern.compile("[A-Z]{1}+[a-z]{2,}");
    static Pattern lastName = Pattern.compile("[A-Z]{1}+[a-z]{2,}");
    static Pattern email = Pattern.compile("[a-z]{3,}[.]{1}[a-z]{0,}[@]{1}[a-z]{2,}[.]{1}[co]{2}[.]{1}[in]{0,2}");
    static Pattern mobileNumber = Pattern.compile("[0-9]{1,3}[\\s]{1}[7-9]{1}[0-9]{9}");
    static Pattern passwordWithSpecialChar = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{8,}$");

    public static boolean firstName() throws InvalidUserDetailsException {
        Matcher firstNameTest = firstName.matcher("GOvardhan");

        if (firstNameTest.matches() == true)
            return true;
        else
            throw new InvalidUserDetailsException("Invalid first name");
    }

    public static boolean lastName() throws InvalidUserDetailsException {
        Matcher lastNameTest = lastName.matcher("REddy");
        if (lastNameTest.matches() == true)
            return true;
        else
            throw new InvalidUserDetailsException("Invalid last name");
    }

    public static boolean email() throws InvalidUserDetailsException {
        //abc.xyz@bl.co.in
        Matcher emailTest = email.matcher("abc.xyz@bl.co..in");
        if (emailTest.matches() == true)
            return true;
        else
            throw new InvalidUserDetailsException("Invalid email");
    }

    public static boolean mobileNumber() throws InvalidUserDetailsException {
        Matcher mobileNumberTest = mobileNumber.matcher("91 12345678890");
        if (mobileNumberTest.matches() == true)
            return true;
        else
            throw new InvalidUserDetailsException("Invalid mobileNumber");
    }

    public static boolean password() throws InvalidUserDetailsException {
        Matcher passwordTest = passwordWithSpecialChar.matcher("abc1A@");
        if (passwordTest.matches() == true)
            return true;
        else
            throw new InvalidUserDetailsException("Invalid Password ");
    }

    public static void main(String[] args) throws InvalidUserDetailsException {
        try {
            UserRegistration.firstName();
        } catch (InvalidUserDetailsException ex) {
            System.out.println("Exception - " + ex);
        }
        try {
            UserRegistration.lastName();

        } catch (InvalidUserDetailsException exLastName) {
            System.out.println("Exception - " + exLastName);
        }
        try {
            UserRegistration.email();
        } catch (InvalidUserDetailsException exEmail) {
            System.out.println("Exception - " + exEmail);
        }
        try {
            UserRegistration.mobileNumber();
        } catch (InvalidUserDetailsException exMobileNumBer) {
            System.out.println("Exception - " + exMobileNumBer);
        }
        try {
            UserRegistration.password();
        } catch (InvalidUserDetailsException exPassword) {
            System.out.println("Exception - " + exPassword);
        }

    }
}
