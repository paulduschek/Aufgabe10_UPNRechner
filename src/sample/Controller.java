/**
 * @author Paul Duschek
 * @version 1.0, 17.12.2020
 */
package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;


public class Controller implements Initializable {

    Stage stage;
    Model model;
    Stack stack = new Stack();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model = new Model();
    }

    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = fxmlLoader.load();
            stage.setTitle("Aufgabe 10 - Duschek");
            stage.setScene(new Scene(root, 600, 300));
            stage.show();
        }
        catch (IOException ex) {
            //Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with sample.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }

    //FXML implementations Buttons
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;

    @FXML
    private Button buttonEnter;
    @FXML
    private Button buttonC;
    @FXML
    private Button buttonCE;
    @FXML
    private Button buttonPlusCalc;
    @FXML
    private Button buttonMinusCalc;
    @FXML
    private Button buttonMultiplied;
    @FXML
    private Button buttonDivided;
    @FXML
    private Button buttonStackEntry;
    @FXML
    private Button buttonChangeStackNr;
    @FXML
    private Button buttonPoint;
    @FXML
    private Button buttonMinus;

    //Text Field and Area
    @FXML
    private TextField TextField;
    @FXML
    private TextArea TextArea;

    @FXML
    public void getNumber()
    {
        if(button0.isPressed())
        {
            stack.push(0);
        }
        else if(button1.isPressed())
        {
            stack.push(1);
        }
        else if(button2.isPressed())
        {
            stack.push(2);
        }
        else if(button3.isPressed())
        {
            stack.push(3);
        }
        else if(button4.isPressed())
        {
            stack.push(4);
        }
        else if(button5.isPressed())
        {
            stack.push(5);
        }
        else if(button6.isPressed())
        {
            stack.push(6);
        }
        else if(button7.isPressed())
        {
            stack.push(7);
        }
        else if(button8.isPressed())
        {
            stack.push(8);
        }
        else if(button9.isPressed())
        {
            stack.push(9);
        }
    }


}
