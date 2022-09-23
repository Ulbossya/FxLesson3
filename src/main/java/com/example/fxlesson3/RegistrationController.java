package com.example.fxlesson3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class RegistrationController implements Initializable {

    @FXML
    private ComboBox<String> comboclass , combogroup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String choose_classroom[] =
                {"202", "201", "200"};

        ObservableList<String> data = FXCollections.observableArrayList(choose_classroom);
        comboclass.setItems(data);

        String choose_group[] =
                {"3e", "4e", "2e"};

        ObservableList<String> data1 = FXCollections.observableArrayList(choose_group);
        combogroup.setItems(data1);
    }
    @FXML
    Button cancelbutton, registrationbutton;
    @FXML
    TextField fnametext , lnametext , cnumbertext , pnumbertext , emailtext , passwordtext ;

    public void cancelbuttonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("LOGIN PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void registrationbuttonClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("WELCOME PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    String comboBoxText = comboclass.getValue();
    System.out.println(comboBoxText);



}}
