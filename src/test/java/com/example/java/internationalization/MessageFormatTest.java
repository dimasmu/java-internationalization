package com.example.java.internationalization;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.core.Local;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        var pattern = "Hi {0}, Anda bisa mencari data anda dengan mengetikan \"{}\" di pencari";
        var messageFormat = new MessageFormat(pattern);
//        messageFormat.applyPattern(); bisa rubah pattern nya di tengah jalan jika memang perlu
        var format = messageFormat.format(new Object[]{
                "Testing"
        });

        System.out.println(format);

    }

    @Test
    void testMessageFormatResourceBundle() {

        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern, locale);
        var format = messageFormat.format(new Object[]{
                "Budi", "Jakarta"
        });

        System.out.println(format);
    }

}
