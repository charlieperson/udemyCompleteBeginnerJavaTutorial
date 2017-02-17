package com.charlieperson;

import java.io.IOException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException {
        throw new ParseException("Throwing new parse exception from run method in Test", 2);
    }
}
