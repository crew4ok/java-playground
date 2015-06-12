package net.crew4ok.playground.patterns.strategy;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PasswordEncodingServiceTest {

    private PasswordEncodingService passwordEncodingService = new PasswordEncodingService();

    @Test
    public void encode_hp() throws Exception {
        String expectedEncodedPassword = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8";
        String encodedPassword = passwordEncodingService.encodePassword("password");

        assertEquals(encodedPassword, expectedEncodedPassword);
    }
}
