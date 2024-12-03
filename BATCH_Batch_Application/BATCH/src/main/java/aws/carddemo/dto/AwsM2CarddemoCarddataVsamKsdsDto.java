package aws.carddemo.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoCarddataVsamKsdsDto {
    private String cardNum;
    private BigDecimal cardAcctId;
    private BigDecimal cardCvvCd;
    private String cardEmbossedName;
    private String cardExpiraionDate;
    private String cardActiveStatus;
    private String filler;
}
