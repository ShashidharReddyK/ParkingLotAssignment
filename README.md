### Java 17

### maven repositories - { 'lombok' }

***
#   Make a Jar file for easy deploy with below steps
***

* Open your project: Open IntelliJ IDEA and load the project you want to export.

* Build the project: Make sure your project is built and there are no compilation errors. You can do this by clicking on Build -> Build Project from the menu bar, or simply pressing Ctrl + F9 (Cmd + F9 on Mac).

* Configure artifact: IntelliJ IDEA uses artifacts to define how to package your project. Go to File -> Project Structure (or press Ctrl + Alt + Shift + S), then select Artifacts from the left sidebar.

* Add a new artifact: Click the + button and select JAR from the dropdown menu. Choose From modules with dependencies.

* Configure JAR settings: In the dialog that appears, select the module containing your main class from the Module dropdown. Ensure the Main class field is correctly populated with the class containing the main method. If not, click ... and select the appropriate class.

* Choose JAR file location: Specify the location where you want to save the JAR file. You can choose to output it to the out directory of your project or specify a custom location.

* Build the artifact: Click OK to close the dialog, then click Apply and OK to apply the changes and close the Project Structure dialog.

* Build the artifact: Finally, go to Build -> Build Artifacts and select the artifact you just configured. Choose Build or Rebuild to generate the JAR file.


## To execute a JAR file from the command prompt, follow these steps:

* Open Command Prompt: Press Win + R to open the Run dialog, type cmd, and press Enter.

* Navigate to the directory containing the JAR file: Use the cd command to navigate to the directory where your JAR file is located. For example
* cd path\to\directory
* Execute the JAR file: Once you're in the correct directory, use the java command followed by the -jar option and the name of your JAR file to execute it. For example:
* java -jar YourJarFile.jar


## Command List available :
* To create a parking lot: 'create_parking_lot <number_of_available_slots>'
* To park a car: 'park <car_registration_number> <colour>'
* To exit a car: 'leave <slot_given_to_you>'
* To get cars by colour: 'registration_numbers_for_cars_with_colour <colour>'
* To get the status of parking lot: 'status'
* To exit the parking lot system: 'exit' 


### To use already made jar file

* Go to '''out/artifacts/ParkingLotAssignment_jar'''
* Download the jar file and follow the above jar file execution steps