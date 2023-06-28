package activities.calendarApp;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class AddEventActivity {

    public TextBox eventNameTextbox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Title\"]"));
    public Button saveEventButton = new Button(By.xpath("//android.widget.TextView[@text=\"Save\"]"));

}
