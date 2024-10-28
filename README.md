The onlineBankingTransactions project is organized into five main packages, with PhonePe and GPay functioning as part of the BLC(Business Logic Component) & MySystem is functioning as a the ELC(Execution Logic Component) for payment processing.

Package Overview
BankAccount: Contains the main BankAccount class with account details and custom exceptions to handle transaction errors.
GooglePe and PhonePe: Both act as BLC (Business Logic Component) classes, representing payment applications (Google Pay and PhonePe) and handling payments.
TransactionByUsing: Provides transaction methods like Account Number, Mobile Number, QR, and UPI ID.
BankingTransactions: Holds the core business logic and the main system entry class.

Folder Hierarchy :
```plaintext
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
        │       └── MySystem.java                  # Main class, initializes system and handles transactions
        │
        └── README.md                              # Project documentation

This setup makes it clear that PhonePe and GPay are part of the BLC package, keeping all business logic components organized
within specific packages and promoting code reusability and modularity.


