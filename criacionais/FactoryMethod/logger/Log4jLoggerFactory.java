package FactoryMethod.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jLoggerFactory implements LoggerFactory {
  @Override
  public Logger createLogger(String name) {
    return LogManager.getLogger(name);
  }
}