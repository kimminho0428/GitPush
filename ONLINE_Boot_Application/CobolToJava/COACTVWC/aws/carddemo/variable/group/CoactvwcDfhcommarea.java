package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:46 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CoactvwcDfhcommarea {
    // [T-Up#INFO][COACTVWC.cbl, LINE #257] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 32767);

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
        OFFILLER1 = source.substring(0, 32767);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(OFFILLER1);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OFFILLER1);
        return sb.toString();
    }
}
