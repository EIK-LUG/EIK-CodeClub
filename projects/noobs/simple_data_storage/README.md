
# A simple text base data table program component

## ToDo

    Make a list of some data components
    
    Transform that data into string rows that can be written to a file
    
    Write those rows into a file
    
    Read those rows from the file
    
    Create the original data from the rows you read

## Why?

For an example, let say you have a command line ToDo list program. You can create new ToDo items but once the user closes
the program, they are not saved anywhere. You would need some sort of data storage component in your program. 

One solution would be to write the data into a file when it is create and when needed it can be retrieved, so if the program 
is closed the data will remain in the file.

## How?

This is an example data storage file for a ToDo list application:

name|priority  
Take dog for a walk|3  
Attend EIK-CodeClub|1   
Attend PythonCodeClub|2  

Let's say your ToDo items are a class (Java/Python/C++):

    class ToDo
        name = "Attend PythonCodeClub"
        priority = 2

or an associative container (struct/dict/map) (javascript/c/clojure/clojurescript/python/c++/java)

    {"name": "Attend PythonCodeClub",
     "priority": 2}
     
Either way you need to just be able to perform data transformations:

   runtime data <-> text file data
    
    {"name": "Attend PythonCodeClub", "priority": 2} <-> "Attend PythonCodeClub|2"
        
