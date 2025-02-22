package com.example.java.internationalization;

import org.junit.jupiter.api.Test;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {

        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(1000000.255);
        System.out.println(format);

    }

    @Test
    void testNumberFormatIndonesia() {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(1000000.255);
        System.out.println(format);

    }

    @Test
    void testNumberFormatParseIndonesia() throws ParseException {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        var result = numberFormat.parse("10.000.000,255").doubleValue();
        System.out.println(result);

    }

}
