package com.example.java.internationalization;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    //FORMAT PEMBUATAN RESOURCE BUNDLE untuk locale (fileName_language_country) contoh default nya "message" maka locale lain menjadi "message_in_ID"
    //

    @Test
    void testResourceBundle() {

        // ambil data dari resources
        var resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleIndonesia() {

        // ambil data dari resources
        var indonesia = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

}
