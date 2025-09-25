# -Campus-Course-Records-Manager-CCRM-
CCRM/
├── MultipleFiles/            # Contains all Java source files and READMEs
│   ├── CCRMApp.java          # Main CLI application entry point
│   ├── AppConfig.java        # Singleton configuration class
│   ├── Semester.java         # Enum for semesters
│   ├── Grade.java            # Enum for grades with points
│   ├── Course.java           # Course entity with Builder pattern
│   ├── Person.java           # Abstract base class for individuals
│   ├── Student.java          # Student entity, extends Person
│   ├── MaxCreditLimitExceededException.java # Custom checked exception
│   ├── FileUtilityService.java # Partial NIO.2 utility for directory operations
│   ├── CourseService.java    # Service for managing courses
│   ├── StudentService.java   # Service for managing students
│   ├── FileUtil.java         # Utility for recursive directory size
│   └── README                # Binary file (as per context)
│   └── README.md             # (This file)
├── screenshots/              # Folder for project screenshots
├── test-data/                # (Optional) Sample CSVs for import
├── data/                     # (Generated) Exports, backups
└── .gitignore                # Git ignore file
OOP Pillars: Encapsulation, Inheritance, Abstraction, Polymorphism.
Design Patterns: Singleton (AppConfig), Builder (Course.Builder).
Modern Java Features: Enums (Semester, Grade), Date/Time API (LocalDate), NIO.2 (FileUtilityService), basic Streams.
Control Flow: switch statements, while loops, break/continue.
Custom Exceptions: MaxCreditLimitExceededException.
File Utilities: Basic directory operations and recursive size computation.
The application is structured with clear packages and provides a foundational framework for a more extensive CCRM system.


Technical Demonstrations
This project maps to the syllabus requirements, showcasing various Java SE features and OOP principles.

Syllabus Topic

Description

File/Class/Method Example

Primitives, Objects, Operators

Primitive vars (int credits); objects (Student, Course); arithmetic (GPA calc placeholder), relational/logical (switch cases).

Course.java (credits); CCRMApp.java (switch input).

Decision Structures

if/else (in AppConfig for singleton); switch (main menu).

AppConfig.java (getInstance); CCRMApp.java (main menu switch).

Loops

while (main menu loop); break/continue (in CCRMApp switch).

CCRMApp.java (while loop, break/continue in switch).

Arrays & Utilities

(Not explicitly shown in provided files, but List is used).

(Placeholder for future implementation, e.g., Arrays.sort on course codes).

Strings

Common methods (e.g., System.out.println for output).

CCRMApp.java (scanner.nextLine()).

Encapsulation

Private fields + getters/setters.

Person.java (protected fields, public getters); AppConfig.java (private fields, public getters/setters).

Inheritance

Student extends Person.

Student.java (extends Person).

Abstraction

Abstract class Person with abstract method printProfile().

Person.java (abstract class, abstract printProfile()); Student.java (overrides printProfile()).

Polymorphism

Student overrides printProfile() from Person.

Student.java (overrides printProfile()).

Access Levels

private (fields), protected (in Person), public (methods, classes).

Person.java (protected fields); AppConfig.java (private constructor).

Immutability

(Not explicitly shown in provided files, but can be applied to CourseCode or Name if created).

(Placeholder for future implementation, e.g., final fields in a value object).

Top-Level & Nested Classes

Top-level (all classes); static nested (Course.Builder).

Course.java (static nested Builder class).

Interfaces

(Not explicitly shown in provided files).

(Placeholder for future implementation, e.g., Persistable interface).

Functional Interfaces & Lambdas

(Not explicitly shown in provided files).

(Placeholder for future implementation, e.g., Comparator lambdas for sorting).

Anonymous Inner Classes

(Not explicitly shown in provided files).

(Placeholder for future implementation).

Enums

Semester (with constructor/fields); Grade (with constructor/fields).

Semester.java (code, weeks); Grade.java (gradePoints).

Overriding/Overloading

toString() override in Course, Semester. printProfile() override in Student.

Course.java (toString()); Student.java (printProfile()).

Design Patterns

Singleton (AppConfig); Builder (Course.Builder).

AppConfig.java (getInstance()); Course.java (Builder).

Exceptions

Custom checked exception MaxCreditLimitExceededException. try/catch (implicit in CLI, explicit in FileUtilityService).

MaxCreditLimitExceededException.java; FileUtilityService.java (throws IOException).

File I/O (NIO.2)

Path & Files APIs for directory checks/creation. Files.walkFileTree for recursive size.

FileUtilityService.java (ensureDirectory, Files.exists, createDirectories); FileUtil.java (computeDirectorySize).

Date/Time API

LocalDate for Person registration date.

Setup Instructions
1. Install and Configure Java on Windows
This project requires JDK 17 (Java SE). Follow these steps:

Download JDK 17:

Go to Oracle JDK 17 Downloads or Adoptium OpenJDK 17.
Select the Windows x64 Installer (.msi).
Install JDK:

Run the installer as Administrator.
Follow the wizard: Accept license, install to default path (e.g., C:\Program Files\Java\jdk-17).
Ensure "Add to PATH" is checked (if prompted).
Configure Environment Variables:

Search "Environment Variables" in Windows Start Menu > Edit system environment variables > Environment Variables button.
Under System Variables:
New: Variable name JAVA_HOME, Value C:\Program Files\Java\jdk-17 (adjust if different).
Edit Path: Add %JAVA_HOME%\bin (move it up if needed).
Click OK > Restart Command Prompt.
Verify Installation:

Open Command Prompt (Win + R > cmd).
Run: java -version and javac -version.
Expected output:

Run
Copy code
java version "17.0.x" 2023-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+x-LTS)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+x-LTS, mixed mode, sharing)
Screenshot: See JDK Version Verification.
JDK Install Screenshot
(Screenshot: Java installer window or Environment Variables dialog.)

2. Set Up IDE: Visual Studio Code (Recommended) or Eclipse
This project is optimized for VSCode but compatible with Eclipse.

Visual Studio Code (VSCode)
Download and Install:

Get VSCode from code.visualstudio.com.
Install and launch.
Install Java Extensions:

Open Extensions (Ctrl+Shift+X) > Search "Extension Pack for Java" (by Microsoft) > Install.
Includes: Language Support for Java, Debugger, Test Runner.
Open Project:

File > Open Folder > Select the CCRM project folder.
VSCode auto-detects Java: Reload if prompted.
Configure JDK: Ctrl+Shift+P > "Java: Configure Java Runtime" > Select JDK 17 path.
Run Configuration:

Open CCRMApp.java in edu.ccrm.cli.
Click Run (green triangle) or F5 for debug.
For assertions: Edit run config (Ctrl+Shift+P > "Java: Open Run and Debug Configurations") > Add -ea to VM arguments.
Screenshot: See VSCode Project Setup.
(Screenshot: Explorer showing packages, Run button on CCRMApp.java.)

Eclipse IDE (Alternative, as per Requirements)
Download and Install:

Get Eclipse IDE for Java Developers from eclipse.org/downloads.
Extract and run eclipse.exe.
Create New Project:

File > New > Java Project > Name: CCRM > Use default JRE (JDK 17) > Finish.
Copy src folder contents to Eclipse's src folder.
Run Configuration:

Right-click CCRMApp.java > Run As > Java Application.
For assertions: Run Configurations > Arguments tab > VM arguments: -ea.
Screenshot: See Eclipse Project Setup.
(Screenshot: New Java Project wizard and Run Configurations dialog.)

Project Structure

Run
Copy code
CCRM/
├── MultipleFiles/            # Contains all Java source files and READMEs
│   ├── CCRMApp.java          # Main CLI application entry point
│   ├── AppConfig.java        # Singleton configuration class
│   ├── Semester.java         # Enum for semesters
│   ├── Grade.java            # Enum for grades with points
│   ├── Course.java           # Course entity with Builder pattern
│   ├── Person.java           # Abstract base class for individuals
│   ├── Student.java          # Student entity, extends Person
│   ├── MaxCreditLimitExceededException.java # Custom checked exception
│   ├── FileUtilityService.java # Partial NIO.2 utility for directory operations
│   ├── CourseService.java    # Service for managing courses
│   ├── StudentService.java   # Service for managing students
│   ├── FileUtil.java         # Utility for recursive directory size
│   └── README                # Binary file (as per context)
│   └── README.md             # (This file)
├── screenshots/              # Folder for project screenshots
├── test-data/                # (Optional) Sample CSVs for import
├── data/                     # (Generated) Exports, backups
└── .gitignore                # Git ignore file
(Note: The provided context places all files under MultipleFiles/. For a standard Java project, these would typically be moved directly into src/edu/ccrm/... as per the suggested package design. This README reflects the structure as given in the context.)

How to Run
Prerequisites: JDK 17 installed (see Setup). Clone/open the repo in VSCode/Eclipse.
Compile (Auto in IDE; manual via Terminal in project root):
Navigate to the MultipleFiles directory within your project.
bash

Run
Copy code
# Example for compiling all .java files in the current directory (MultipleFiles)
javac -d ../bin *.java
(Note: For a more robust setup, you'd typically compile from the project root, specifying the src directory and outputting to a bin directory, but this reflects the given file structure.)
Run (from the directory containing the compiled .class files, e.g., ../bin if compiled as above):
VSCode: Open CCRMApp.java > Click Run (or F5).
Terminal (assuming CCRMApp.class is in ../bin and you are in MultipleFiles):
bash

Run
Copy code
java -ea -cp ../bin edu.ccrm.cli.CCRMApp
(Note: The package structure edu.ccrm.cli is assumed based on the package declaration in CCRMApp.java.)
Eclipse: Right-click CCRMApp.java > Run As > Java Application (add -ea in VM args).
Expected Output: CLI menu starts. Follow prompts (e.g., "1" for Students). Data saves to data/ folder.
JDK Version: Requires Java SE 17. Tested on Windows 11.

Run the app: CCRMApp.java loads AppConfig (Singleton) and prints the data folder path.
Main Menu (using switch and while loop):
1. Manage Students: Calls StudentService.manageStudents(). This currently adds a sample student ("Alice Johnson") and prints their profile.
2. Manage Courses: Calls CourseService.manageCourses(). This currently adds a sample course ("CS101") using the Builder pattern.
3. Enrollment & Grading: Prints "Enrollment & Grading selected." (Placeholder for future logic).
4. File Operations: Prints "File Operations selected." (Placeholder for future logic, FileUtilityService is partially implemented).
5. Reports: Prints "Reports selected." (Placeholder for future logic).
6. Exit: Sets exit = true, terminating the while loop and closing the scanner.
Invalid Option: Demonstrates continue to re-display the menu.
The application will exit after selecting option 6.
Screenshot: See Program Running.
(Screenshot: Console output showing the main menu and output from "Manage Students" or "Manage Courses".)

Technical Demonstrations
This project maps to the syllabus requirements, showcasing various Java SE features and OOP principles.

Syllabus Topic

Description

File/Class/Method Example

Primitives, Objects, Operators

Primitive vars (int credits); objects (Student, Course); arithmetic (GPA calc placeholder), relational/logical (switch cases).

Course.java (credits); CCRMApp.java (switch input).

Decision Structures

if/else (in AppConfig for singleton); switch (main menu).

AppConfig.java (getInstance); CCRMApp.java (main menu switch).

Loops

while (main menu loop); break/continue (in CCRMApp switch).

CCRMApp.java (while loop, break/continue in switch).

Arrays & Utilities

(Not explicitly shown in provided files, but List is used).

(Placeholder for future implementation, e.g., Arrays.sort on course codes).

Strings

Common methods (e.g., System.out.println for output).

CCRMApp.java (scanner.nextLine()).

Encapsulation

Private fields + getters/setters.

Person.java (protected fields, public getters); AppConfig.java (private fields, public getters/setters).

Inheritance

Student extends Person.

Student.java (extends Person).

Abstraction

Abstract class Person with abstract method printProfile().

Person.java (abstract class, abstract printProfile()); Student.java (overrides printProfile()).

Polymorphism

Student overrides printProfile() from Person.

Student.java (overrides printProfile()).

Access Levels

private (fields), protected (in Person), public (methods, classes).

Person.java (protected fields); AppConfig.java (private constructor).

Immutability

(Not explicitly shown in provided files, but can be applied to CourseCode or Name if created).

(Placeholder for future implementation, e.g., final fields in a value object).

Top-Level & Nested Classes

Top-level (all classes); static nested (Course.Builder).

Course.java (static nested Builder class).

Interfaces

(Not explicitly shown in provided files).

(Placeholder for future implementation, e.g., Persistable interface).

Functional Interfaces & Lambdas

(Not explicitly shown in provided files).

(Placeholder for future implementation, e.g., Comparator lambdas for sorting).

Anonymous Inner Classes

(Not explicitly shown in provided files).

(Placeholder for future implementation).

Enums

Semester (with constructor/fields); Grade (with constructor/fields).

Semester.java (code, weeks); Grade.java (gradePoints).

Overriding/Overloading

toString() override in Course, Semester. printProfile() override in Student.

Course.java (toString()); Student.java (printProfile()).

Design Patterns

Singleton (AppConfig); Builder (Course.Builder).

AppConfig.java (getInstance()); Course.java (Builder).

Exceptions

Custom checked exception MaxCreditLimitExceededException. try/catch (implicit in CLI, explicit in FileUtilityService).

MaxCreditLimitExceededException.java; FileUtilityService.java (throws IOException).

File I/O (NIO.2)

Path & Files APIs for directory checks/creation. Files.walkFileTree for recursive size.

FileUtilityService.java (ensureDirectory, Files.exists, createDirectories); FileUtil.java (computeDirectorySize).

Date/Time API

LocalDate for Person registration date.

Person.java (LocalDate.now()).

Java Background
Evolution of Java
1991: Project Green (precursor at Sun Microsystems, led by James Gosling).
1995: Java 1.0 released (OOP language with "Write Once, Run Anywhere" via JVM).
1998-2006: J2SE/J2EE/J2ME editions; generics (1.5), annotations (1.5).
2006: Editions renamed Java SE/EE/ME.
2014: Java 8 (lambdas, Streams, default interface methods).
2017: Java 9 (modules); Oracle open-sources OpenJDK.
2018+: LTS releases (11, 17, 21); records, sealed classes (16+); Project Loom (virtual threads, 21).
Java Editions: ME vs SE vs EE
Edition

Description

Use Cases

Key Differences

Java ME** (Micro Edition)

Lightweight for resource-constrained devices (e.g., IoT, mobile pre-Android).

Embedded systems, old phones (CLDC/MIDP profiles).

Small footprint; no full SE libraries; subset APIs (no Swing, limited threads).

Java SE** (Standard Edition)

Core platform for desktop/server apps; includes JDK/JRE.

Console apps (like this project), desktop tools, local servers.

Full APIs (Streams, NIO.2); no enterprise features; used here for OOP/CLI.

Java EE** (Enterprise Edition, now Jakarta EE)

Builds on SE for scalable web/enterprise; includes SE + extras (Servlets, JPA).

Web apps, microservices (e.g., Spring Boot).

Adds distributed computing (EJB, JMS); heavier; requires app servers (Tomcat, GlassFish).

Java SE is the foundation; ME is slimmed-down; EE extends for business.

Java Architecture: JDK, JRE, JVM
JVM (Java Virtual Machine): Runtime engine that executes bytecode (.class files). Handles memory (heap/stack), GC, JIT compilation for platform independence. "Write Once, Run Anywhere."
JRE (Java Runtime Environment): Subset of JDK for running apps (includes JVM + core libraries like java.lang/io/util). No compilation tools.
JDK (Java Development Kit): Full development kit (includes JRE + compiler javac, debugger jdb, etc.). Essential for writing and compiling Java programs.
Interaction: You write Java source code (.java files) using the JDK. The javac compiler (part of JDK) converts it into bytecode (.class files). The JRE (which contains the JVM and core libraries) then executes this bytecode. The JVM interprets/JIT-compiles the bytecode into machine-specific instructions, allowing the program to run on any platform with a compatible JRE.

Assertions are used in Java to check for conditions that should always be true at a certain point in the code (invariants). They are primarily for debugging and development, not for handling expected runtime errors.

To enable assertions, you must run the Java application with the -ea (enable assertions) flag.

VSCode: Configure in Run and Debug Configurations (VM arguments: -ea).
Terminal: java -ea -cp <classpath> edu.ccrm.cli.CCRMApp
Example assertion in AppConfig.java:

java

Run
Copy code
assert dataFolderPath != null : "Data folder path cannot be null";
If dataFolderPath were null and assertions are enabled, an AssertionError would be thrown.

Troubleshooting
"java: command not found" / "javac: command not found": Ensure JDK is installed and JAVA_HOME and Path environment variables are correctly set.
"Error: Could not find or load main class edu.ccrm.cli.CCRMApp":
Verify CCRMApp.java is in the edu/ccrm/cli package.
Ensure you are running the java command from the correct directory, and the -cp (classpath) points to the directory containing the compiled .class files (e.g., bin or MultipleFiles if compiling in place).
Compilation Errors in IDE: Check for missing imports, typos, or incorrect package declarations. Use your IDE's "Clean Project" or "Rebuild" functions.
AssertionError: This means an assertion failed. It's a debugging tool; either fix the underlying logic that caused the invariant violation or disable assertions if you're not actively debugging.
File I/O Errors: Ensure the data folder is created (the app attempts to create it) and you have write permissions in the project directory.
License
This project is licensed under the MIT License -
