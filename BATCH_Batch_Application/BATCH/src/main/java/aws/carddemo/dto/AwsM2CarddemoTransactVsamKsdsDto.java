package aws.carddemo.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoTransactVsamKsdsDto {
    private String tranId;
    private String tranTypeCd;
    private BigDecimal tranCatCd;
    private String tranSource;
    private String tranDesc;
    private BigDecimal tranAmt;
    private BigDecimal tranMerchantId;
    private String tranMerchantName;
    private String tranMerchantCity;
    private String tranMerchantZip;
    private String tranCardNum;
    private String tranOrigTs;
    private String tranProcTs;
    private String filler;
}
