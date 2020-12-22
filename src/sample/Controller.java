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
    Stack<String> stack = new Stack<String>();
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model = new Model();
    }

    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = fxmlLoader.load();
            stage.setTitle("Aufgabe 10 - Duschek");
            stage.setScene(new Scene(root, 600, 395));
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
    @FXML private Button button0;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;

    @FXML private Button buttonEnter;
    @FXML private Button buttonC;
    @FXML private Button buttonCE;
    @FXML private Button buttonPlusCalc;
    @FXML private Button buttonMinusCalc;
    @FXML private Button buttonMultiplied;
    @FXML private Button buttonDivided;
    @FXML private Button buttonStackEntry;
    @FXML private Button buttonChangeStackNr;
    @FXML private Button buttonPoint;
    @FXML private Button buttonMinus;

    //Text Field and Area
    @FXML private TextField textfield;
    @FXML private TextArea textarea;

    @FXML
    public void getNumber()
    {
        if(button0.isArmed())
        {
            sb.append(0);
            textfield.setText(sb.toString());
        }
        else if(button1.isArmed())
        {
            sb.append(1);
            textfield.setText(sb.toString());
        }
        else if(button2.isArmed())
        {
            sb.append(2);
            textfield.setText(sb.toString());
        }
        else if(button3.isArmed())
        {
            sb.append(3);
            textfield.setText(sb.toString());
        }
        else if(button4.isArmed())
        {
            sb.append(4);
            textfield.setText(sb.toString());
        }
        else if(button5.isArmed())
        {
            sb.append(5);
            textfield.setText(sb.toString());
        }
        else if(button6.isArmed())
        {
            sb.append(6);
            textfield.setText(sb.toString());
        }
        else if(button7.isArmed())
        {
            sb.append(7);
            textfield.setText(sb.toString());
        }
        else if(button8.isArmed())
        {
            sb.append(8);
            textfield.setText(sb.toString());
        }
        else if(button9.isArmed())
        {
            sb.append(9);
            textfield.setText(sb.toString());
        }
    }

    @FXML
    public void Enter()
    {
        stack.push(sb.toString());
        sb1.append(String.format("%s %n", sb));
        textarea.setText(sb1.toString());
        textfield.clear();
        sb.delete(0, sb.length());
    }

    @FXML
    public void C()
    {
        textarea.clear();
        textfield.clear();
        sb.delete(0, sb.length());
        sb1.delete(0, sb1.length());
        stack.clear();
    }

    @FXML
    public void CE()
    {
        textfield.clear();
        sb.delete(0, sb.length());
    }

    @FXML
    public void plus()
    {
        try{
            double pop1 = Double.parseDouble(stack.pop());
            double pop2 = Double.parseDouble((stack.pop()));
            double result = pop1 + pop2;
            stack.push(String.valueOf(result));
            textarea.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            System.out.println("an error occured!");
        }
    }

    @FXML
    public void minus()
    {
        try{
            double pop1 = Double.parseDouble(stack.pop());
            double pop2 = Double.parseDouble((stack.pop()));
            double result = pop2 - pop1;
            stack.push(String.valueOf(result));
            textarea.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            System.out.println("an error occured!");
        }
    }

    @FXML
    public void multiply()
    {
        try {
            double pop1 = Double.parseDouble(stack.pop());
            double pop2 = Double.parseDouble((stack.pop()));
            double result = pop1 * pop2;
            stack.push(String.valueOf(result));
            textarea.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            System.out.println("an error occured!");
        }
    }

    @FXML
    public void divided()
    {
        try {
            double pop1 = Double.parseDouble(stack.pop());
            double pop2 = Double.parseDouble((stack.pop()));
            double result = pop2 / pop1;
            stack.push(String.valueOf(result));
            textarea.setText(String.valueOf(result));
        }
        catch (Exception ex)
        {
            System.out.println("an error occured!");
        }
    }
}
