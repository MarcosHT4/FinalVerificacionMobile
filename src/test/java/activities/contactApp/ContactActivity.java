package activities.contactApp;

import controls.Button;
import org.openqa.selenium.By;

public class ContactActivity {

    public Button closePopUp = new Button(By.xpath("//android.widget.Button[@text='Cancel']"));
    public Button createContactButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Create contact\"]"));




}
