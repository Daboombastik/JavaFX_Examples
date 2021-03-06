package JavaFX.Calendar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalendarFX2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/JavaFX/Calendar/form.fxml"));
        Scene scene = new Scene(parent, 800, 600);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}
