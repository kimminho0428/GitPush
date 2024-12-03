package aws.carddemo.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:46 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CoactvwcCardRecord {
    // [T-Up#INFO][CVACT02Y.cpy, LINE #6] CARD-NUM (level: 5)
    private @Getter String cardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CVACT02Y.cpy, LINE #7] CARD-ACCT-ID (level: 5)
    private @Getter @Setter long cardAcctId;
    // [T-Up#INFO][CVACT02Y.cpy, LINE #8] CARD-CVV-CD (level: 5)
    private @Getter @Setter int cardCvvCd;
    // [T-Up#INFO][CVACT02Y.cpy, LINE #9] CARD-EMBOSSED-NAME (level: 5)
    private @Getter String cardEmbossedName = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CVACT02Y.cpy, LINE #10] CARD-EXPIRAION-DATE (level: 5)
    private @Getter String cardExpiraionDate = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CVACT02Y.cpy, LINE #11] CARD-ACTIVE-STATUS (level: 5)
    private @Getter String cardActiveStatus = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CVACT02Y.cpy, LINE #12] FILLER (level: 5)
    private @Getter String OFFILLER1 = StringUtils.repeat(' ', 59);

    public void setCardNum(String source) {
        cardNum = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setCardEmbossedName(String source) {
        cardEmbossedName = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setCardExpiraionDate(String source) {
        cardExpiraionDate = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setCardActiveStatus(String source) {
        cardActiveStatus = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setOFFILLER1(String source) {
        OFFILLER1 = StringUtils.truncate(StringUtils.rightPad(source, 59), 59);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCardNum());
        sb.append(PictureFormatter.intFormatWithoutSign(cardAcctId,
                "00000000000"));
        sb.append(PictureFormatter
                .intFormatWithoutSign((long) cardCvvCd, "000"));
        sb.append(getCardEmbossedName());
        sb.append(getCardExpiraionDate());
        sb.append(getCardActiveStatus());
        sb.append(OFFILLER1);
        return sb.toString();
    }
}