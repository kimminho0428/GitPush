package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:46 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CoactvwcAccountRecord {
    // [T-Up#INFO][CVACT01Y.cpy, LINE #6] ACCT-ID (level: 5)
    private @Getter @Setter long acctId;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #7] ACCT-ACTIVE-STATUS (level: 5)
    private @Getter String acctActiveStatus = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #8] ACCT-CURR-BAL (level: 5)
    private @Getter BigDecimal acctCurrBal = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #9] ACCT-CREDIT-LIMIT (level: 5)
    private @Getter BigDecimal acctCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #10] ACCT-CASH-CREDIT-LIMIT (level: 5)
    private @Getter BigDecimal acctCashCreditLimit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #11] ACCT-OPEN-DATE (level: 5)
    private @Getter String acctOpenDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #12] ACCT-EXPIRAION-DATE (level: 5)
    private @Getter String acctExpiraionDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #13] ACCT-REISSUE-DATE (level: 5)
    private @Getter String acctReissueDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #14] ACCT-CURR-CYC-CREDIT (level: 5)
    private @Getter BigDecimal acctCurrCycCredit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #15] ACCT-CURR-CYC-DEBIT (level: 5)
    private @Getter BigDecimal acctCurrCycDebit = BigDecimal.ZERO;
    // [T-Up#INFO][CVACT01Y.cpy, LINE #16] ACCT-ADDR-ZIP (level: 5)
    private @Getter String acctAddrZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #17] ACCT-GROUP-ID (level: 5)
    private @Getter String acctGroupId = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT01Y.cpy, LINE #18] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 178);

    public void setAcctActiveStatus(String source) {
        acctActiveStatus = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setAcctCurrBal(BigDecimal source) {
        acctCurrBal = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCreditLimit(BigDecimal source) {
        acctCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCashCreditLimit(BigDecimal source) {
        acctCashCreditLimit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctOpenDate(String source) {
        acctOpenDate = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setAcctExpiraionDate(String source) {
        acctExpiraionDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctReissueDate(String source) {
        acctReissueDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctCurrCycCredit(BigDecimal source) {
        acctCurrCycCredit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctCurrCycDebit(BigDecimal source) {
        acctCurrCycDebit = source.setScale(2, RoundingMode.DOWN);
    }

    public void setAcctAddrZip(String source) {
        acctAddrZip = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setAcctGroupId(String source) {
        acctGroupId = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils
                .truncate(StringUtils.rightPad(source, 178), 178);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 300), 300);
        try {
            acctId = DataConverter.convZonedStringToLong(
                    source.substring(0, 11), 11);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctId = 0;
        }
        acctActiveStatus = source.substring(11, 12);
        try {
            acctCurrBal = DataConverter.convZonedStringToBigDecimal(
                    source.substring(12, 24), 12, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctCurrBal = BigDecimal.ZERO;
        }
        try {
            acctCreditLimit = DataConverter.convZonedStringToBigDecimal(
                    source.substring(24, 36), 12, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctCreditLimit = BigDecimal.ZERO;
        }
        try {
            acctCashCreditLimit = DataConverter.convZonedStringToBigDecimal(
                    source.substring(36, 48), 12, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctCashCreditLimit = BigDecimal.ZERO;
        }
        acctOpenDate = source.substring(48, 58);
        acctExpiraionDate = source.substring(58, 68);
        acctReissueDate = source.substring(68, 78);
        try {
            acctCurrCycCredit = DataConverter.convZonedStringToBigDecimal(
                    source.substring(78, 90), 12, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctCurrCycCredit = BigDecimal.ZERO;
        }
        try {
            acctCurrCycDebit = DataConverter.convZonedStringToBigDecimal(
                    source.substring(90, 102), 12, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            acctCurrCycDebit = BigDecimal.ZERO;
        }
        acctAddrZip = source.substring(102, 112);
        acctGroupId = source.substring(112, 122);
        OFFILLER1 = source.substring(122, 300);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataConverter.convZonedLongToString(acctId, 11));
        sb.append(acctActiveStatus);
        sb.append(DataConverter.convZonedBigDecimalToString(acctCurrBal, 12, 2));
        sb.append(DataConverter.convZonedBigDecimalToString(acctCreditLimit,
                12, 2));
        sb.append(DataConverter.convZonedBigDecimalToString(
                acctCashCreditLimit, 12, 2));
        sb.append(acctOpenDate);
        sb.append(acctExpiraionDate);
        sb.append(acctReissueDate);
        sb.append(DataConverter.convZonedBigDecimalToString(acctCurrCycCredit,
                12, 2));
        sb.append(DataConverter.convZonedBigDecimalToString(acctCurrCycDebit,
                12, 2));
        sb.append(acctAddrZip);
        sb.append(acctGroupId);
        sb.append(OFFILLER1);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign(acctId, "00000000000"));
        sb.append(getAcctActiveStatus());
        sb.append(PictureFormatter.decimalFormatWithSign(acctCurrBal,
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(acctCreditLimit,
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(acctCashCreditLimit,
                "0000000000.00"));
        sb.append(getAcctOpenDate());
        sb.append(getAcctExpiraionDate());
        sb.append(getAcctReissueDate());
        sb.append(PictureFormatter.decimalFormatWithSign(acctCurrCycCredit,
                "0000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(acctCurrCycDebit,
                "0000000000.00"));
        sb.append(getAcctAddrZip());
        sb.append(getAcctGroupId());
        sb.append(OFFILLER1);
        return sb.toString();
    }
}
