package com.example.java.internationalization;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatType() {

        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale);
        var format = messageFormat.format(new Object[]{
                "Budi", new Date(), 1_000_000
        });

        System.out.println(format);

    }

    @Test
    void testMessageFormatTypeUs() {

        var locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale);
        var format = messageFormat.format(new Object[]{
                "Budi", new Date(), 1_000_000
        });

        System.out.println(format);

    }

}
