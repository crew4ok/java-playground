package net.crew4ok.playground.patterns.strategy.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256PasswordEncodingStrategy extends AbstractPasswordEncodingStrategy {
    @Override
    protected MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }
    }
}
