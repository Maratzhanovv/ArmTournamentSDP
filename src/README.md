# Armwrestling Tournament

This is a simple Java project that shows how the Builder Pattern works. The program creates different armwrestling tournaments step by step.
The Tournament class is the main product. It stores the tournament name, minimum age, city, weight limit and participant count. The TournamentBuilder class sets these values and creates the final tournament. The TournamentDirector class creates ready tournament types. The Main class runs and tests the program.
I used simple and clear names for classes, methods and variables. The methods are short and each class has its own task. The build method checks the entered values before creating a tournament. The code also uses clear and consistent formatting.

How i used Clean Code in my Code:
I used meaningful names for classes, methods and variables, so the code is easy to understand. Each method is short and does only one task. Each class also has its own responsibility. The Tournament class stores information, the TournamentBuilder creates the object, the TournamentDirector controls the building process, and the Main class tests the program. The build method validates all values and shows a clear error message if the data is incorrect. I also used private fields and consistent code formatting
