package com.example.java.internationalization;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {

        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatId() {

        var locale = new Locale("in", "ID");
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern, locale);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatJp() {

        var locale = new Locale("ja", "JP");
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern, locale);

        var format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatParseIndonesia() {

        var locale = new Locale("in", "ID");
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern, locale);

        try {
            var date = dateFormat.parse("Rabu 03 Maret 2025");
            System.out.println(date);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

//    https://www.iban.com/country-codes list of country
//    https://localizely.com/iso-639-1-list/ list of language

}
