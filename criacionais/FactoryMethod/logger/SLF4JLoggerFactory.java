package FactoryMethod.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger(String name) {
        return LoggerFactory.getLogger(name);
    }
}