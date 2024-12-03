package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:40 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Coadm01cCcdaScreenTitle {
    // [T-Up#INFO][COTTL01Y.cpy, LINE #19] CCDA-TITLE01 (level: 5)
    private @Getter String ccdaTitle01 = "      AWS Mainframe Modernization       ";
    // [T-Up#INFO][COTTL01Y.cpy, LINE #21] CCDA-TITLE02 (level: 5)
    private @Getter String ccdaTitle02 = "              CardDemo                  ";
    // *     '  Credit Card Demo Application (CCDA)   '.                 
    // [T-Up#INFO][COTTL01Y.cpy, LINE #24] CCDA-THANK-YOU (level: 5)
    private @Getter String ccdaThankYou = "Thank you for using CCDA application... ";

    public void setCcdaTitle01(String source) {
        ccdaTitle01 = StringUtils
                .truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setCcdaTitle02(String source) {
        ccdaTitle02 = StringUtils
                .truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setCcdaThankYou(String source) {
        ccdaThankYou = StringUtils.truncate(StringUtils.rightPad(source, 40),
                40);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcdaTitle01());
        sb.append(getCcdaTitle02());
        sb.append(getCcdaThankYou());
        return sb.toString();
    }
}
