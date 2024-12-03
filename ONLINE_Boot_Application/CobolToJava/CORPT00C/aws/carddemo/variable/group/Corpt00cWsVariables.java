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
public @AllArgsConstructor @NoArgsConstructor class Corpt00cWsVariables {
    // [T-Up#INFO][CORPT00C.cbl, LINE #37] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "CORPT00C";
    // [T-Up#INFO][CORPT00C.cbl, LINE #38] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CR00";
    // [T-Up#INFO][CORPT00C.cbl, LINE #39] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][CORPT00C.cbl, LINE #40] WS-TRANSACT-FILE (level: 5)
    private @Getter String wsTransactFile = "TRANSACT";
    // [T-Up#INFO][CORPT00C.cbl, LINE #41] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #42] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][CORPT00C.cbl, LINE #43] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #44] WS-TRANSACT-EOF (level: 5)
    private @Getter String wsTransactEof = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #45] TRANSACT-EOF (level: 88)
    public static final String TRANSACT_EOF = "Y";
    // [T-Up#INFO][CORPT00C.cbl, LINE #46] TRANSACT-NOT-EOF (level: 88)
    public static final String TRANSACT_NOT_EOF = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #47] WS-SEND-ERASE-FLG (level: 5)
    private @Getter String wsSendEraseFlg = "Y";
    // [T-Up#INFO][CORPT00C.cbl, LINE #48] SEND-ERASE-YES (level: 88)
    public static final String SEND_ERASE_YES = "Y";
    // [T-Up#INFO][CORPT00C.cbl, LINE #49] SEND-ERASE-NO (level: 88)
    public static final String SEND_ERASE_NO = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #50] WS-END-LOOP (level: 5)
    private @Getter String wsEndLoop = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #51] END-LOOP-YES (level: 88)
    public static final String END_LOOP_YES = "Y";
    // [T-Up#INFO][CORPT00C.cbl, LINE #52] END-LOOP-NO (level: 88)
    public static final String END_LOOP_NO = "N";
    // [T-Up#INFO][CORPT00C.cbl, LINE #54] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #55] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #56] WS-REC-COUNT (level: 5)
    private @Getter @Setter int wsRecCount = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #57] WS-IDX (level: 5)
    private @Getter @Setter int wsIdx = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #58] WS-REPORT-NAME (level: 5)
    private @Getter String wsReportName = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CORPT00C.cbl, LINE #60] WS-START-DATE (level: 5)
    private @Getter @Setter Corpt00cWsStartDate wsStartDate = new Corpt00cWsStartDate();
    // [T-Up#INFO][CORPT00C.cbl, LINE #66] WS-END-DATE (level: 5)
    private @Getter @Setter Corpt00cWsEndDate wsEndDate = new Corpt00cWsEndDate();
    // [T-Up#INFO][CORPT00C.cbl, LINE #72] WS-DATE-FORMAT (level: 5)
    private @Getter String wsDateFormat = "YYYY-MM-DD";
    // [T-Up#INFO][CORPT00C.cbl, LINE #74] WS-NUM-99 (level: 5)
    private @Getter @Setter int wsNum99 = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #75] WS-NUM-9999 (level: 5)
    private @Getter @Setter int wsNum9999 = 0;
    // [T-Up#INFO][CORPT00C.cbl, LINE #77] WS-TRAN-AMT (level: 5)
    private @Getter String wsTranAmt = wsTranAmtFormat.apply(BigDecimal.ZERO);
    private final static Function<BigDecimal, String> wsTranAmtFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+00000000.00;-00000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][CORPT00C.cbl, LINE #78] WS-TRAN-DATE (level: 5)
    private @Getter String wsTranDate = "00/00/00";
    // [T-Up#INFO][CORPT00C.cbl, LINE #79] JCL-RECORD (level: 5)
    private @Getter String jclRecord = " " + StringUtils.repeat(' ', 79);

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

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsTransactEof(String source) {
        wsTransactEof = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsSendEraseFlg(String source) {
        wsSendEraseFlg = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsEndLoop(String source) {
        wsEndLoop = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsReportName(String source) {
        wsReportName = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setWsDateFormat(String source) {
        wsDateFormat = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setWsTranAmt(BigDecimal source) {
        wsTranAmt = wsTranAmtFormat.apply(source);
    }

    public void setWsTranDate(String source) {
        wsTranDate = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setJclRecord(String source) {
        jclRecord = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsTransactFile());
        sb.append(getWsErrFlg());
        sb.append(getWsTransactEof());
        sb.append(getWsSendEraseFlg());
        sb.append(getWsEndLoop());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(String.valueOf(getWsRecCount()));
        sb.append(String.valueOf(getWsIdx()));
        sb.append(getWsReportName());
        sb.append(getWsStartDate().toString());
        sb.append(getWsEndDate().toString());
        sb.append(getWsDateFormat());
        sb.append(PictureFormatter.intFormatWithoutSign((long) wsNum99, "00"));
        sb.append(PictureFormatter.intFormatWithoutSign((long) wsNum9999,
                "0000"));
        sb.append(getWsTranAmt());
        sb.append(getWsTranDate());
        sb.append(getJclRecord());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor class Corpt00cWsStartDate {
        // [T-Up#INFO][CORPT00C.cbl, LINE #61] WS-START-DATE-YYYY (level: 10)
        private @Getter String wsStartDateYyyy = StringUtils.repeat(' ', 4);
        // [T-Up#INFO][CORPT00C.cbl, LINE #62] FILLER (level: 10)
        private @Getter String OFFILLER1 = "-";
        // [T-Up#INFO][CORPT00C.cbl, LINE #63] WS-START-DATE-MM (level: 10)
        private @Getter String wsStartDateMm = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CORPT00C.cbl, LINE #64] FILLER (level: 10)
        private @Getter String OFFILLER2 = "-";
        // [T-Up#INFO][CORPT00C.cbl, LINE #65] WS-START-DATE-DD (level: 10)
        private @Getter String wsStartDateDd = StringUtils.repeat(' ', 2);

        public void setWsStartDateYyyy(String source) {
            wsStartDateYyyy = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setOFFILLER1(String source) {
            OFFILLER1 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setWsStartDateMm(String source) {
            wsStartDateMm = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }

        public void setOFFILLER2(String source) {
            OFFILLER2 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setWsStartDateDd(String source) {
            wsStartDateDd = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
            wsStartDateYyyy = source.substring(0, 4);
            OFFILLER1 = source.substring(4, 5);
            wsStartDateMm = source.substring(5, 7);
            OFFILLER2 = source.substring(7, 8);
            wsStartDateDd = source.substring(8, 10);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsStartDateYyyy);
            sb.append(OFFILLER1);
            sb.append(wsStartDateMm);
            sb.append(OFFILLER2);
            sb.append(wsStartDateDd);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsStartDateYyyy());
            sb.append(OFFILLER1);
            sb.append(getWsStartDateMm());
            sb.append(OFFILLER2);
            sb.append(getWsStartDateDd());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor class Corpt00cWsEndDate {
        // [T-Up#INFO][CORPT00C.cbl, LINE #67] WS-END-DATE-YYYY (level: 10)
        private @Getter String wsEndDateYyyy = StringUtils.repeat(' ', 4);
        // [T-Up#INFO][CORPT00C.cbl, LINE #68] FILLER (level: 10)
        private @Getter String OFFILLER3 = "-";
        // [T-Up#INFO][CORPT00C.cbl, LINE #69] WS-END-DATE-MM (level: 10)
        private @Getter String wsEndDateMm = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CORPT00C.cbl, LINE #70] FILLER (level: 10)
        private @Getter String OFFILLER4 = "-";
        // [T-Up#INFO][CORPT00C.cbl, LINE #71] WS-END-DATE-DD (level: 10)
        private @Getter String wsEndDateDd = StringUtils.repeat(' ', 2);

        public void setWsEndDateYyyy(String source) {
            wsEndDateYyyy = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setOFFILLER3(String source) {
            OFFILLER3 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setWsEndDateMm(String source) {
            wsEndDateMm = StringUtils.truncate(StringUtils.rightPad(source, 2),
                    2);
        }

        public void setOFFILLER4(String source) {
            OFFILLER4 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setWsEndDateDd(String source) {
            wsEndDateDd = StringUtils.truncate(StringUtils.rightPad(source, 2),
                    2);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
            wsEndDateYyyy = source.substring(0, 4);
            OFFILLER3 = source.substring(4, 5);
            wsEndDateMm = source.substring(5, 7);
            OFFILLER4 = source.substring(7, 8);
            wsEndDateDd = source.substring(8, 10);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsEndDateYyyy);
            sb.append(OFFILLER3);
            sb.append(wsEndDateMm);
            sb.append(OFFILLER4);
            sb.append(wsEndDateDd);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsEndDateYyyy());
            sb.append(OFFILLER3);
            sb.append(getWsEndDateMm());
            sb.append(OFFILLER4);
            sb.append(getWsEndDateDd());
            return sb.toString();
        }
    }
}
