package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    private static final String path = "config.properties";

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

         public static String browser=getProperty("browser");
         public static String url=getProperty("baseurl");
         public static String firstCity=getProperty("firstCity");
         public static String secondCity=getProperty("secondCity");
         public static String phoneNumber=getProperty("phoneNumber");
         public static String email=getProperty("email");
         public static String name=getProperty("name");
         public static String surname=getProperty("surname");
         public static String idNumber=getProperty("idNumber");
         public static String hesCode=getProperty("hesCode");



}
