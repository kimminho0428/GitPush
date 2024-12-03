package aws.carddemo.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:43 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cotrn01cDfhaid {
    // [T-Up#INFO][DFHAID.cpy, LINE #3] DFHNULL (level: 2)
    private @Getter String dfhnull = " ";
    // [T-Up#INFO][DFHAID.cpy, LINE #4] DFHENTER (level: 2)
    private @Getter String dfhenter = "'";
    // [T-Up#INFO][DFHAID.cpy, LINE #5] DFHCLEAR (level: 2)
    private @Getter String dfhclear = "_";
    // [T-Up#INFO][DFHAID.cpy, LINE #6] DFHCLRP (level: 2)
    private @Getter String dfhclrp = "|";
    // [T-Up#INFO][DFHAID.cpy, LINE #7] DFHPEN (level: 2)
    private @Getter String dfhpen = "=";
    // [T-Up#INFO][DFHAID.cpy, LINE #8] DFHOPID (level: 2)
    private @Getter String dfhopid = "W";
    // [T-Up#INFO][DFHAID.cpy, LINE #9] DFHMSRE (level: 2)
    private @Getter String dfhmsre = "X";
    // [T-Up#INFO][DFHAID.cpy, LINE #10] DFHSTRF (level: 2)
    private @Getter String dfhstrf = "h";
    // [T-Up#INFO][DFHAID.cpy, LINE #11] DFHTRIG (level: 2)
    private @Getter String dfhtrig = "\"";
    // [T-Up#INFO][DFHAID.cpy, LINE #12] DFHPA1 (level: 2)
    private @Getter String dfhpa1 = "%";
    // [T-Up#INFO][DFHAID.cpy, LINE #13] DFHPA2 (level: 2)
    private @Getter String dfhpa2 = ">";
    // [T-Up#INFO][DFHAID.cpy, LINE #14] DFHPA3 (level: 2)
    private @Getter String dfhpa3 = ",";
    // [T-Up#INFO][DFHAID.cpy, LINE #15] DFHPF1 (level: 2)
    private @Getter String dfhpf1 = "1";
    // [T-Up#INFO][DFHAID.cpy, LINE #16] DFHPF2 (level: 2)
    private @Getter String dfhpf2 = "2";
    // [T-Up#INFO][DFHAID.cpy, LINE #17] DFHPF3 (level: 2)
    private @Getter String dfhpf3 = "3";
    // [T-Up#INFO][DFHAID.cpy, LINE #18] DFHPF4 (level: 2)
    private @Getter String dfhpf4 = "4";
    // [T-Up#INFO][DFHAID.cpy, LINE #19] DFHPF5 (level: 2)
    private @Getter String dfhpf5 = "5";
    // [T-Up#INFO][DFHAID.cpy, LINE #20] DFHPF6 (level: 2)
    private @Getter String dfhpf6 = "6";
    // [T-Up#INFO][DFHAID.cpy, LINE #21] DFHPF7 (level: 2)
    private @Getter String dfhpf7 = "7";
    // [T-Up#INFO][DFHAID.cpy, LINE #22] DFHPF8 (level: 2)
    private @Getter String dfhpf8 = "8";
    // [T-Up#INFO][DFHAID.cpy, LINE #23] DFHPF9 (level: 2)
    private @Getter String dfhpf9 = "9";
    // [T-Up#INFO][DFHAID.cpy, LINE #24] DFHPF10 (level: 2)
    private @Getter String dfhpf10 = ":";
    // [T-Up#INFO][DFHAID.cpy, LINE #25] DFHPF11 (level: 2)
    private @Getter String dfhpf11 = "#";
    // [T-Up#INFO][DFHAID.cpy, LINE #26] DFHPF12 (level: 2)
    private @Getter String dfhpf12 = "@";
    // [T-Up#INFO][DFHAID.cpy, LINE #27] DFHPF13 (level: 2)
    private @Getter String dfhpf13 = "A";
    // [T-Up#INFO][DFHAID.cpy, LINE #28] DFHPF14 (level: 2)
    private @Getter String dfhpf14 = "B";
    // [T-Up#INFO][DFHAID.cpy, LINE #29] DFHPF15 (level: 2)
    private @Getter String dfhpf15 = "C";
    // [T-Up#INFO][DFHAID.cpy, LINE #30] DFHPF16 (level: 2)
    private @Getter String dfhpf16 = "D";
    // [T-Up#INFO][DFHAID.cpy, LINE #31] DFHPF17 (level: 2)
    private @Getter String dfhpf17 = "E";
    // [T-Up#INFO][DFHAID.cpy, LINE #32] DFHPF18 (level: 2)
    private @Getter String dfhpf18 = "F";
    // [T-Up#INFO][DFHAID.cpy, LINE #33] DFHPF19 (level: 2)
    private @Getter String dfhpf19 = "G";
    // [T-Up#INFO][DFHAID.cpy, LINE #34] DFHPF20 (level: 2)
    private @Getter String dfhpf20 = "H";
    // [T-Up#INFO][DFHAID.cpy, LINE #35] DFHPF21 (level: 2)
    private @Getter String dfhpf21 = "I";
    // [T-Up#INFO][DFHAID.cpy, LINE #36] DFHPF22 (level: 2)
    private @Getter String dfhpf22 = "[";
    // [T-Up#INFO][DFHAID.cpy, LINE #37] DFHPF23 (level: 2)
    private @Getter String dfhpf23 = ".";
    // [T-Up#INFO][DFHAID.cpy, LINE #38] DFHPF24 (level: 2)
    private @Getter String dfhpf24 = "<";

    public void setDfhnull(String source) {
        dfhnull = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhenter(String source) {
        dfhenter = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhclear(String source) {
        dfhclear = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhclrp(String source) {
        dfhclrp = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpen(String source) {
        dfhpen = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhopid(String source) {
        dfhopid = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhmsre(String source) {
        dfhmsre = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhstrf(String source) {
        dfhstrf = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhtrig(String source) {
        dfhtrig = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpa1(String source) {
        dfhpa1 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpa2(String source) {
        dfhpa2 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpa3(String source) {
        dfhpa3 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf1(String source) {
        dfhpf1 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf2(String source) {
        dfhpf2 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf3(String source) {
        dfhpf3 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf4(String source) {
        dfhpf4 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf5(String source) {
        dfhpf5 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf6(String source) {
        dfhpf6 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf7(String source) {
        dfhpf7 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf8(String source) {
        dfhpf8 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf9(String source) {
        dfhpf9 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf10(String source) {
        dfhpf10 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf11(String source) {
        dfhpf11 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf12(String source) {
        dfhpf12 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf13(String source) {
        dfhpf13 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf14(String source) {
        dfhpf14 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf15(String source) {
        dfhpf15 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf16(String source) {
        dfhpf16 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf17(String source) {
        dfhpf17 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf18(String source) {
        dfhpf18 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf19(String source) {
        dfhpf19 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf20(String source) {
        dfhpf20 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf21(String source) {
        dfhpf21 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf22(String source) {
        dfhpf22 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf23(String source) {
        dfhpf23 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDfhpf24(String source) {
        dfhpf24 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDfhnull());
        sb.append(getDfhenter());
        sb.append(getDfhclear());
        sb.append(getDfhclrp());
        sb.append(getDfhpen());
        sb.append(getDfhopid());
        sb.append(getDfhmsre());
        sb.append(getDfhstrf());
        sb.append(getDfhtrig());
        sb.append(getDfhpa1());
        sb.append(getDfhpa2());
        sb.append(getDfhpa3());
        sb.append(getDfhpf1());
        sb.append(getDfhpf2());
        sb.append(getDfhpf3());
        sb.append(getDfhpf4());
        sb.append(getDfhpf5());
        sb.append(getDfhpf6());
        sb.append(getDfhpf7());
        sb.append(getDfhpf8());
        sb.append(getDfhpf9());
        sb.append(getDfhpf10());
        sb.append(getDfhpf11());
        sb.append(getDfhpf12());
        sb.append(getDfhpf13());
        sb.append(getDfhpf14());
        sb.append(getDfhpf15());
        sb.append(getDfhpf16());
        sb.append(getDfhpf17());
        sb.append(getDfhpf18());
        sb.append(getDfhpf19());
        sb.append(getDfhpf20());
        sb.append(getDfhpf21());
        sb.append(getDfhpf22());
        sb.append(getDfhpf23());
        sb.append(getDfhpf24());
        return sb.toString();
    }
}
