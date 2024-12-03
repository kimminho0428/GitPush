package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn02cFdXreffileRec {
    // [T-Up#INFO][CBTRN02C.cbl, LINE #90] FD-XREF-CARD-NUM (level: 5)
    private @Getter String fdXrefCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN02C.cbl, LINE #91] FD-XREF-DATA (level: 5)
    private @Getter String fdXrefData = StringUtils.repeat(' ', 34);

    public void setFdXrefCardNum(String source) {
        fdXrefCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                16);
    }

    public void setFdXrefData(String source) {
        fdXrefData = StringUtils.truncate(StringUtils.rightPad(source, 34), 34);
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 50), 50);
        fdXrefCardNum = source.substring(0, 16);
        fdXrefData = source.substring(16, 50);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdXrefCardNum());
        sb.append(getFdXrefData());
        return sb.toString();
    }
}