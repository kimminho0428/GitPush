package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:49 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Corpt00cCsutldtcParm {
    // [T-Up#INFO][CORPT00C.cbl, LINE #130] CSUTLDTC-DATE (level: 5)
    private @Getter String csutldtcDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CORPT00C.cbl, LINE #131] CSUTLDTC-DATE-FORMAT (level: 5)
    private @Getter String csutldtcDateFormat = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CORPT00C.cbl, LINE #132] CSUTLDTC-RESULT (level: 5)
    private @Getter @Setter Corpt00cCsutldtcResult csutldtcResult = new Corpt00cCsutldtcResult();

    public void setCsutldtcDate(String source) {
        csutldtcDate = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setCsutldtcDateFormat(String source) {
        csutldtcDateFormat = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCsutldtcDate());
        sb.append(getCsutldtcDateFormat());
        sb.append(getCsutldtcResult().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor class Corpt00cCsutldtcResult {
        // [T-Up#INFO][CORPT00C.cbl, LINE #133] CSUTLDTC-RESULT-SEV-CD (level: 10)
        private @Getter String csutldtcResultSevCd = StringUtils.repeat(' ', 4);
        // [T-Up#INFO][CORPT00C.cbl, LINE #134] FILLER (level: 10)
        private @Getter String OFFILLER1 = StringUtils.repeat(' ', 11);
        // [T-Up#INFO][CORPT00C.cbl, LINE #135] CSUTLDTC-RESULT-MSG-NUM (level: 10)
        private @Getter String csutldtcResultMsgNum = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][CORPT00C.cbl, LINE #136] CSUTLDTC-RESULT-MSG (level: 10)
        private @Getter String csutldtcResultMsg = StringUtils.repeat(' ', 61);

        public void setCsutldtcResultSevCd(String source) {
            csutldtcResultSevCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setOFFILLER1(String source) {
            OFFILLER1 = StringUtils.truncate(StringUtils.rightPad(source, 11),
                    11);
        }

        public void setCsutldtcResultMsgNum(String source) {
            csutldtcResultMsgNum = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setCsutldtcResultMsg(String source) {
            csutldtcResultMsg = StringUtils.truncate(
                    StringUtils.rightPad(source, 61), 61);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
            csutldtcResultSevCd = source.substring(0, 4);
            OFFILLER1 = source.substring(4, 15);
            csutldtcResultMsgNum = source.substring(15, 19);
            csutldtcResultMsg = source.substring(19, 80);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(csutldtcResultSevCd);
            sb.append(OFFILLER1);
            sb.append(csutldtcResultMsgNum);
            sb.append(csutldtcResultMsg);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCsutldtcResultSevCd());
            sb.append(OFFILLER1);
            sb.append(getCsutldtcResultMsgNum());
            sb.append(getCsutldtcResultMsg());
            return sb.toString();
        }
    }
}
