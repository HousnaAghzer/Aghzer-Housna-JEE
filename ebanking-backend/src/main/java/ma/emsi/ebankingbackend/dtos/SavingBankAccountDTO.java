package ma.emsi.ebankingbackend.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.ebankingbackend.entities.AccountOperation;
import ma.emsi.ebankingbackend.entities.Customer;
import ma.emsi.ebankingbackend.enums.AccountStatus;

import java.util.Date;
import java.util.List;

@Data
public class SavingBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
