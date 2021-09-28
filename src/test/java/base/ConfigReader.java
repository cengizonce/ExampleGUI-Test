package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    private static final String path = "config.properties";

    static {
        System.out.println("Properties döngüsüne girildi");
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        System.out.println("getProperty ile-"+key+"-sorgulandı");
        return properties.getProperty(key);
    }

         static String browser=getProperty("browser");
         static String url=getProperty("baseurl");
         public static String firstCity=getProperty("firstCity");
         public static String secondCity=getProperty("secondCity");
         public static String telefonNo=getProperty("telefonNo");
         public static String email=getProperty("email");
         public static String Ad=getProperty("Ad");
         public static String Soyad=getProperty("Soyad");
         public static String TC=getProperty("TC");
         public static String HESCODE=getProperty("HESCODE");



}
