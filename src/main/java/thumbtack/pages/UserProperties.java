package thumbtack.pages;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class UserProperties {


    private static Properties PROPERTIES;

	static {
		PROPERTIES = new Properties();
		URL props = ClassLoader.getSystemResource("User.properties");
		try {
			PROPERTIES.load(props.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String value) {
		return PROPERTIES.getProperty(value);
	}

	public static String get(String key) {
		//just to use short name
		return getProperty(key);
	}

	public static String getPathFor(String file) {
		// Using substring for full path to remove first slash.
		// Sikuli bug on Windows
		return ClassLoader.getSystemResource(file).getPath().toString()
				.substring(1);
	}

	public static String path(String file) {
		return getPathFor(file);
	}
}
