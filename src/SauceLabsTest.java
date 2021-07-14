import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static final String USERNAME = "oauth-rakshark95-4cd4b";
	public static final String ACCESS_KEY = "5c7591ec-d982-45d0-8314-416f167ea573";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");

		caps.setCapability("OS", "Windows7");

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver8.exe"); // Launch chrome driver
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("https://google.com");

		System.out.println(driver.getTitle());

	}

}
