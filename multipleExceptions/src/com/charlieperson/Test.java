package com.charlieperson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException {
        throw new ParseException("Throwing new parse exception from run method in Test", 2);
    }

    public void input() throws FileNotFoundException, IOException{
        throw new FileNotFoundException("Sorry mister- couldn't find your file.");
    }
}
