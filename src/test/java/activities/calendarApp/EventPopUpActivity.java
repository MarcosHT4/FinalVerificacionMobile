package activities.calendarApp;

import controls.Label;
import org.openqa.selenium.By;

public class EventPopUpActivity {

    public Label eventLabel;

    public Label addParameterEventLabel(String value) {
        eventLabel = new Label(By.xpath("//android.widget.TextView[@text=\""+value+"\"]"));
        return eventLabel;
    }

}
