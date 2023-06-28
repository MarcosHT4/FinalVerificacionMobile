package activities.alarmApp;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class NewAlarmActivity {

    public TextBox alarmNameTextbox = new TextBox(By.xpath("//android.widget.EditText[@text='Alarm name']"));
    public Button saveAlarmButton = new Button(By.xpath("//android.widget.TextView[@text='Save']"));

}
