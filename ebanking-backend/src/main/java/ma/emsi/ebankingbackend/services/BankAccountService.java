package ma.emsi.ebankingbackend.services;

<<<<<<< HEAD
import ma.emsi.ebankingbackend.entities.BankAccount;
import ma.emsi.ebankingbackend.entities.Customer;
=======
import ma.emsi.ebankingbackend.dtos.*;
import ma.emsi.ebankingbackend.entities.BankAccount;
import ma.emsi.ebankingbackend.entities.CurrentAccount;
import ma.emsi.ebankingbackend.entities.Customer;
import ma.emsi.ebankingbackend.entities.SavingAccount;
import ma.emsi.ebankingbackend.exceptions.BalanceNotSufficientException;
import ma.emsi.ebankingbackend.exceptions.BankAccountNotFoundException;
>>>>>>> 44641c24e279ed0905c29da9bac5d9762b1f649d
import ma.emsi.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
<<<<<<< HEAD
     Customer saveCustomer(Customer customer);
     BankAccount saveBankAccount(double initialBalance, String type, Long CustomerId) throws CustomerNotFoundException;
     List<Customer> listCustomers();
     BankAccount getBankAccount(String accountId);
     void debit(String accountId, double amount, String description);
     void credit(String accountId, double amount, String description);
     void transfert(String accountIdSource, String accountIdDestination, double amount);

=======
     //Customer saveCustomer(Customer customer);

     CustomerDTO saveCustomer(CustomerDTO customerDTO);

     CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long CustomerId) throws CustomerNotFoundException;
     SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long CustomerId) throws CustomerNotFoundException;

     List<CustomerDTO> listCustomers();
     BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
     void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
     void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
     void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

     CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

     CustomerDTO updateCustomer(CustomerDTO customerDTO);

     void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
>>>>>>> 44641c24e279ed0905c29da9bac5d9762b1f649d
}
