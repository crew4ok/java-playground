package net.crew4ok.playground.patterns.strategy.impl;

import net.crew4ok.playground.patterns.strategy.PasswordEncodingStrategy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5PasswordEncodingStrategy extends AbstractPasswordEncodingStrategy {
    @Override
    protected MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }
    }
}
