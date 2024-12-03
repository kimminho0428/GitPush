package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn02cTcatbalfStatus {
    // [T-Up#INFO][CBTRN02C.cbl, LINE #151] TCATBALF-STAT1 (level: 5)
    private @Getter String tcatbalfStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #152] TCATBALF-STAT2 (level: 5)
    private @Getter String tcatbalfStat2 = StringUtils.repeat(' ', 1);

    public void setTcatbalfStat1(String source) {
        tcatbalfStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setTcatbalfStat2(String source) {
        tcatbalfStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        tcatbalfStat1 = source.substring(0, 1);
        tcatbalfStat2 = source.substring(1, 2);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(tcatbalfStat1);
        sb.append(tcatbalfStat2);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTcatbalfStat1());
        sb.append(getTcatbalfStat2());
        return sb.toString();
    }
}
