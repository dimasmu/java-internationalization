package com.example.java.internationalization;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia() {

        var indonesia = new Locale("in", "ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());

    }

    @Test
    void testCurrencyUs() {

        var indonesia = new Locale("en", "US");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());

    }

    @Test
    void testNumberFormatCurrencyIndonesia() {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(10000000.33);
        System.out.println(format);

    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() throws ParseException {

        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var result = numberFormat.parse("Rp900.000,33").doubleValue();
        System.out.println(result);

    }

}
