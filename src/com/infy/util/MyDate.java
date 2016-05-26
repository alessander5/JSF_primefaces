package com.infy.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Infy on 26.05.2016.
 */
public class MyDate extends java.util.Date{

    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return format.format(this);
    }
}
