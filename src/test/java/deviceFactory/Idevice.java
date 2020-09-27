package deviceFactory;

import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

public interface Idevice {
    AppiumDriver create() throws MalformedURLException;
}
