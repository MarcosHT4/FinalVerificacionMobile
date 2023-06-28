package activities.alarmApp;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class ListAlarmActivity {

    public Button addAlarmButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"Add alarm\"]"));
    public Label verifyAlarmName;

    public Label addParameterVerifyAlarmName(String value) {
        verifyAlarmName = new Label(By.xpath("//android.view.ViewGroup[contains(@content-desc,'"+value+"')]"));
        return verifyAlarmName;
    }

}
