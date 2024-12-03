package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbact02cCardfileStatus {
    // [T-Up#INFO][CBACT02C.cbl, LINE #47] CARDFILE-STAT1 (level: 5)
    private @Getter String cardfileStat1 = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CBACT02C.cbl, LINE #48] CARDFILE-STAT2 (level: 5)
    private @Getter String cardfileStat2 = StringUtils.repeat(' ', 1);

    public void setCardfileStat1(String source) {
        cardfileStat1 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setCardfileStat2(String source) {
        cardfileStat2 = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
        cardfileStat1 = source.substring(0, 1);
        cardfileStat2 = source.substring(1, 2);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(cardfileStat1);
        sb.append(cardfileStat2);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCardfileStat1());
        sb.append(getCardfileStat2());
        return sb.toString();
    }
}
