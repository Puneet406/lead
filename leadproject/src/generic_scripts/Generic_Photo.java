package generic_scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Photo {
           
	
	     public static void getPhoto(WebDriver driver) throws IOException {
		 String photo = "./photos/";
		 Date d = new Date();
		 Sts=(TakesScreenshot) driver;
	 
	     File dst = new File(photo+date+".jpeg");
 dst);
}
}