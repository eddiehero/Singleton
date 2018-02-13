package com.example.singleton;

/**
 * Created by rto on 2018-02-07.
 */
public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed

    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}