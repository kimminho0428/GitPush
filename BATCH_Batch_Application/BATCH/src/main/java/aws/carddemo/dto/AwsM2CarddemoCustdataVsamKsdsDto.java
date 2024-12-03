package aws.carddemo.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoCustdataVsamKsdsDto {
    private BigDecimal custId;
    private String custFirstName;
    private String custMiddleName;
    private String custLastName;
    private String custAddrLine1;
    private String custAddrLine2;
    private String custAddrLine3;
    private String custAddrStateCd;
    private String custAddrCountryCd;
    private String custAddrZip;
    private String custPhoneNum1;
    private String custPhoneNum2;
    private BigDecimal custSsn;
    private String custGovtIssuedId;
    private String custDobYyyymmdd;
    private String custEftAccountId;
    private String custPriCardHolderInd;
    private BigDecimal custFicoCreditScore;
    private String filler;
}
