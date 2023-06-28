package activities.contactApp;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class ContactInputActivity {

    public Button selectSIMButton = new Button(By.xpath("//android.widget.TextView[@text='SIM 1']"));
    public Button confirmSIMButton = new Button(By.xpath("//android.widget.Button[@text='Just once']"));
    public TextBox inputContactName = new TextBox(By.id("com.samsung.android.app.contacts:id/simNameEdit"));

    public Label openPhoneTextbox = new Label(By.xpath("//android.widget.TextView[@text='Phone']"));
    public TextBox phoneTextbox = new TextBox(By.xpath("//android.widget.EditText[@text='Phone']"));

    public Button saveContactButton = new Button(By.id("com.samsung.android.app.contacts:id/smallLabel"));

}
