package activities.calendarApp;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CalendarViewActivity {

    String formattedDateStr = DateTimeFormatter.ofPattern("yyyy-M-dd", Locale.ENGLISH).format(LocalDateTime.now());

    public Button addEventButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Add event\"]"));

    public Label calendarDayLabel = new Label(By.xpath("//android.view.View[@text=\""+formattedDateStr+"\"]"));

}
