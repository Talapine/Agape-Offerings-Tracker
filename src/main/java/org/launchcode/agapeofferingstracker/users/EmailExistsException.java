package org.launchcode.agapeofferingstracker.users;




public class EmailExistsException extends Exception{

    public EmailExistsException (String message) {
        super(message);
    }
}
