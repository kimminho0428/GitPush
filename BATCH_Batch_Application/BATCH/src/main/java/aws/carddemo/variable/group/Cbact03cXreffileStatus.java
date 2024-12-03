package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact03cXreffileStatus {
    // [T-Up#INFO][CBACT03C.cbl, LINE #47] XREFFILE-STAT1 (level: 5)
    private @Getter String xreffileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBACT03C.cbl, LINE #48] XREFFILE-STAT2 (level: 5)
    private @Getter String xreffileStat2 = StringUtils.repeat(' ', 1);

    public void setXreffileStat1(String source) {
        xreffileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setXreffileStat2(String source) {
        xreffileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        xreffileStat1 = source.substring(0, 1);
        xreffileStat2 = source.substring(1, 2);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(xreffileStat1);
        sb.append(xreffileStat2);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getXreffileStat1());
        sb.append(getXreffileStat2());
        return sb.toString();
    }
}
