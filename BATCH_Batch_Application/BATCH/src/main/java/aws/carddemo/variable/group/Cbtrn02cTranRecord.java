package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn02cTranRecord {
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #6] TRAN-ID (level: 5)
    private @Getter String tranId = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #7] TRAN-TYPE-CD (level: 5)
    private @Getter String tranTypeCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #8] TRAN-CAT-CD (level: 5)
    private @Getter @Setter int tranCatCd;
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #9] TRAN-SOURCE (level: 5)
    private @Getter String tranSource = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #10] TRAN-DESC (level: 5)
    private @Getter String tranDesc = StringUtils.repeat(' ', 100);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #11] TRAN-AMT (level: 5)
    private @Getter BigDecimal tranAmt = BigDecimal.ZERO;
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #12] TRAN-MERCHANT-ID (level: 5)
    private @Getter @Setter int tranMerchantId;
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #13] TRAN-MERCHANT-NAME (level: 5)
    private @Getter String tranMerchantName = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #14] TRAN-MERCHANT-CITY (level: 5)
    private @Getter String tranMerchantCity = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #15] TRAN-MERCHANT-ZIP (level: 5)
    private @Getter String tranMerchantZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #16] TRAN-CARD-NUM (level: 5)
    private @Getter String tranCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #17] TRAN-ORIG-TS (level: 5)
    private @Getter String tranOrigTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #18] TRAN-PROC-TS (level: 5)
    private @Getter String tranProcTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #19] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 20);

    public void setTranId(String source) {
        tranId = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setTranTypeCd(String source) {
        tranTypeCd = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
    }

    public void setTranSource(String source) {
        tranSource = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setTranDesc(String source) {
        tranDesc = StringUtils.truncate(StringUtils.rightPad(source, 100), 100);
    }

    public void setTranAmt(BigDecimal source) {
        tranAmt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setTranMerchantName(String source) {
        tranMerchantName = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setTranMerchantCity(String source) {
        tranMerchantCity = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setTranMerchantZip(String source) {
        tranMerchantZip = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setTranCardNum(String source) {
        tranCardNum = StringUtils
                .truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setTranOrigTs(String source) {
        tranOrigTs = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }

    public void setTranProcTs(String source) {
        tranProcTs = StringUtils.truncate(StringUtils.rightPad(source, 26), 26);
    }

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils.truncate(StringUtils.rightPad(source, 20), 20);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 350), 350);
        tranId = source.substring(0, 16);
        tranTypeCd = source.substring(16, 18);
        try {
            tranCatCd = (int) DataConverter.convZonedStringToLong(
                    source.substring(18, 22), 4);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            tranCatCd = 0;
        }
        tranSource = source.substring(22, 32);
        tranDesc = source.substring(32, 132);
        try {
            tranAmt = DataConverter.convZonedStringToBigDecimal(
                    source.substring(132, 143), 11, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            tranAmt = BigDecimal.ZERO;
        }
        try {
            tranMerchantId = (int) DataConverter.convZonedStringToLong(
                    source.substring(143, 152), 9);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            tranMerchantId = 0;
        }
        tranMerchantName = source.substring(152, 202);
        tranMerchantCity = source.substring(202, 252);
        tranMerchantZip = source.substring(252, 262);
        tranCardNum = source.substring(262, 278);
        tranOrigTs = source.substring(278, 304);
        tranProcTs = source.substring(304, 330);
        OFFILLER1 = source.substring(330, 350);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(tranId);
        sb.append(tranTypeCd);
        sb.append(DataConverter.convZonedLongToString(tranCatCd, 4));
        sb.append(tranSource);
        sb.append(tranDesc);
        sb.append(DataConverter.convZonedBigDecimalToString(tranAmt, 11, 2));
        sb.append(DataConverter.convZonedLongToString(tranMerchantId, 9));
        sb.append(tranMerchantName);
        sb.append(tranMerchantCity);
        sb.append(tranMerchantZip);
        sb.append(tranCardNum);
        sb.append(tranOrigTs);
        sb.append(tranProcTs);
        sb.append(OFFILLER1);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTranId());
        sb.append(getTranTypeCd());
        sb.append(PictureFormatter.intFormatWithoutSign((long) tranCatCd,
                "0000"));
        sb.append(getTranSource());
        sb.append(getTranDesc());
        sb.append(PictureFormatter.decimalFormatWithSign(tranAmt,
                "000000000.00"));
        sb.append(PictureFormatter.intFormatWithoutSign((long) tranMerchantId,
                "000000000"));
        sb.append(getTranMerchantName());
        sb.append(getTranMerchantCity());
        sb.append(getTranMerchantZip());
        sb.append(getTranCardNum());
        sb.append(getTranOrigTs());
        sb.append(getTranProcTs());
        sb.append(OFFILLER1);
        return sb.toString();
    }
}
