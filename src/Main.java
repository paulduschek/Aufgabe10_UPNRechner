import javafx.application.Application;
import javafx.stage.Stage;
import sample.Controller;

/**
 * @author Paul Duschek
 * @version 1.0, 22.12.2020
 */

public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception{
        Controller.show(s);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }


}
