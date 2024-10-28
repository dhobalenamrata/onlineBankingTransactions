The onlineBankingTransactions project is organized into five main packages, with PhonePe and GPay functioning as part of the BLC(Business Logic Component) & MySystem is functioning as a the ELC(Execution Logic Component) for payment processing.

Package Overview
BankAccount: Contains the main BankAccount class with account details and custom exceptions to handle transaction errors.
GooglePe and PhonePe: Both act as BLC (Business Logic Component) classes, representing payment applications (Google Pay and PhonePe) and handling payments.
TransactionByUsing: Provides transaction methods like Account Number, Mobile Number, QR, and UPI ID.
BankingTransactions: Holds the core business logic and the main system entry class.

Folder Hierarchy :
        onlineBankingTransactions/
        │
        ├── src/
        │   ├── BankAccount/
        │   │   ├── BankAccount.java               # Holds core account info (balance, accNo, mobNo)
        │   │   ├── InvalidTransaction.java        # Custom exception for invalid transactions
        │   │   ├── InsufficientBalanceException.java # Exception for insufficient balance errors
        │   │   └── NegativeAmountException.java   # Exception for negative amount transactions
        │   │
        │   ├── GooglePe/
        │   │   └── GPay.java                      # Part of BLC; represents Google Pay functionality
        │   │
        │   ├── PhonePe/
        │   │   └── PhonePe.java                   # Part of BLC; represents PhonePe functionality
        │   │
        │   ├── TransactionByUsing/
        │   │   ├── AccountNumber.java             # Transaction by account number
        │   │   ├── MobileNumber.java              # Transaction by mobile number
        │   │   ├── QR.java                        # Transaction by QR code
        │   │   └── UPIiD.java                     # Transaction by UPI ID
        │   │
        │   └── BankingTransactions/
        │       ├── BLC.java                       # Core business logic integrating GPay and PhonePe
        │       └── MySystem.java                  # Main class, initializes system and handles transactions
        │
        └── README.md                              # Project documentation

This setup makes it clear that PhonePe and GPay are part of the BLC package, keeping all business logic components organized within specific packages and promoting code reusability and modularity.


BankAccount Package

BankAccount.java: This class holds the main attributes for a bank account, with the following:
Fields:
balance (double): stores the account balance.
accNo (String): stores the account number.
mobNo (long): stores the mobile number associated with the account.
Constructor: A parameterized constructor initializes all fields.
Methods:
Getters and setters for each field.
Overridden toString() to print account details.
InvalidTransaction: A custom exception class to handle invalid transactions.
InsufficientBalanceException: Custom exception triggered when a transaction amount exceeds the balance.
NegativeAmountException: Custom exception for handling negative transaction amounts.
GooglePe Package

GPay.java: Part of the BLC, this class represents the Google Pay web application.
Static BankAccount Reference: Holds a static reference to a BankAccount object.
Constructor: Initializes the BankAccount reference.
Methods:
makePayment(Object obj, double amt): Processes payments, with obj as the identifier and amt as the transaction amount.
Overridden toString() to provide details about the GPay instance.
PhonePe Package

PhonePe.java: Also part of the BLC, representing the PhonePe application.
Static BankAccount Reference: Holds a static BankAccount reference.
Constructor: Initializes the BankAccount reference.
Methods:
makePayment(Object obj, double amt): Processes payments, with obj as the identifier and amt as the transaction amount.
Overridden toString() to provide details about the PhonePe instance.
TransactionByUsing Package

AccountNumber.java: Represents a transaction via account number.
Field: Unique identifier for account number-based transactions.
MobileNumber.java: Represents a transaction via mobile number.
Field: Unique identifier for mobile number-based transactions.
QR.java: Represents a transaction via QR code.
Field: Unique identifier for QR-based transactions.
UPIiD.java: Represents a transaction via UPI ID.
Field: Unique identifier for UPI ID-based transactions.
BankingTransactions Package

BLC.java: Holds business logic for managing transactions across different channels, including GPay and PhonePe.
MySystem.java: Main class, serves as an entry point to the project, initializing transactions and simulating interaction between BankAccount, GPay, PhonePe, and different transaction methods.
