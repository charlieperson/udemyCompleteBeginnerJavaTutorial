package com.charlieperson;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
	    Test test = new Test();
	    try {
            test.run();
        } catch(ParseException | IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
