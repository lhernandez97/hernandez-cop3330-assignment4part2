package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import javafx.collections.ObservableList;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToDoList {
    //method to add an item
    public void add(ObservableList<Item> list, ListView<Item> view, TextField desc, DatePicker due_date, Label label) {
        /*
        * If the description is empty or the description is more than 256 characters
        *   Set the label to say "Description must be between 1 and 256 characters."
        * Else
        *   Add an item to the list with the desc, due_date and a false boolean expression
        *   Add the list into the ListViewer
        * */
        if(desc.getText().isEmpty() || desc.getLength() > 256) {
            label.setText("Description must be between 1 and 256 characters.");
        }
        else {
            list.add(new Item(desc.getText(), due_date.getValue(), false));
            view.setItems(list);
            label.setText("");
        }
    }
    //method to removeItem an item
    public void removeItem(ObservableList<Item> list, ListView<Item> view, int index) {
        /*
        * Remove the item that the index has in the list
        * Add the list into the ListViewer
        * */
        list.remove(index);
        view.setItems(list);
    }
    //method to clearAll the list
    public void clearList(ObservableList<Item> list, ListView<Item> view) {
        /*
        * Clear the list
        * Add the list into the ListViewer
        * */
        list.clear();
        view.setItems(list);
    }
    //method to edit an item
    public void edit(ObservableList<Item> list, Label label, TextField nd, TextField ns, TextField index, DatePicker ndd) {
        /*
        * Set comp as false
        * Integer i gets the parse of the index's text
        * Declare a String
        * If description is empty
        *   Make the desc the same as the old one
        * Else
        *   Make the desc the new one
        * If the comp is the same
        *

         */
        int i = Integer.parseInt(index.getText());
        boolean comp = list.get(i).getComp();
        String desc;
        if(nd.getText().isEmpty()) {
            desc = list.get(i).getDesc();
        }
        else {
            desc = nd.getText();
        }
        if(index.getText().isEmpty()) {
            label.setText("Please follow instructions.");
        }
        else{
            int status = Integer.parseInt(ns.getText());
            if(ns.getText().isEmpty()) {
                label.setText("Please follow instructions.");
            }
            if(status == 1) {
                comp = true;
            }
            else if(status == 2) {
                comp = false;
            }
        }
        //edit the item
        list.set(i, new Item(desc, ndd.getValue(), comp));
    }
}
