# Factory-Robot-Hazard-Analyzer-System
The Factory Robot Hazard Analyzer System evaluates the hazard risk of a factory robot based on arm precision, worker density, and machinery state.

## Use Case 1: Display Static Hazard Message

### Description
Displays a static message indicating the purpose of the system. When the program is executed, it prints "Factory Robot Hazard Analyzer" to the console.

## Use Case 2: Accept Robot Hazard Inputs

### Description
Accepts the required robot hazard inputs from the user using Scanner. The user enters the arm precision, worker density, and machinery state, and the program displays the entered values without performing any validation.

## Use Case 3: Calculate Hazard Risk Score

### Description
Calculates and displays the robot hazard risk score using the arm precision, worker density, and machinery state provided by the user. The inputs are assumed to be valid and no validation is performed at this stage.

## Use Case 4: Introduce Validation Using Conditional Logic

### Description
Validates the arm precision, worker density, and machinery state using conditional statements. If any input is invalid, the program displays an appropriate error message. If all inputs are valid, the hazard risk score is calculated and displayed.

## Use Case 5: Refactor Validation into a Separate Method

### Description
Refactors the validation and hazard risk calculation logic into a separate `calculateHazardRisk()` method. The method accepts arm precision, worker density, and machinery state as parameters, validates the inputs, and returns the calculated hazard risk score while keeping the `main()` method minimal.

## Use Case 6: Introduce Custom Exception - RobotSafetyException

### Description
Introduces a custom `RobotSafetyException` to handle invalid robot hazard inputs. The `calculateHazardRisk()` method throws the custom exception when an invalid input is detected, while the `main()` method uses a try-catch block to handle the exception and display the appropriate error message.

## Use Case 7: Machinery State Risk Mapping

### Description
Implements structured machinery state risk mapping by assigning a specific risk factor to each supported machinery state. The system supports Worn, Faulty, and Critical states and throws a RobotSafetyException when an unsupported machinery state is entered.
