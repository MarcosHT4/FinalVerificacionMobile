package activities.contactApp;

import controls.Label;
import org.openqa.selenium.By;

public class NewContactActivity {
    public Label verifyContactCreated = new Label(By.id("com.samsung.android.app.contacts:id/header"));
    public Label verifyPhoneNumber = new Label(By.xpath("//android.widget.TextView[@resource-id='com.samsung.android.app.contacts:id/display_number']"));
}
