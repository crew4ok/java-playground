package net.crew4ok.playground.patterns.strategy;

import net.crew4ok.playground.patterns.strategy.impl.Md5PasswordEncodingStrategy;
import net.crew4ok.playground.patterns.strategy.impl.Sha256PasswordEncodingStrategy;

public class PasswordEncodingStrategyFactory {

    public static PasswordEncodingStrategy getStrategy(EncodingAlgorithm algorithm) {
        switch (algorithm) {
            case MD5:
                return new Md5PasswordEncodingStrategy();

            case SHA256:
                return new Sha256PasswordEncodingStrategy();

            default:
                throw new RuntimeException("No such algorithm");
        }
    }

}
