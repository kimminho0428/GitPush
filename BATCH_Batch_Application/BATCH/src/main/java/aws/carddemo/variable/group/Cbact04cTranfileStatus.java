package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact04cTranfileStatus {
    // [T-Up#INFO][CBACT04C.cbl, LINE #130] TRANFILE-STAT1 (level: 5)
    private @Getter String tranfileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBACT04C.cbl, LINE #131] TRANFILE-STAT2 (level: 5)
    private @Getter String tranfileStat2 = StringUtils.repeat(' ', 1);

    public void setTranfileStat1(String source) {
        tranfileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setTranfileStat2(String source) {
        tranfileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        tranfileStat1 = source.substring(0, 1);
        tranfileStat2 = source.substring(1, 2);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(tranfileStat1);
        sb.append(tranfileStat2);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTranfileStat1());
        sb.append(getTranfileStat2());
        return sb.toString();
    }
}