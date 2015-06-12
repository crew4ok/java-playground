package net.crew4ok.playground.patterns.strategy;

public class PasswordEncodingService {

    private PasswordEncodingStrategy strategy = PasswordEncodingStrategyFactory.getStrategy(Settings.ENCODING_ALGORITHM);

    public String encodePassword(String originalPassword) {
        return strategy.encode(originalPassword);
    }

}
