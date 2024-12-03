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
public @AllArgsConstructor @NoArgsConstructor class Cbact04cFdDiscgrpRec {
    // [T-Up#INFO][CBACT04C.cbl, LINE #78] FD-DISCGRP-KEY (level: 5)
    private @Getter @Setter Cbact04cFdDiscgrpKey fdDiscgrpKey = new Cbact04cFdDiscgrpKey();
    // [T-Up#INFO][CBACT04C.cbl, LINE #82] FD-DISCGRP-DATA (level: 5)
    private @Getter String fdDiscgrpData = StringUtils.repeat(' ', 34);

    public void setFdDiscgrpData(String source) {
        fdDiscgrpData = StringUtils.truncate(StringUtils.rightPad(source, 34),
                34);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 50), 50);
        fdDiscgrpKey.set(source.substring(0, 16));
        fdDiscgrpData = source.substring(16, 50);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdDiscgrpKey().toString());
        sb.append(getFdDiscgrpData());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor class Cbact04cFdDiscgrpKey {
        // [T-Up#INFO][CBACT04C.cbl, LINE #79] FD-DIS-ACCT-GROUP-ID (level: 10)
        private @Getter String fdDisAcctGroupId = StringUtils.repeat(' ', 10);
        // [T-Up#INFO][CBACT04C.cbl, LINE #80] FD-DIS-TRAN-TYPE-CD (level: 10)
        private @Getter String fdDisTranTypeCd = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBACT04C.cbl, LINE #81] FD-DIS-TRAN-CAT-CD (level: 10)
        private @Getter @Setter int fdDisTranCatCd;

        public void setFdDisAcctGroupId(String source) {
            fdDisAcctGroupId = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public void setFdDisTranTypeCd(String source) {
            fdDisTranTypeCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            fdDisAcctGroupId = source.substring(0, 10);
            fdDisTranTypeCd = source.substring(10, 12);
            try {
                fdDisTranCatCd = (int) DataConverter.convZonedStringToLong(
                        source.substring(12, 16), 4);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                fdDisTranCatCd = 0;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getFdDisAcctGroupId());
            sb.append(getFdDisTranTypeCd());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) fdDisTranCatCd, "0000"));
            return sb.toString();
        }
    }
}