package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.time.LocalDate;

public class Item {
    //create instance variables
    private String desc;
    private LocalDate due_date;
    private boolean comp;
    //constructor
    public Item(String desc, LocalDate due_date, boolean comp) {
        this.desc = desc;
        this.due_date = due_date;
        this.comp = comp;
    }
    //get methods
    public boolean getComp() {
        return comp;
    }
    public String getDesc() {
        return desc;
    }
    //set methods
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setDueDate(LocalDate due_date) {
        this.due_date = due_date;
    }
    public void setComp(boolean comp) {
        this.comp = comp;
    }
    //Override method to print the item components
    @Override
    public String toString() {
        return("Description: " + desc +
                " | Due Date: " + due_date +
                " | Status: " + (comp ? "Complete" : "Incomplete"));
    }
}
