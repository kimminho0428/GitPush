package aws.carddemo.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact04cWsMiscVars {
    // [T-Up#INFO][CBACT04C.cbl, LINE #178] WS-LAST-ACCT-NUM (level: 5)
    private @Getter String wsLastAcctNum = StringUtils.repeat(' ', 11);
    // [T-Up#INFO][CBACT04C.cbl, LINE #179] WS-MONTHLY-INT (level: 5)
    private @Getter BigDecimal wsMonthlyInt = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl, LINE #180] WS-TOTAL-INT (level: 5)
    private @Getter BigDecimal wsTotalInt = BigDecimal.ZERO;
    // [T-Up#INFO][CBACT04C.cbl, LINE #181] WS-FIRST-TIME (level: 5)
    private @Getter String wsFirstTime = "Y";

    public void setWsLastAcctNum(String source) {
        wsLastAcctNum = StringUtils.truncate(StringUtils.rightPad(source, 11),
                11);
    }

    public void setWsMonthlyInt(BigDecimal source) {
        wsMonthlyInt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsTotalInt(BigDecimal source) {
        wsTotalInt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setWsFirstTime(String source) {
        wsFirstTime = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsLastAcctNum());
        sb.append(PictureFormatter.decimalFormatWithSign(wsMonthlyInt,
                "000000000.00"));
        sb.append(PictureFormatter.decimalFormatWithSign(wsTotalInt,
                "000000000.00"));
        sb.append(getWsFirstTime());
        return sb.toString();
    }
}