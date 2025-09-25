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
