package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:51 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cousr02cDfhcommarea {
    // [T-Up#INFO][COUSR02C.cbl, LINE #75] LK-COMMAREA (level: 5)
    private @Getter String lkCommarea = StringUtils.repeat(' ', 32767);

    public void setLkCommarea(String source) {
        lkCommarea = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
        lkCommarea = source.substring(0, 32767);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(lkCommarea);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getLkCommarea());
        return sb.toString();
    }
}
