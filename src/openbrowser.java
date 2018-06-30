import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * import org.openqa.selenium.firefox.FirefoxDriver;
 */

public class openbrowser {
@Test
	public  void openchrome(){
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C://Users//Ckumarsi//Desktop//Selenium Workshop//chromedriverwin32//chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.get("http://fpdownload.macromedia.com/get/flashplayer/pdc/27.0.0.130/install_flash_player.exe");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://get3.adobe.com/flashplayer/eol/" );
		//assertEquals("Adobe - Flashplayer EOL", driver.getTitle(),"Title is correct");
		//Thread.sleep(6000);
		
		
		driver.quit();

	}

}
