package activities.messageApp;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class ListMessagesActivity {

    public Button openConversationButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"\u2068AaContacto 175454\u2069\"]"));
    public Label sentMessageLabel;

    public Label addParameterSentMessageLabel(String value) {
        sentMessageLabel = new Label(By.xpath("//android.widget.TextView[@text='\u2068"+value+"\u2069']"));
        return sentMessageLabel;
    }

    public Button addParameterOpenConversationButton(String value) {
        openConversationButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"\u2068"+value+"\u2069\"]"));
        return openConversationButton;
    }


}
