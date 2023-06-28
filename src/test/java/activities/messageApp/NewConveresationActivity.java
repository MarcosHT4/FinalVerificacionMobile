package activities.messageApp;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class NewConveresationActivity {


    public TextBox textBoxMessage = new TextBox(By.id("com.samsung.android.messaging:id/message_edit_text"));
    public Button sendTextButton = new Button(By.id("com.samsung.android.messaging:id/send_button1"));
    public Button backButton = new Button(By.id("com.samsung.android.messaging:id/composer_up"));


}
