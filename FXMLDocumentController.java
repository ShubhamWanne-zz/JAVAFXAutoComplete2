/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodelist;

import com.jfoenix.controls.JFXNodesList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import java.util.ArrayList;
import java.util.Collection;
import javafx.animation.Interpolator;
import javafx.animation.KeyValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

/**
 *
 * @author shubham
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button button;

    @FXML
    private AnchorPane root;

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        JFXButton button1= new JFXButton("Menu");
        button1.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button2= new JFXButton("View");
        button2.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button3= new JFXButton("Edit");
        button3.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button4= new JFXButton("Source");
        button4.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button5= new JFXButton("Run");
        button5.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button6= new JFXButton("Debug");
        button6.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button7= new JFXButton("Tools");
        button7.setButtonType(JFXButton.ButtonType.RAISED);
        JFXButton button8= new JFXButton("Help");
        button8.setButtonType(JFXButton.ButtonType.RAISED);
        
        button1.getStyleClass().addAll("animated-option-button-main");
        button2.getStyleClass().addAll("animated-option-button");
        button3.getStyleClass().addAll("animated-option-button");
        button3.getStyleClass().addAll("animated-option-button");
        button4.getStyleClass().addAll("animated-option-button");
        button5.getStyleClass().addAll("animated-option-button");
        button6.getStyleClass().addAll("animated-option-button");
        button7.getStyleClass().addAll("animated-option-button");
        button8.getStyleClass().addAll("animated-option-button");
        
        JFXNodesList nodelist = new JFXNodesList();
        nodelist.setSpacing(10);
        
        nodelist.addAnimatedNode(button1);
        nodelist.addAnimatedNode(button2);
        nodelist.addAnimatedNode(button3);       
        nodelist.addAnimatedNode(button4);
        nodelist.addAnimatedNode(button5);
        nodelist.addAnimatedNode(button6);       
        nodelist.addAnimatedNode(button7);
        nodelist.addAnimatedNode(button8);
        
        
        root.getChildren().addAll(nodelist);
        
        AnchorPane.setLeftAnchor(nodelist, root.getPrefWidth()-30);
        
    }    
    
}
