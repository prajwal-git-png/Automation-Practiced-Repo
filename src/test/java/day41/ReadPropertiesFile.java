package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/test/java/day41/config.properties");
        Properties prop = new Properties();
        prop.load(file);

        String appURL = prop.getProperty("appurl");
        System.out.println(appURL);

        String email = prop.getProperty("email");
        System.out.println(email);

        String pass = prop.getProperty("pass");
        System.out.println(pass);

        System.out.println("ALL Keys" + prop.stringPropertyNames());
        System.out.println("All values : " + prop.values());

    }
}
