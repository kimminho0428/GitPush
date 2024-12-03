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
public @AllArgsConstructor @NoArgsConstructor class Cbtrn02cFdTranfileRec {
    // [T-Up#INFO][CBTRN02C.cbl, LINE #73] FD-TRANS-ID (level: 5)
    private @Getter String fdTransId = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #74] FD-TRAN-TYPE-CD (level: 5)
    private @Getter String fdTranTypeCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #75] FD-TRAN-CAT-CD (level: 5)
    private @Getter @Setter int fdTranCatCd;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #76] FD-TRAN-SOURCE (level: 5)
    private @Getter String fdTranSource = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #77] FD-TRAN-DESC (level: 5)
    private @Getter String fdTranDesc = StringUtils.repeat(' ', 100);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #78] FD-TRAN-AMT (level: 5)
    private @Getter BigDecimal fdTranAmt = BigDecimal.ZERO;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #79] FD-TRAN-MERCHANT-ID (level: 5)
    private @Getter @Setter int fdTranMerchantId;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #80] FD-TRAN-MERCHANT-NAME (level: 5)
    private @Getter String fdTranMerchantName = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #81] FD-TRAN-MERCHANT-CITY (level: 5)
    private @Getter String fdTranMerchantCity = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #82] FD-TRAN-MERCHANT-ZIP (level: 5)
    private @Getter String fdTranMerchantZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #83] FD-TRAN-CARD-NUM (level: 5)
    private @Getter String fdTranCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #84] FD-TRAN-ORIG-TS (level: 5)
    private @Getter String fdTranOrigTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #85] FD-TRAN-PROC-TS (level: 5)
    private @Getter String fdTranProcTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #86] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 20);

    public void setFdTransId(String source) {
        fdTransId = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setFdTranTypeCd(String source) {
        fdTranTypeCd = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
    }

    public void setFdTranSource(String source) {
        fdTranSource = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFdTranDesc(String source) {
        fdTranDesc = StringUtils.truncate(StringUtils.rightPad(source, 100),
                100);
    }

    public void setFdTranAmt(BigDecimal source) {
        fdTranAmt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdTranMerchantName(String source) {
        fdTranMerchantName = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setFdTranMerchantCity(String source) {
        fdTranMerchantCity = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setFdTranMerchantZip(String source) {
        fdTranMerchantZip = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setFdTranCardNum(String source) {
        fdTranCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                16);
    }

    public void setFdTranOrigTs(String source) {
        fdTranOrigTs = StringUtils.truncate(StringUtils.rightPad(source, 26),
                26);
    }

    public void setFdTranProcTs(String source) {
        fdTranProcTs = StringUtils.truncate(StringUtils.rightPad(source, 26),
                26);
    }

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils.truncate(StringUtils.rightPad(source, 20), 20);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 350), 350);
        fdTransId = source.substring(0, 16);
        fdTranTypeCd = source.substring(16, 18);
        try {
            fdTranCatCd = (int) DataConverter.convZonedStringToLong(
                    source.substring(18, 22), 4);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            fdTranCatCd = 0;
        }
        fdTranSource = source.substring(22, 32);
        fdTranDesc = source.substring(32, 132);
        try {
            fdTranAmt = DataConverter.convZonedStringToBigDecimal(
                    source.substring(132, 143), 11, 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            fdTranAmt = BigDecimal.ZERO;
        }
        try {
            fdTranMerchantId = (int) DataConverter.convZonedStringToLong(
                    source.substring(143, 152), 9);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            fdTranMerchantId = 0;
        }
        fdTranMerchantName = source.substring(152, 202);
        fdTranMerchantCity = source.substring(202, 252);
        fdTranMerchantZip = source.substring(252, 262);
        fdTranCardNum = source.substring(262, 278);
        fdTranOrigTs = source.substring(278, 304);
        fdTranProcTs = source.substring(304, 330);
        OFFILLER1 = source.substring(330, 350);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(fdTransId);
        sb.append(fdTranTypeCd);
        sb.append(DataConverter.convZonedLongToString(fdTranCatCd, 4));
        sb.append(fdTranSource);
        sb.append(fdTranDesc);
        sb.append(DataConverter.convZonedBigDecimalToString(fdTranAmt, 11, 2));
        sb.append(DataConverter.convZonedLongToString(fdTranMerchantId, 9));
        sb.append(fdTranMerchantName);
        sb.append(fdTranMerchantCity);
        sb.append(fdTranMerchantZip);
        sb.append(fdTranCardNum);
        sb.append(fdTranOrigTs);
        sb.append(fdTranProcTs);
        sb.append(OFFILLER1);
        return sb.toString();
    }

    public void set(Cbtrn02cTranRecord source) {
        fdTransId = source.getTranId();
        fdTranTypeCd = source.getTranTypeCd();
        fdTranCatCd = source.getTranCatCd();
        fdTranSource = source.getTranSource();
        fdTranDesc = source.getTranDesc();
        fdTranAmt = source.getTranAmt();
        fdTranMerchantId = source.getTranMerchantId();
        fdTranMerchantName = source.getTranMerchantName();
        fdTranMerchantCity = source.getTranMerchantCity();
        fdTranMerchantZip = source.getTranMerchantZip();
        fdTranCardNum = source.getTranCardNum();
        fdTranOrigTs = source.getTranOrigTs();
        fdTranProcTs = source.getTranProcTs();
        OFFILLER1 = source.getOFFILLER1();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdTransId());
        sb.append(getFdTranTypeCd());
        sb.append(PictureFormatter.intFormatWithoutSign((long) fdTranCatCd,
                "0000"));
        sb.append(getFdTranSource());
        sb.append(getFdTranDesc());
        sb.append(PictureFormatter.decimalFormatWithSign(fdTranAmt,
                "000000000.00"));
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) fdTranMerchantId, "000000000"));
        sb.append(getFdTranMerchantName());
        sb.append(getFdTranMerchantCity());
        sb.append(getFdTranMerchantZip());
        sb.append(getFdTranCardNum());
        sb.append(getFdTranOrigTs());
        sb.append(getFdTranProcTs());
        sb.append(OFFILLER1);
        return sb.toString();
    }
}
