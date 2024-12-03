package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbcus01cCustomerRecord {
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #6] CUST-ID (level: 5)
    private @Getter @Setter int custId;
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #7] CUST-FIRST-NAME (level: 5)
    private @Getter String custFirstName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #8] CUST-MIDDLE-NAME (level: 5)
    private @Getter String custMiddleName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #9] CUST-LAST-NAME (level: 5)
    private @Getter String custLastName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #10] CUST-ADDR-LINE-1 (level: 5)
    private @Getter String custAddrLine1 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #11] CUST-ADDR-LINE-2 (level: 5)
    private @Getter String custAddrLine2 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #12] CUST-ADDR-LINE-3 (level: 5)
    private @Getter String custAddrLine3 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #13] CUST-ADDR-STATE-CD (level: 5)
    private @Getter String custAddrStateCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #14] CUST-ADDR-COUNTRY-CD (level: 5)
    private @Getter String custAddrCountryCd = StringUtils.repeat(' ', 3);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #15] CUST-ADDR-ZIP (level: 5)
    private @Getter String custAddrZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #16] CUST-PHONE-NUM-1 (level: 5)
    private @Getter String custPhoneNum1 = StringUtils.repeat(' ', 15);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #17] CUST-PHONE-NUM-2 (level: 5)
    private @Getter String custPhoneNum2 = StringUtils.repeat(' ', 15);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #18] CUST-SSN (level: 5)
    private @Getter @Setter int custSsn;
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #19] CUST-GOVT-ISSUED-ID (level: 5)
    private @Getter String custGovtIssuedId = StringUtils.repeat(' ', 20);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #20] CUST-DOB-YYYY-MM-DD (level: 5)
    private @Getter String custDobYyyyMmDd = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #21] CUST-EFT-ACCOUNT-ID (level: 5)
    private @Getter String custEftAccountId = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #22] CUST-PRI-CARD-HOLDER-IND (level: 5)
    private @Getter String custPriCardHolderInd = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #23] CUST-FICO-CREDIT-SCORE (level: 5)
    private @Getter @Setter int custFicoCreditScore;
    // [T-Up#INFO][CVCUS01Y.cpy, LINE #24] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 168);

    public void setCustFirstName(String source) {
        custFirstName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustMiddleName(String source) {
        custMiddleName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustLastName(String source) {
        custLastName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustAddrLine1(String source) {
        custAddrLine1 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrLine2(String source) {
        custAddrLine2 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrLine3(String source) {
        custAddrLine3 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrStateCd(String source) {
        custAddrStateCd = StringUtils.truncate(StringUtils.rightPad(source, 2),
                2);
    }

    public void setCustAddrCountryCd(String source) {
        custAddrCountryCd = StringUtils.truncate(
                StringUtils.rightPad(source, 3), 3);
    }

    public void setCustAddrZip(String source) {
        custAddrZip = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setCustPhoneNum1(String source) {
        custPhoneNum1 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                15);
    }

    public void setCustPhoneNum2(String source) {
        custPhoneNum2 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                15);
    }

    public void setCustGovtIssuedId(String source) {
        custGovtIssuedId = StringUtils.truncate(
                StringUtils.rightPad(source, 20), 20);
    }

    public void setCustDobYyyyMmDd(String source) {
        custDobYyyyMmDd = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setCustEftAccountId(String source) {
        custEftAccountId = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setCustPriCardHolderInd(String source) {
        custPriCardHolderInd = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils
                .truncate(StringUtils.rightPad(source, 168), 168);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 500), 500);
        try {
            custId = (int) DataConverter.convZonedStringToLong(
                    source.substring(0, 9), 9);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            custId = 0;
        }
        custFirstName = source.substring(9, 34);
        custMiddleName = source.substring(34, 59);
        custLastName = source.substring(59, 84);
        custAddrLine1 = source.substring(84, 134);
        custAddrLine2 = source.substring(134, 184);
        custAddrLine3 = source.substring(184, 234);
        custAddrStateCd = source.substring(234, 236);
        custAddrCountryCd = source.substring(236, 239);
        custAddrZip = source.substring(239, 249);
        custPhoneNum1 = source.substring(249, 264);
        custPhoneNum2 = source.substring(264, 279);
        try {
            custSsn = (int) DataConverter.convZonedStringToLong(
                    source.substring(279, 288), 9);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            custSsn = 0;
        }
        custGovtIssuedId = source.substring(288, 308);
        custDobYyyyMmDd = source.substring(308, 318);
        custEftAccountId = source.substring(318, 328);
        custPriCardHolderInd = source.substring(328, 329);
        try {
            custFicoCreditScore = (int) DataConverter.convZonedStringToLong(
                    source.substring(329, 332), 3);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            custFicoCreditScore = 0;
        }
        OFFILLER1 = source.substring(332, 500);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataConverter.convZonedLongToString(custId, 9));
        sb.append(custFirstName);
        sb.append(custMiddleName);
        sb.append(custLastName);
        sb.append(custAddrLine1);
        sb.append(custAddrLine2);
        sb.append(custAddrLine3);
        sb.append(custAddrStateCd);
        sb.append(custAddrCountryCd);
        sb.append(custAddrZip);
        sb.append(custPhoneNum1);
        sb.append(custPhoneNum2);
        sb.append(DataConverter.convZonedLongToString(custSsn, 9));
        sb.append(custGovtIssuedId);
        sb.append(custDobYyyyMmDd);
        sb.append(custEftAccountId);
        sb.append(custPriCardHolderInd);
        sb.append(DataConverter.convZonedLongToString(custFicoCreditScore, 3));
        sb.append(OFFILLER1);
        return sb.toString();
    }

    public void set(Cbcus01cFdCustfileRec source) {
        custId = source.getFdCustId();
        custFirstName = source.getFdCustData().substring(0, 25);
        custMiddleName = source.getFdCustData().substring(25, 50);
        custLastName = source.getFdCustData().substring(50, 75);
        custAddrLine1 = source.getFdCustData().substring(75, 125);
        custAddrLine2 = source.getFdCustData().substring(125, 175);
        custAddrLine3 = source.getFdCustData().substring(175, 225);
        custAddrStateCd = source.getFdCustData().substring(225, 227);
        custAddrCountryCd = source.getFdCustData().substring(227, 230);
        custAddrZip = source.getFdCustData().substring(230, 240);
        custPhoneNum1 = source.getFdCustData().substring(240, 255);
        custPhoneNum2 = source.getFdCustData().substring(255, 270);
        custSsn = (int) DataConverter.convZonedStringToLong(source
                .getFdCustData().substring(270, 279), 9);
        custGovtIssuedId = source.getFdCustData().substring(279, 299);
        custDobYyyyMmDd = source.getFdCustData().substring(299, 309);
        custEftAccountId = source.getFdCustData().substring(309, 319);
        custPriCardHolderInd = source.getFdCustData().substring(319, 320);
        custFicoCreditScore = (int) DataConverter.convZonedStringToLong(source
                .getFdCustData().substring(320, 323), 3);
        OFFILLER1 = source.getFdCustData().substring(323);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign((long) custId,
                "000000000"));
        sb.append(getCustFirstName());
        sb.append(getCustMiddleName());
        sb.append(getCustLastName());
        sb.append(getCustAddrLine1());
        sb.append(getCustAddrLine2());
        sb.append(getCustAddrLine3());
        sb.append(getCustAddrStateCd());
        sb.append(getCustAddrCountryCd());
        sb.append(getCustAddrZip());
        sb.append(getCustPhoneNum1());
        sb.append(getCustPhoneNum2());
        sb.append(PictureFormatter.intFormatWithoutSign((long) custSsn,
                "000000000"));
        sb.append(getCustGovtIssuedId());
        sb.append(getCustDobYyyyMmDd());
        sb.append(getCustEftAccountId());
        sb.append(getCustPriCardHolderInd());
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) custFicoCreditScore, "000"));
        sb.append(OFFILLER1);
        return sb.toString();
    }
}
