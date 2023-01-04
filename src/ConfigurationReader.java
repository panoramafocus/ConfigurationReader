import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try(InputStream inputStream = new FileInputStream("config.properties")) {
            properties.load(inputStream);
        } catch(IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("address = "
                + properties.getProperty("address", "not provided"));
        System.out.println("password = "
                + properties.getProperty("password", "not provided"));
        System.out.println("numWorker = "
                + Integer.parseInt(properties.getProperty("numWorker", "100")));
    }
}
