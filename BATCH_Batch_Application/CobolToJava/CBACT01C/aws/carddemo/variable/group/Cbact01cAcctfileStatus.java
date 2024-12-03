package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:54 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact01cAcctfileStatus {
    // [T-Up#INFO][CBACT01C.cbl, LINE #58] ACCTFILE-STAT1 (level: 5)
    private @Getter String acctfileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBACT01C.cbl, LINE #59] ACCTFILE-STAT2 (level: 5)
    private @Getter String acctfileStat2 = StringUtils.repeat(' ', 1);

    public void setAcctfileStat1(String source) {
        acctfileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setAcctfileStat2(String source) {
        acctfileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        acctfileStat1 = source.substring(0, 1);
        acctfileStat2 = source.substring(1, 2);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(acctfileStat1);
        sb.append(acctfileStat2);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAcctfileStat1());
        sb.append(getAcctfileStat2());
        return sb.toString();
    }
}
