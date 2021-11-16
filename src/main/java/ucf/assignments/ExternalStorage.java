package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExternalStorage {
    public void saveList(ObservableList<Item> list) throws IOException {
        //create a file writer
        FileWriter ofp = new FileWriter("todolist.txt");
        //make a for loop to get every item in the list
        for(Item item : list) {
            ofp.write(item.toString());
            ofp.write("\n");
        }
        ofp.close();
    }
    public void loadList(ListView<String> view) throws IOException {
        ObservableList<String> load = FXCollections.observableArrayList();
        File fp = new File("todolist.txt");
        Scanner read = new Scanner(fp);
        while(read.hasNextLine()) {
            String item = read.nextLine();
            load.add(item);
            view.setItems(load);
        }
    }
}
