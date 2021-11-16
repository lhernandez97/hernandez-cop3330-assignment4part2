package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Print {
    //method to display all the items in the list
    public void displayAll(ObservableList<Item> list, ListView<Item> view) {
        view.setItems(list);
    }
    //method to display only the completed items
    public void displayOnlyCompleted(ObservableList<Item> list, ListView<Item> view) {
        ObservableList<Item> comp = FXCollections.observableArrayList();
        for(Item item : list) {
            if(item.getComp()) {
                comp.add(item);
                view.setItems(comp);
            }
        }
    }
    //method to display only the incomplete items
    public void displayOnlyIncomplete(ObservableList<Item> list, ListView<Item> view) {
        ObservableList<Item> incomplete = FXCollections.observableArrayList();
        for(Item item : list) {
            if(!item.getComp()) {
                incomplete.add(item);
                view.setItems(incomplete);
            }
        }
    }
}
