package aws.carddemo.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoCardxrefVsamKsdsDto {
    private String xrefCardNum;
    private BigDecimal xrefCustId;
    private BigDecimal xrefAcctId;
    private String filler;
}
