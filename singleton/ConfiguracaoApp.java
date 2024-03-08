import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoApp {
    private static final String CONFIG_FILE = "app.config";
    private static ConfiguracaoApp instance;
    private Properties propriedades;

    private ConfiguracaoApp() {
        propriedades = new Properties();
        try (FileInputStream fis = new FileInputStream(CONFIG_FILE)) {
            propriedades.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfiguracaoApp getInstance() {
        if (instance == null) {
            synchronized (ConfiguracaoApp.class) {
                if (instance == null) {
                    instance = new ConfiguracaoApp();
                }
            }
        }
        return instance;
    }

    public String getPropriedade(String chave) {
        return propriedades.getProperty(chave);
    }
}