Bingo 90 Stripe Generator

This Java application generates Bingo 90 stripes and outputs them either to the console or to a file. 
It is built using Gradle for dependency management and execution.

Features

    Generates Bingo 90 stripes.
    Allows specifying the number of stripes to generate.
    Outputs results to either the console or a file (stripes.txt).

Requirements

    Java: JDK 23 or higher.
    Gradle: Gradle 6.0 or higher (can use the Gradle wrapper included in the project).

Usage
1. Build the Project

To compile the project and ensure all dependencies are installed, use:

./gradlew build

2. Run the Application

Use the following command to run the application:

./gradlew run --args="<number_of_stripes> <output_mode>"

Parameters:

    <number_of_stripes>: (Optional) Number of Bingo 90 stripes to generate. Default is 1.
    <output_mode>: (Optional) Specify file to output the stripes to stripes.txt. Leave blank to print to the console.

Examples:

    Generate 5 stripes and print to the console:

./gradlew run --args="5"

Generate 10 stripes and save to stripes.txt:

    ./gradlew run --args="10 file"
