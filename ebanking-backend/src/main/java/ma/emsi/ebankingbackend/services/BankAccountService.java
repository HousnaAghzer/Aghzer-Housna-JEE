package ma.emsi.ebankingbackend.services;

import ma.emsi.ebankingbackend.entities.BankAccount;
import ma.emsi.ebankingbackend.entities.Customer;
import ma.emsi.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
     Customer saveCustomer(Customer customer);
     BankAccount saveBankAccount(double initialBalance, String type, Long CustomerId) throws CustomerNotFoundException;
     List<Customer> listCustomers();
     BankAccount getBankAccount(String accountId);
     void debit(String accountId, double amount, String description);
     void credit(String accountId, double amount, String description);
     void transfert(String accountIdSource, String accountIdDestination, double amount);

}
