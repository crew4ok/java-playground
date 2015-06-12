package net.crew4ok.playground.patterns.strategy.impl;

import net.crew4ok.playground.patterns.strategy.PasswordEncodingStrategy;

import java.security.MessageDigest;

public abstract class AbstractPasswordEncodingStrategy implements PasswordEncodingStrategy {

    @Override
    public String encode(String originalPassword) {
        MessageDigest messageDigest = getMessageDigest();

        byte[] digest = messageDigest.digest(originalPassword.getBytes());

        StringBuilder encodedPassword = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            byte left = (byte) ((b & 0xf0) >> 4);
            byte right = (byte) (b & 0x0f);

            encodedPassword
                    .append(getSymbol(left))
                    .append(getSymbol(right));

        }

        return encodedPassword.toString();
    }

    private char getSymbol(byte b) {
        if (b >= 0 && b <= 9) {
            return (char) ('0' + b);
        } else {
            return (char) ('a' + (byte) (b - 10));
        }
    }

    protected abstract MessageDigest getMessageDigest();
}
