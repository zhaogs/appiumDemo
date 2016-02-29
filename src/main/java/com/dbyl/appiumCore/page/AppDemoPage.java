package main.java.com.dbyl.appiumCore.page;

import main.java.com.dbyl.appiumCore.utils.AppiumBaseExecutor;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppDemoPage extends AppiumBaseExecutor {
	public AppDemoPage(AppiumDriver<?> driver) {
		super(driver);
	}

	AppiumDriver<?> driver;

//	@AndroidFindBy(accessibility = "for appium test")
//	MobileElement textView;
//	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
//	MobileElement button;
//	@AndroidFindBy(className = "android.widget.Button")
//	MobileElement button1;
//	@AndroidFindBy(id = "cn.dbyl.appiumdemo:id/text1")
//	MobileElement text;

	@AndroidFindBy(accessibility = "for appium test")
	MobileElement textView;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
	MobileElement button;
	@AndroidFindBy(className = "android.widget.Button")
	MobileElement button1;
	@AndroidFindBy(id = "cn.dbyl.appiumdemo:id/text1")
	MobileElement text;
	
	public void clickButton() {
		click(button);
	}

	public String getText() {
		return getText(text);
	}


}
