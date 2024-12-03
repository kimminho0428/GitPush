package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:44 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Comen01cCcdaCommonMessages {
    // [T-Up#INFO][CSMSG01Y.cpy, LINE #19] CCDA-MSG-THANK-YOU (level: 5)
    private @Getter String ccdaMsgThankYou = "Thank you for using CardDemo application...      "
            + StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CSMSG01Y.cpy, LINE #21] CCDA-MSG-INVALID-KEY (level: 5)
    private @Getter String ccdaMsgInvalidKey = "Invalid key pressed. Please see below...         "
            + StringUtils.repeat(' ', 1);

    public void setCcdaMsgThankYou(String source) {
        ccdaMsgThankYou = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setCcdaMsgInvalidKey(String source) {
        ccdaMsgInvalidKey = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcdaMsgThankYou());
        sb.append(getCcdaMsgInvalidKey());
        return sb.toString();
    }
}
