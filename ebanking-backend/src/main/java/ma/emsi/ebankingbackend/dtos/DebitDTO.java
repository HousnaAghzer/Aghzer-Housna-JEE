package ma.emsi.ebankingbackend.dtos;
import lombok.Data;
@Data
public class DebitDTO {
    private String accountId;
    private double amount;
    private String description;
}
