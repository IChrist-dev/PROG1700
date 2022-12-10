This ReadMe file provides information on the usage of my To-Do list program.

This program contains 4 .java files found in the /src sub-directory.
The files are titled: `Menu`, `Task`, `PrintOut`, and `Functions`.

`Menu` contains all commands relating to the program main menu. It also contains the main method which starts the program.

`Task` is the class which all items in the list are objects of. When a new task is created via the Main Menu,
a new `Task` object is created with setters and getters taking inputs from the keyboard.

`PrintOut` is a small, extended class of the Task class. Calling the method in this class on a particular Task object will display all the 
details of the object, formatted to be easily readible.

`Functions` contains all the methods used to perform the operations listed in the `Menu` class. When an option is selected
in the Main Menu, that value is passed to a switch statement that determines which `Functions` method to call upon.
Some methods call others within the same class for more intelligent behaviour. For example, when the user has marked a task
as done, the markDone() method asks if the user wishes to delete the now-completed task. If they wish to do so, the
removeTask() method is called from within the markDone() method.

----------------------
Running the program

When started, the user is presented with the Main Menu list of options. Select an option (ex. 1. Add a task) by entering a 
number value at the keyboard. 

1. Add a task - 
The user is asked to provide the details of the new task including: task name, due date, and a description. All fields are
optional so can be left blank. The status of a new task will always be set to `Not Done` but this can be changed later via
the edit option.
A final prompt asks the user if they wish to add this new task to the arrayList. This check exists in case the user noticed
they have made a typo. If y (case insensitive) is selected, the task object is added to the list.

2. Mark a task as done - 
The user is asked which task from the list they wish to mark done. Tasks are listed by Task numbers, via Main Menu option 5.
After selecting a task (assuming the task exists) its status is automatically changed to `Done`.
The user is then asked if they wish to remove the completed task. 

3. Remove a task - 
Selecting this option leads to a prompt similar to the previous option. The task # is selected and the user is asked to 
confirm they want to remove the task. This is a safety measure to prevent accidental task deletion. If yes, the task is 
removed.

4. Edit a task -
Like before, a task # is requested. The user is then presented with another list of options. This is to select which attribute
of the Task object they wish to edit. When an option # is input, the corresponding prompt asks for an updated value for that
attribute. The new value is saved and the task is updated.

5. Display all tasks - 
This option is useful to see when a change to the task list has been successful. In the code, a for-loop iterates through the
array list of Task objects, calling the printTask() method from the extended PrintOut class for each task.

6. Exit - 
The user is asked if they are sure they want to exit. If yes is selected, this simply collapses the while-loop which allows 
the Menu.run() method to continuously operate.
