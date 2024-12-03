package aws.carddemo.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:49 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cotrn02cWsVariables {
    // [T-Up#INFO][COTRN02C.cbl, LINE #36] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "COTRN02C";
    // [T-Up#INFO][COTRN02C.cbl, LINE #37] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CT02";
    // [T-Up#INFO][COTRN02C.cbl, LINE #38] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][COTRN02C.cbl, LINE #39] WS-TRANSACT-FILE (level: 5)
    private @Getter String wsTransactFile = "TRANSACT";
    // [T-Up#INFO][COTRN02C.cbl, LINE #40] WS-ACCTDAT-FILE (level: 5)
    private @Getter String wsAcctdatFile = "ACCTDAT ";
    // [T-Up#INFO][COTRN02C.cbl, LINE #41] WS-CCXREF-FILE (level: 5)
    private @Getter String wsCcxrefFile = "CCXREF  ";
    // [T-Up#INFO][COTRN02C.cbl, LINE #42] WS-CXACAIX-FILE (level: 5)
    private @Getter String wsCxacaixFile = "CXACAIX ";
    // [T-Up#INFO][COTRN02C.cbl, LINE #44] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][COTRN02C.cbl, LINE #45] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][COTRN02C.cbl, LINE #46] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][COTRN02C.cbl, LINE #47] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][COTRN02C.cbl, LINE #48] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][COTRN02C.cbl, LINE #49] WS-USR-MODIFIED (level: 5)
    private @Getter String wsUsrModified = "N";
    // [T-Up#INFO][COTRN02C.cbl, LINE #50] USR-MODIFIED-YES (level: 88)
    public static final String USR_MODIFIED_YES = "Y";
    // [T-Up#INFO][COTRN02C.cbl, LINE #51] USR-MODIFIED-NO (level: 88)
    public static final String USR_MODIFIED_NO = "N";
    // [T-Up#INFO][COTRN02C.cbl, LINE #53] WS-TRAN-AMT (level: 5)
    private @Getter String wsTranAmt = wsTranAmtFormat.apply(BigDecimal.ZERO);
    private final static Function<BigDecimal, String> wsTranAmtFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+00000000.00;-00000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][COTRN02C.cbl, LINE #54] WS-TRAN-DATE (level: 5)
    private @Getter String wsTranDate = "00/00/00";
    // [T-Up#INFO][COTRN02C.cbl, LINE #55] WS-ACCT-ID-N (level: 5)
    private @Getter @Setter long wsAcctIdN = (long) 0;
    // [T-Up#INFO][COTRN02C.cbl, LINE #56] WS-CARD-NUM-N (level: 5)
    private @Getter @Setter long wsCardNumN = (long) 0;
    // [T-Up#INFO][COTRN02C.cbl, LINE #57] WS-TRAN-ID-N (level: 5)
    private @Getter @Setter long wsTranIdN = (long) 0;
    // [T-Up#INFO][COTRN02C.cbl, LINE #58] WS-TRAN-AMT-N (level: 5)
    private @Getter BigDecimal wsTranAmtN = BigDecimal.valueOf(0);
    // [T-Up#INFO][COTRN02C.cbl, LINE #59] WS-TRAN-AMT-E (level: 5)
    private @Getter String wsTranAmtE = wsTranAmtEFormat.apply(new BigDecimal(
            StringUtils.repeat('0', 12)));
    private final static Function<BigDecimal, String> wsTranAmtEFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+00000000.00;-00000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][COTRN02C.cbl, LINE #60] WS-DATE-FORMAT (level: 5)
    private @Getter String wsDateFormat = "YYYY-MM-DD";

    public void setWsPgmname(String source) {
        wsPgmname = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsTranid(String source) {
        wsTranid = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setWsMessage(String source) {
        wsMessage = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
    }

    public void setWsTransactFile(String source) {
        wsTransactFile = StringUtils.truncate(StringUtils.rightPad(source, 8),
                8);
    }

    public void setWsAcctdatFile(String source) {
        wsAcctdatFile = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsCcxrefFile(String source) {
        wsCcxrefFile = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsCxacaixFile(String source) {
        wsCxacaixFile = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsUsrModified(String source) {
        wsUsrModified = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsTranAmt(BigDecimal source) {
        wsTranAmt = wsTranAmtFormat.apply(source);
    }

    public void setWsTranDate(String source) {
        wsTranDate = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsTranAmtN(BigDecimal source) {
        wsTranAmtN = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsTranAmtE(BigDecimal source) {
        wsTranAmtE = wsTranAmtEFormat.apply(source);
    }

    public void setWsDateFormat(String source) {
        wsDateFormat = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsTransactFile());
        sb.append(getWsAcctdatFile());
        sb.append(getWsCcxrefFile());
        sb.append(getWsCxacaixFile());
        sb.append(getWsErrFlg());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(getWsUsrModified());
        sb.append(getWsTranAmt());
        sb.append(getWsTranDate());
        sb.append(PictureFormatter.intFormatWithoutSign(wsAcctIdN,
                "00000000000"));
        sb.append(PictureFormatter.intFormatWithoutSign(wsCardNumN,
                "0000000000000000"));
        sb.append(PictureFormatter.intFormatWithoutSign(wsTranIdN,
                "0000000000000000"));
        sb.append(PictureFormatter.decimalFormatWithSign(wsTranAmtN,
                "000000000.00"));
        sb.append(getWsTranAmtE());
        sb.append(getWsDateFormat());
        return sb.toString();
    }
}
