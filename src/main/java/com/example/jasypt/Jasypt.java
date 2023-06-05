package com.example.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class Jasypt {
    private static final String passwordStr = "salt";

    public static void main(String[] args) {
        String text = "CImfNYFVtkmkG/4TE0WG8g==";
        String encrypt = encrypt(text);
        System.out.println("encyrpt:  " + encrypt);
        String decrypt = decrypt(text);
        System.out.println("decyrpt:  " + decrypt);

    }

    private static String encrypt(String text) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPasswordCharArray(passwordStr.toCharArray());
        return textEncryptor.encrypt(text);
    }

    private static String decrypt(String text) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPasswordCharArray(passwordStr.toCharArray());
        return textEncryptor.decrypt(text);
    }
}
