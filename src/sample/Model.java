/**
 * @author Paul Duschek
 * @version 1.0, 17.12.2020
 */
package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Model{

    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = fxmlLoader.load();
            stage.setTitle("Aufgabe 10 - Duschek");
            stage.setScene(new Scene(root, 600, 415));
            stage.show();
        }
        catch (IOException ex) {
            System.err.println("Something wrong with sample.fxml!");
            ex.printStackTrace(System.err);
        }
    }

}
