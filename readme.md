**To-Do List Application**

- A To-Do List is an app which allows you to add, edit, and remove items from a list
- This To-Do List will allow you to add up to 100 items, each with their own description, due date, and status, all of which can be edited

> Adding an Item
- When adding an item, make sure to select the due date from the DatePicker.
- When writing the description, please make sure that the description has anywhere between 1 to 256 characters; no more, no less.
- An item will automatically be declared incomplete
> Deleting an Item
- When deleting an item, make sure to include the index of the item. For example, if you want to delete the first item, you would input 0. So for any item index n, input n - 1
> Clearing the List
- Press the "Clear List" Button to clear the list of all of its items
> Editing an Item
- To choose which item to edit, make sure to input the index of the item, just like for when you are going to delete an item.
- You can choose to edit the due date, description, or the status.
- When changing the status, input '1' for a "complete" status, and '2' for an "incomplete" status
> Displaying all the Items
- This is the default way the app shows your items
- When outside this view, just press the "Display All" button, and every item will appear in the screen
> Displaying only the Completed Items
- If you only want to see the completed items in your list, press the "Display Complete Items" Button
> Displaying only the Incomplete Items
- Press the "Display Incomplete Items" button to show you only the incomplete items.
> Saving a List
- Press the "Save List" button to save the list to external storage
- When you save the list, it will be saved in a text file called "todolist.txt" file, and everytime to decide to save a list, it will replace the old list with the new one
> Loading a List
- Right next to the main list is the load list, which is where the items that you saved to "todolist.txt" will show up. Depending on when you saved it, it could be different, perfect for comparing!
- To load "todolist.txt", just press the "Load List" button, and all of the items in the "todolist.txt" file at that time will show up 