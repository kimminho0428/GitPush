package aws.carddemo.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:40 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Coadm01cWsVariables {
    // [T-Up#INFO][COADM01C.cbl, LINE #36] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "COADM01C";
    // [T-Up#INFO][COADM01C.cbl, LINE #37] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CA00";
    // [T-Up#INFO][COADM01C.cbl, LINE #38] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][COADM01C.cbl, LINE #39] WS-USRSEC-FILE (level: 5)
    private @Getter String wsUsrsecFile = "USRSEC  ";
    // [T-Up#INFO][COADM01C.cbl, LINE #40] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][COADM01C.cbl, LINE #41] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][COADM01C.cbl, LINE #42] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][COADM01C.cbl, LINE #43] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][COADM01C.cbl, LINE #44] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][COADM01C.cbl, LINE #45] WS-OPTION-X (level: 5)
    private @Getter String wsOptionX = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][COADM01C.cbl, LINE #46] WS-OPTION (level: 5)
    private @Getter @Setter int wsOption = 0;
    // [T-Up#INFO][COADM01C.cbl, LINE #47] WS-IDX (level: 5)
    private @Getter @Setter int wsIdx = 0;
    // [T-Up#INFO][COADM01C.cbl, LINE #48] WS-ADMIN-OPT-TXT (level: 5)
    private @Getter String wsAdminOptTxt = StringUtils.repeat(' ', 40);

    public void setWsPgmname(String source) {
        wsPgmname = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsTranid(String source) {
        wsTranid = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setWsMessage(String source) {
        wsMessage = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
    }

    public void setWsUsrsecFile(String source) {
        wsUsrsecFile = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsOptionX(String source) {
        wsOptionX = StringUtils.truncate(StringUtils.leftPad(source, 2), 2);
    }

    public void setWsAdminOptTxt(String source) {
        wsAdminOptTxt = StringUtils.truncate(StringUtils.rightPad(source, 40),
                40);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsUsrsecFile());
        sb.append(getWsErrFlg());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(getWsOptionX());
        sb.append(PictureFormatter.intFormatWithoutSign((long) wsOption, "00"));
        sb.append(String.valueOf(getWsIdx()));
        sb.append(getWsAdminOptTxt());
        return sb.toString();
    }
}