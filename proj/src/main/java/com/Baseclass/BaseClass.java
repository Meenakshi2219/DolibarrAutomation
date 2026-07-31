package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public String parentWindow;

	public static WebDriver Launchbrowser()
	
	{
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> pref=new HashMap<>();
		pref.put("Credentials_enable_service",false);
		pref.put("profile.password_manager_enabled",false);
		pref.put("profile.password_manager_leak_detection",false);
		options.setExperimentalOption("prefs",pref);
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-features=passwordLeakDetection");
		 driver = new ChromeDriver(options);
		  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		   
		  driver.get("https://www.dolibarr.org/");
		  return driver;

	}
	public static void maximize() {	
		driver.manage().window().maximize();

	}
	
	public static WebDriver Quitbrowser() {
		driver.quit();
		return driver;
	}
	//quit browser 
	public static WebDriver closeBrowser() {
		driver.quit();
		return driver;
	}
//Click
	public void click(WebElement element ) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
//Sendkeys	
	public void sendKeys(WebElement element,String value) {
		 wait.until(ExpectedConditions.visibilityOf(element));
		 element.clear();
		element.sendKeys(value);
	}
	
	public void sendKey(WebElement element,Integer value) {
		 wait.until(ExpectedConditions.visibilityOf(element));
		 element.clear();
		element.sendKeys(String.valueOf(value));
	}
//clear	
	public void clear(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		element.sendKeys(Keys.DELETE);
	}
//	get txt
	public String getText(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	
//	get texts
	public List<String> getTexts(List<WebElement> elements) {
	    wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	    List<String> texts = new ArrayList<>();
	    for (WebElement element : elements) {
	        texts.add(element.getText());
	    }
	    return texts;
	}
	
	// Get Title
	public String getTitle() {
		return driver.getTitle();
	}
//		Get Size
		public int getSize(List<WebElement> element) {
			return wait.until(ExpectedConditions.visibilityOfAllElements(element)).size();
			 
		}
//	Is Displayed
		public boolean isDisplayed(WebElement element) {
		    wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		}
		
//	Is Enabled
		public boolean isEnabled(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			 return element.isEnabled();
		}
//		Is Selected
		public boolean isSelected(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isSelected();
		}
//		Is Element Present
		public boolean isElementPresent(WebElement element) {
			try {
				return element.isDisplayed();
			}catch(NoSuchElementException e) {
				return false;
			}
			
		}

//Dropdown
	public void selectDropdownByVisibleText(WebElement dropdown, String value) {
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		new Select(dropdown).selectByVisibleText(value);
	}
	
	public void selectDropdownByValue( WebElement dropdown, String value) {
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectDropdownByIndex(WebElement dropdown, int index) {
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectCustomdd(WebElement dropdown,WebElement option) {
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(option));
		option.click();
	}
	
	//close tab
	
	public void close() {
		driver.close();
	}
	
	// Navigattion for module
	
	public boolean Modulenavigate(WebElement element) {
		scrollToElement(element);
		if(isDisplayed(element)&&isEnabled(element)) {
			click(element);
			if(!getTitle().trim().isEmpty()&&!getUrl().trim().isEmpty()) {
				return true;
			}
			
		}
		return false;
	}
	
	//Back
	
	public void back() {
		driver.navigate().back();
	}
//CheckBox
	public void selectCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) {
			wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		}
	}
	
	public void unselectCheckbox(WebElement checkbox) {
		if(checkbox.isSelected()) {
			wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		}
	}
//RadioButton
	public void selectRadio(WebElement radio) {
		if(!radio.isSelected()) {
			radio.click();
		}
	}
// ACTIONS CLASS
	public void moveToElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	    new Actions(driver).moveToElement(element).click().perform();
	}
	public void hoverToElement(WebElement element1, WebElement element2) {
		wait.until(ExpectedConditions.visibilityOf(element1));
		wait.until(ExpectedConditions.visibilityOf(element2));
		new Actions(driver).moveToElement(element1).
		moveToElement(element2).
		click().
		build().perform();
	}
	public void slider(WebElement element, int value1, int value2) {
		wait.until(ExpectedConditions.visibilityOf(element));
		new Actions(driver).dragAndDropBy(element, value1, value2).perform();
	}
	
	public void dragAndDrop(WebElement element1, WebElement element2) {
		wait.until(ExpectedConditions.visibilityOf(element1));
		wait.until(ExpectedConditions.visibilityOf(element2));
		new Actions(driver).clickAndHold(element1).moveToElement(element2).release().perform();
	}

	public void doubleClick(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	    new Actions(driver).doubleClick(element).perform();
	}

	public void rightClick(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	    new Actions(driver).contextClick(element).perform();
	}
// JS CLICK 
	public void jsClick(WebElement element) {
	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].click();", element);
	}
	public void jsSvgclick(WebElement element) {
		((JavascriptExecutor) driver)
        .executeScript("arguments[0].dispatchEvent(new MouseEvent('click',{bubbles: true}));", element);
	}
//	Scroll View
	public void scrollToElement(WebElement element) {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "arguments[0].scrollIntoView({behavior:'smooth',block:'center'});",
	        element
	    );
	}
//Alerts	
	public void acceptAlert() {
	    wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

	public void dismissAlert() {
	    wait.until(ExpectedConditions.alertIsPresent()).dismiss();
	}
	public void alertWithText(String value) {
		wait.until(ExpectedConditions.alertIsPresent()).sendKeys(value);
	}

// FRAMES
	public void switchToFrame(WebElement element) {
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void switchtFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	public void switchback() {
		driver.switchTo().defaultContent();
	}
	
	
//Window Handling
	//parent window
	 public void getParentWindow() {
	        parentWindow= driver.getWindowHandle();
	    }
//	 switch to child window
	  public void switchToChildWindow() {
		  parentWindow=driver.getWindowHandle();
	        for (String window : driver.getWindowHandles()) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	  }
	
public void switchtoParent() {
	
	driver.switchTo().window(parentWindow);
}
public void switchparent() {
for(String window:driver.getWindowHandles()) {
	driver.switchTo().window(window);
	break;
}
}
//Upload
//	Works when <input type="file"> is present.
	public void uploadFile(WebElement upload, String filepath) {
		wait.until(ExpectedConditions.visibilityOf(upload));
		upload.sendKeys(filepath);
		
	}
	
	
//Upload using Robot (when input is hidden)
	public void uploadUsingRobot(WebElement upload,String filePath ) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(upload));
		upload.click();
	    StringSelection selection = new StringSelection(filePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard()
	            .setContents(selection, null);

	    Robot robot = new Robot();
	    robot.delay(3000);

	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.delay(500);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Close dialog box
	
	public void closedialog() throws AWTException {
		try {
		 Robot robot = new Robot();
		    robot.delay(3000);
		    robot.keyPress(KeyEvent.VK_ESCAPE);
		    robot.keyRelease(KeyEvent.VK_ESCAPE);
	}catch(Exception e) {
		e.printStackTrace();;
	}
	}

//Get Url
	public String getUrl() {
		
		return driver.getCurrentUrl();
	}
	
	//Get Attribute
	
	public String getAttribute(WebElement element,String attributename) {
		return element.getAttribute(attributename);
	}
	
	//Scroll to bottom
	
	public void scrollToBottom(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0, 1000)");
		
	}
	
	// get error
	
	public String getError(WebElement element) {
		return element.getText();
	}
	
	
	//pageload
	
	public void waitforpageload() {
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete';"));
		
	}
//wait for url to load
	public void waitForURL(String text) {
		wait.until(ExpectedConditions.urlContains(text));
	}
//wait for visibility of element
	public void waitForVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void textToPresent(WebElement element, String value) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, value));
	}
	
//	wait for visibility of elements
	public void waitForVisibilityOfElements(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
//	wait for invisibility of element
	public void waitForInVisibility(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
		
	public void autoCompleteSuggestion(List<WebElement> suggestions, String option ) {
		wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));
		List<WebElement> list =suggestions;
		for (WebElement item : list) {
			if(item.getText().equals(option)) {
				item.click();
				break;
			}
			
		}
	}
	
	
	public void waitForClikable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	// Element Verify
	public boolean verifyElement(WebElement element) {
		 return element.isDisplayed()&& element.isEnabled();
	 }
	
	public boolean validateElement(WebElement element) {
		return element.isEnabled()&&element.isSelected();
	}
	
	//toast message
	
	public String getToastMessage(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText().trim();
	}
	
	//count
	public int getElementCount(List<WebElement> elements) {
		return elements.size();
	}
}
	

