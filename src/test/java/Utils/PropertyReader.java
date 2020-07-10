package Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PropertyReader {

    private static final Logger LOG = LogManager.getLogger(PropertyReader.class);
    private static Properties properties;

    static {try {
        propertyReader() ;
    }catch (IOException e){
        LOG.error(e);
    }
    }

    private static void propertyReader() throws IOException {
        properties = new Properties();
        File f = new File("."+ File.separator + "src" + File.separator + "Test" + File.separator + "Java" + File.separator + "Properties" + File.separator + "properties.properties");

        FileReader obj = new FileReader(f);
        properties.load(obj);
    }

    public static String getPropertyData(String Data) {
        return properties.getProperty(Data);
    }

}
