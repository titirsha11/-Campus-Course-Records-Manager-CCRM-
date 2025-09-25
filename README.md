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
