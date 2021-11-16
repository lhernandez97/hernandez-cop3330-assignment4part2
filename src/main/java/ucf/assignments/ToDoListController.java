package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import javafx.collections.FXCollections;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {
    @FXML
    ToDoList todo = new ToDoList();
    @FXML
    Print print = new Print();
    @FXML
    ExternalStorage es = new ExternalStorage();
    @FXML
    ObservableList<Item> list = FXCollections.observableArrayList();
    @FXML
    private DatePicker due_date;
    @FXML
    private DatePicker new_duedate;
    @FXML
    private TextField desc;
    @FXML
    private TextField d_index;
    @FXML
    private TextField e_index;
    @FXML
    private TextField new_desc;
    @FXML
    private TextField new_status;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private ListView<Item> listview;
    @FXML
    private ListView<String> loadview;
    @FXML
    protected void addItem() {
        /*
         * This method will call the add() method from the ToDoList class, and pass the appropriate variables
         * This method will also call the resetAdd() method
         */
        todo.add(list, listview, desc, due_date, label1);
        resetAdd();
    }
    @FXML
    protected void deleteItem() {
        /*
         * This method will call the removeItem() method from the ToDoList class, and pass the appropriate variables
         * This method will also call the resetDelete() method
         */
        String d = d_index.getText();
        int i = Integer.parseInt(d);
        todo.removeItem(list, listview, i);
        resetDelete();
    }
    @FXML
    protected void clearAll() {
        /*
         * This method will call the clearList() method from the ToDoList class, and pass the appropriate variables
         */
        todo.clearList(list, listview);
    }
    @FXML
    protected void editItem() {
        /*
         * This method will call the edit() method from the ToDoList class, and pass the appropriate variables
         * This method will also call the resetEdit() method
         */
        todo.edit(list, label2, new_desc, new_status, e_index, new_duedate);
        resetEdit();
    }
    @FXML
    protected void displayComplete() {
        /*
         * This method will call the displayOnlyCompleted() method from the Print class, and pass the appropriate variables
         */
        print.displayOnlyCompleted(list, listview);
    }
    @FXML
    protected void displayAll() {
        /*
         * This method will call the displayAll() method from the Print class, and pass the appropriate variables
         */
        print.displayAll(list, listview);
    }
    @FXML
    protected void displayIncomplete() {
        /*
         * This method will call the displayOnlyIncomplete() method from the Print class, and pass the appropriate variables
         */
        print.displayOnlyIncomplete(list, listview);
    }
    @FXML
    protected void saveItems() throws IOException {
        /*
         * This method will call the saveList() method from the ExternalStorage class, and pass the appropriate variables
         */
        es.saveList(list);
    }
    @FXML
    protected void loadItems() throws IOException {
        /*
         * This method will call the loadList() method from the ExternalStorage class, and pass the appropriate variables
         */
        es.loadList(loadview);
    }
    //methods to reset the text fields and date pickers in the GUI
    protected void resetAdd() {
        /*
        * Make the value of the due_date the current day
        * Make the value of the description empty
        */
        due_date.setValue(LocalDate.now());
        desc.setText("");
    }
    protected void resetDelete() {
        /*
        * Make the value of the d_index empty
        */
        d_index.setText("");
    }
    protected void resetEdit() {
        /*
        * Make e_index empty
        * Make new_desc empty
        * Make new_duedate the current day
        * Make new_status empty
        * */
        e_index.setText("");
        new_desc.setText("");
        new_duedate.setValue(LocalDate.now());
        new_status.setText("");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //make it so that the date that shows is the current one
        due_date.setValue(LocalDate.now());
        new_duedate.setValue(LocalDate.now());
    }
}