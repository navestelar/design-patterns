package FactoryMethod.logger;

import java.util.logging.Logger;

public interface LoggerFactory {
  Logger createLogger(String name);
}
