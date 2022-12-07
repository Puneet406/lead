package generic_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_constants {
	public WebDriver driver;
    @BeforeMethod
    public void openapp() 
    {
    
        driver.get(url);   
    }
    
    @AfterMethod
    public void close(ITestResult result) throws IOException
    {
    	if(ITestResult.FAILURE==result.getStatus())
    	{
    		Generic_Photo.getPhoto(driver);
    	}
		driver.close();
    }
}

