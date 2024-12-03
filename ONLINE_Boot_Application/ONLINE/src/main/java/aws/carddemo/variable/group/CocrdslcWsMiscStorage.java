package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:42 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdslcWsMiscStorage {
    // ******************************************************************
    // * General CICS related                                            
    // ******************************************************************
    // [T-Up#INFO][COCRDSLC.cbl, LINE #40] WS-CICS-PROCESSNG-VARS (level: 5)
    private @Getter @Setter @Builder.Default CocrdslcWsCicsProcessngVars wsCicsProcessngVars = new CocrdslcWsCicsProcessngVars();
    // ******************************************************************
    // *      Input edits                                                
    // ******************************************************************
    // [T-Up#INFO][COCRDSLC.cbl, LINE #51] WS-INPUT-FLAG (level: 5)
    private @Getter @Builder.Default String wsInputFlag = StringUtils.repeat(
            ' ', 1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #52] INPUT-OK (level: 88)
    public static final String INPUT_OK = "0";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #53] INPUT-ERROR (level: 88)
    public static final String INPUT_ERROR = "1";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #54] INPUT-PENDING (level: 88)
    public static final String INPUT_PENDING = StringUtils.repeat((char) 0x00,
            1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #55] WS-EDIT-ACCT-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditAcctFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #56] FLG-ACCTFILTER-NOT-OK (level: 88)
    public static final String FLG_ACCTFILTER_NOT_OK = "0";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #57] FLG-ACCTFILTER-ISVALID (level: 88)
    public static final String FLG_ACCTFILTER_ISVALID = "1";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #58] FLG-ACCTFILTER-BLANK (level: 88)
    public static final String FLG_ACCTFILTER_BLANK = " ";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #59] WS-EDIT-CARD-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #60] FLG-CARDFILTER-NOT-OK (level: 88)
    public static final String FLG_CARDFILTER_NOT_OK = "0";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #61] FLG-CARDFILTER-ISVALID (level: 88)
    public static final String FLG_CARDFILTER_ISVALID = "1";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #62] FLG-CARDFILTER-BLANK (level: 88)
    public static final String FLG_CARDFILTER_BLANK = " ";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #63] WS-RETURN-FLAG (level: 5)
    private @Getter @Builder.Default String wsReturnFlag = StringUtils.repeat(
            ' ', 1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #64] WS-RETURN-FLAG-OFF (level: 88)
    public static final String WS_RETURN_FLAG_OFF = StringUtils.repeat(
            (char) 0x00, 1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #65] WS-RETURN-FLAG-ON (level: 88)
    public static final String WS_RETURN_FLAG_ON = "1";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #66] WS-PFK-FLAG (level: 5)
    private @Getter @Builder.Default String wsPfkFlag = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #67] PFK-VALID (level: 88)
    public static final String PFK_VALID = "0";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #68] PFK-INVALID (level: 88)
    public static final String PFK_INVALID = "1";
    // ******************************************************************
    // * Output edits                                                    
    // ******************************************************************
    // [T-Up#INFO][COCRDSLC.cbl, LINE #72] CICS-OUTPUT-EDIT-VARS (level: 5)
    private @Getter @Setter @Builder.Default CocrdslcCicsOutputEditVars cicsOutputEditVars = new CocrdslcCicsOutputEditVars();
    // ******************************************************************
    // *      File and data Handling                                     
    // ******************************************************************
    // [T-Up#INFO][COCRDSLC.cbl, LINE #97] WS-CARD-RID (level: 5)
    private @Getter @Setter @Builder.Default CocrdslcWsCardRid wsCardRid = new CocrdslcWsCardRid();
    // [T-Up#INFO][COCRDSLC.cbl, LINE #102] WS-FILE-ERROR-MESSAGE (level: 5)
    private @Getter @Setter @Builder.Default CocrdslcWsFileErrorMessage wsFileErrorMessage = new CocrdslcWsFileErrorMessage();
    // ******************************************************************
    // *      Output Message Construction                                
    // ******************************************************************
    // [T-Up#INFO][COCRDSLC.cbl, LINE #125] WS-LONG-MSG (level: 5)
    private @Getter @Builder.Default String wsLongMsg = StringUtils.repeat(' ',
            500);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #126] WS-INFO-MSG (level: 5)
    private @Getter @Builder.Default String wsInfoMsg = StringUtils.repeat(' ',
            40);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #127] WS-NO-INFO-MESSAGE (level: 88)
    public static final String WS_NO_INFO_MESSAGE_1 = StringUtils.repeat(' ',
            40);
    public static final String WS_NO_INFO_MESSAGE_2 = StringUtils.repeat(
            (char) 0x00, 40);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #129] FOUND-CARDS-FOR-ACCOUNT (level: 88)
    public static final String FOUND_CARDS_FOR_ACCOUNT = "   Displaying requested details";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #131] WS-PROMPT-FOR-INPUT (level: 88)
    public static final String WS_PROMPT_FOR_INPUT = "Please enter Account and Card Number";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #134] WS-RETURN-MSG (level: 5)
    private @Getter @Builder.Default String wsReturnMsg = StringUtils.repeat(
            ' ', 75);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #135] WS-RETURN-MSG-OFF (level: 88)
    public static final String WS_RETURN_MSG_OFF = StringUtils.repeat(' ', 75);
    // [T-Up#INFO][COCRDSLC.cbl, LINE #136] WS-EXIT-MESSAGE (level: 88)
    public static final String WS_EXIT_MESSAGE = "PF03 pressed.Exiting              ";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #138] WS-PROMPT-FOR-ACCT (level: 88)
    public static final String WS_PROMPT_FOR_ACCT = "Account number not provided";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #140] WS-PROMPT-FOR-CARD (level: 88)
    public static final String WS_PROMPT_FOR_CARD = "Card number not provided";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #142] NO-SEARCH-CRITERIA-RECEIVED (level: 88)
    public static final String NO_SEARCH_CRITERIA_RECEIVED = "No input received";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #144] SEARCHED-ACCT-ZEROES (level: 88)
    public static final String SEARCHED_ACCT_ZEROES = "Account number must be a non zero 11 digit number";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #146] SEARCHED-ACCT-NOT-NUMERIC (level: 88)
    public static final String SEARCHED_ACCT_NOT_NUMERIC = "Account number must be a non zero 11 digit number";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #148] SEARCHED-CARD-NOT-NUMERIC (level: 88)
    public static final String SEARCHED_CARD_NOT_NUMERIC = "Card number if supplied must be a 16 digit number";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #151] DID-NOT-FIND-ACCT-IN-CARDXREF (level: 88)
    public static final String DID_NOT_FIND_ACCT_IN_CARDXREF = "Did not find this account in cards database";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #153] DID-NOT-FIND-ACCTCARD-COMBO (level: 88)
    public static final String DID_NOT_FIND_ACCTCARD_COMBO = "Did not find cards for this search condition";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #155] XREF-READ-ERROR (level: 88)
    public static final String XREF_READ_ERROR = "Error reading Card Data File";
    // [T-Up#INFO][COCRDSLC.cbl, LINE #157] CODING-TO-BE-DONE (level: 88)
    public static final String CODING_TO_BE_DONE = "Looks Good.... so far";

    public void setWsInputFlag(String source) {
        wsInputFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsEditAcctFlag(String source) {
        wsEditAcctFlag = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsEditCardFlag(String source) {
        wsEditCardFlag = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsReturnFlag(String source) {
        wsReturnFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsPfkFlag(String source) {
        wsPfkFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsLongMsg(String source) {
        wsLongMsg = StringUtils
                .truncate(StringUtils.rightPad(source, 500), 500);
    }

    public void setWsInfoMsg(String source) {
        wsInfoMsg = StringUtils.truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setWsReturnMsg(String source) {
        wsReturnMsg = StringUtils
                .truncate(StringUtils.rightPad(source, 75), 75);
    }

    public static CocrdslcWsMiscStorage createDefaultValueInstance() {
        return new CocrdslcWsMiscStorage.builder()
                .wsCicsProcessngVars(
                        CocrdslcWsCicsProcessngVars
                                .createDefaultValueInstance())
                .cicsOutputEditVars(
                        CocrdslcCicsOutputEditVars.createDefaultValueInstance())
                .wsCardRid(CocrdslcWsCardRid.createDefaultValueInstance())
                .wsFileErrorMessage(
                        CocrdslcWsFileErrorMessage.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 830), 830);
        wsCicsProcessngVars.set(source.substring(0, 12));
        wsInputFlag = source.substring(12, 13);
        wsEditAcctFlag = source.substring(13, 14);
        wsEditCardFlag = source.substring(14, 15);
        wsReturnFlag = source.substring(15, 16);
        wsPfkFlag = source.substring(16, 17);
        cicsOutputEditVars.set(source.substring(17, 108));
        wsCardRid.set(source.substring(108, 135));
        wsFileErrorMessage.set(source.substring(135, 215));
        wsLongMsg = source.substring(215, 715);
        wsInfoMsg = source.substring(715, 755);
        wsReturnMsg = source.substring(755, 830);
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(wsCicsProcessngVars.get());
        sb.append(wsInputFlag);
        sb.append(wsEditAcctFlag);
        sb.append(wsEditCardFlag);
        sb.append(wsReturnFlag);
        sb.append(wsPfkFlag);
        sb.append(cicsOutputEditVars.get());
        sb.append(wsCardRid.get());
        sb.append(wsFileErrorMessage.get());
        sb.append(wsLongMsg);
        sb.append(wsInfoMsg);
        sb.append(wsReturnMsg);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsCicsProcessngVars().toString());
        sb.append(getWsInputFlag());
        sb.append(getWsEditAcctFlag());
        sb.append(getWsEditCardFlag());
        sb.append(getWsReturnFlag());
        sb.append(getWsPfkFlag());
        sb.append(getCicsOutputEditVars().toString());
        sb.append(getWsCardRid().toString());
        sb.append(getWsFileErrorMessage().toString());
        sb.append(getWsLongMsg());
        sb.append(getWsInfoMsg());
        sb.append(getWsReturnMsg());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdslcWsCicsProcessngVars {
        // [T-Up#INFO][COCRDSLC.cbl, LINE #41] WS-RESP-CD (level: 7)
        private @Getter @Setter @Builder.Default int wsRespCd = 0;
        // [T-Up#INFO][COCRDSLC.cbl, LINE #43] WS-REAS-CD (level: 7)
        private @Getter @Setter @Builder.Default int wsReasCd = 0;
        // [T-Up#INFO][COCRDSLC.cbl, LINE #45] WS-TRANID (level: 7)
        private @Getter @Builder.Default String wsTranid = StringUtils.repeat(
                ' ', 4);

        public void setWsTranid(String source) {
            wsTranid = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
        }

        public static CocrdslcWsCicsProcessngVars createDefaultValueInstance() {
            return new CocrdslcWsCicsProcessngVars.builder().wsRespCd(0)
                    .wsReasCd(0).wsTranid(StringUtils.repeat(' ', 4)).build();
        }

        public void set(String source) {
            ByteBuffer tempByteBuffer1;
            source = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
            try {
                tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
                tempByteBuffer1.put(source.substring(0, 4).getBytes(
                        StandardCharsets.ISO_8859_1));
                tempByteBuffer1.flip();
                wsRespCd = tempByteBuffer1.getInt();
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsRespCd = 0;
            }
            try {
                tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
                tempByteBuffer1.put(source.substring(4, 8).getBytes(
                        StandardCharsets.ISO_8859_1));
                tempByteBuffer1.flip();
                wsReasCd = tempByteBuffer1.getInt();
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsReasCd = 0;
            }
            wsTranid = source.substring(8, 12);
        }

        public String get() {
            ByteBuffer tempByteBuffer1;
            StringBuilder sb = new StringBuilder();
            tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
            tempByteBuffer1.putInt(wsRespCd);
            tempByteBuffer1.flip();
            sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                    .toString());
            tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
            tempByteBuffer1.putInt(wsReasCd);
            tempByteBuffer1.flip();
            sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                    .toString());
            sb.append(wsTranid);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(getWsRespCd()));
            sb.append(String.valueOf(getWsReasCd()));
            sb.append(getWsTranid());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdslcCicsOutputEditVars {
        // [T-Up#INFO][COCRDSLC.cbl, LINE #73] CARD-ACCT-ID-X (level: 10)
        private @Getter @Builder.Default String cardAcctIdX = StringUtils
                .repeat(' ', 11);

        public long getCardAcctIdN() {
            try {
                return DataConverter
                        .convZonedStringToLong(getCardAcctIdX(), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardAcctIdN(long source) {
            String temp1 = DataConverter.convZonedLongToString(source, 11);
            setCardAcctIdX(temp1);
        }

        // [T-Up#INFO][COCRDSLC.cbl, LINE #76] CARD-CVV-CD-X (level: 10)
        private @Getter @Builder.Default String cardCvvCdX = StringUtils
                .repeat(' ', 3);

        public int getCardCvvCdN() {
            try {
                return (int) DataConverter.convZonedStringToLong(
                        getCardCvvCdX(), 3);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardCvvCdN(int source) {
            String temp1 = DataConverter.convZonedLongToString(source, 3);
            setCardCvvCdX(temp1);
        }

        // [T-Up#INFO][COCRDSLC.cbl, LINE #79] CARD-CARD-NUM-X (level: 10)
        private @Getter @Builder.Default String cardCardNumX = StringUtils
                .repeat(' ', 16);

        public long getCardCardNumN() {
            try {
                return DataConverter.convZonedStringToLong(getCardCardNumX(),
                        16);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardCardNumN(long source) {
            String temp1 = DataConverter.convZonedLongToString(source, 16);
            setCardCardNumX(temp1);
        }

        // [T-Up#INFO][COCRDSLC.cbl, LINE #82] CARD-NAME-EMBOSSED-X (level: 10)
        private @Getter @Builder.Default String cardNameEmbossedX = StringUtils
                .repeat(' ', 50);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #83] CARD-STATUS-X (level: 10)
        private @Getter @Builder.Default String cardStatusX = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #84] CARD-EXPIRAION-DATE-X (level: 10)
        private @Getter @Builder.Default String cardExpiraionDateX = StringUtils
                .repeat(' ', 10);

        public _OFFILLER1 getOFFILLER1() {
            return _OFFILLER1.builder().cardExpiryYear(getCardExpiryYear())
                    .OFFILLER2(getOFFILLER2())
                    .cardExpiryMonth(getCardExpiryMonth())
                    .OFFILLER3(getOFFILLER3())
                    .cardExpiryDay(getCardExpiryDay()).build();
        }

        public void setOFFILLER1(String source) {
            setCardExpiryYear(source.substring(0, 4));
            setOFFILLER2(source.substring(4, 5));
            setCardExpiryMonth(source.substring(5, 7));
            setOFFILLER3(source.substring(7, 8));
            setCardExpiryDay(source.substring(8, 10));
        }

        public void setOFFILLER1(_OFFILLER1 source) {
            setOFFILLER1(source.toString());
        }

        public String getCardExpiryYear() {
            return getCardExpiraionDateX().substring(0, 4);
        }

        public void setCardExpiryYear(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 0, 4));
        }

        public String getOFFILLER2() {
            return getCardExpiraionDateX().substring(4, 5);
        }

        public void setOFFILLER2(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 4, 5));
        }

        public String getCardExpiryMonth() {
            return getCardExpiraionDateX().substring(5, 7);
        }

        public void setCardExpiryMonth(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 5, 7));
        }

        public String getOFFILLER3() {
            return getCardExpiraionDateX().substring(7, 8);
        }

        public void setOFFILLER3(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 7, 8));
        }

        public String getCardExpiryDay() {
            return getCardExpiraionDateX().substring(8);
        }

        public void setCardExpiryDay(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 8, 10));
        }

        public long getCardExpiraionDateN() {
            try {
                return DataConverter.convZonedStringToLong(
                        getCardExpiraionDateX(), 10);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardExpiraionDateN(long source) {
            String temp1 = DataConverter.convZonedLongToString(source, 10);
            setCardExpiraionDateX(temp1);
        }

        public void setCardAcctIdX(String source) {
            cardAcctIdX = StringUtils.truncate(
                    StringUtils.rightPad(source, 11), 11);
        }

        public void setCardCvvCdX(String source) {
            cardCvvCdX = StringUtils.truncate(StringUtils.rightPad(source, 3),
                    3);
        }

        public void setCardCardNumX(String source) {
            cardCardNumX = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public void setCardNameEmbossedX(String source) {
            cardNameEmbossedX = StringUtils.truncate(
                    StringUtils.rightPad(source, 50), 50);
        }

        public void setCardStatusX(String source) {
            cardStatusX = StringUtils.truncate(StringUtils.rightPad(source, 1),
                    1);
        }

        public void setCardExpiraionDateX(String source) {
            cardExpiraionDateX = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public static CocrdslcCicsOutputEditVars createDefaultValueInstance() {
            return new CocrdslcCicsOutputEditVars.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 91), 91);
            cardAcctIdX = source.substring(0, 11);
            cardCvvCdX = source.substring(11, 14);
            cardCardNumX = source.substring(14, 30);
            cardNameEmbossedX = source.substring(30, 80);
            cardStatusX = source.substring(80, 81);
            cardExpiraionDateX = source.substring(81, 91);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(cardAcctIdX);
            sb.append(cardCvvCdX);
            sb.append(cardCardNumX);
            sb.append(cardNameEmbossedX);
            sb.append(cardStatusX);
            sb.append(cardExpiraionDateX);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardAcctIdX());
            sb.append(getCardCvvCdX());
            sb.append(getCardCardNumX());
            sb.append(getCardNameEmbossedX());
            sb.append(getCardStatusX());
            sb.append(getCardExpiraionDateX());
            return sb.toString();
        }

        public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _OFFILLER1 {
            // [T-Up#INFO][COCRDSLC.cbl, LINE #86] CARD-EXPIRY-YEAR (level: 20)
            private @Getter @Builder.Default String cardExpiryYear = StringUtils
                    .repeat(' ', 4);
            // [T-Up#INFO][COCRDSLC.cbl, LINE #87] FILLER (level: 20)
            private @Getter @Builder.Default String OFFILLER2 = StringUtils
                    .repeat(' ', 1);
            // [T-Up#INFO][COCRDSLC.cbl, LINE #88] CARD-EXPIRY-MONTH (level: 20)
            private @Getter @Builder.Default String cardExpiryMonth = StringUtils
                    .repeat(' ', 2);
            // [T-Up#INFO][COCRDSLC.cbl, LINE #89] FILLER (level: 20)
            private @Getter @Builder.Default String OFFILLER3 = StringUtils
                    .repeat(' ', 1);
            // [T-Up#INFO][COCRDSLC.cbl, LINE #90] CARD-EXPIRY-DAY (level: 20)
            private @Getter @Builder.Default String cardExpiryDay = StringUtils
                    .repeat(' ', 2);

            public String get() {
                StringBuilder sb = new StringBuilder();
                sb.append(cardExpiryYear);
                sb.append(OFFILLER2);
                sb.append(cardExpiryMonth);
                sb.append(OFFILLER3);
                sb.append(cardExpiryDay);
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(cardExpiryYear);
                sb.append(OFFILLER2);
                sb.append(cardExpiryMonth);
                sb.append(OFFILLER3);
                sb.append(cardExpiryDay);
                return sb.toString();
            }
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdslcWsCardRid {
        // [T-Up#INFO][COCRDSLC.cbl, LINE #98] WS-CARD-RID-CARDNUM (level: 10)
        private @Getter @Builder.Default String wsCardRidCardnum = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #99] WS-CARD-RID-ACCT-ID (level: 10)
        private @Getter @Setter long wsCardRidAcctId;

        public String getWsCardRidAcctIdX() {
            String temp1 = DataConverter.convZonedLongToString(
                    getWsCardRidAcctId(), 11);
            return temp1;
        }

        public void setWsCardRidAcctIdX(String source) {
            try {
                setWsCardRidAcctId(DataConverter.convZonedStringToLong(source,
                        11));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setWsCardRidAcctId(0);
            }
        }

        public void setWsCardRidCardnum(String source) {
            wsCardRidCardnum = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public static CocrdslcWsCardRid createDefaultValueInstance() {
            return new CocrdslcWsCardRid.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 27), 27);
            wsCardRidCardnum = source.substring(0, 16);
            try {
                wsCardRidAcctId = DataConverter.convZonedStringToLong(
                        source.substring(16, 27), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCardRidAcctId = 0;
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsCardRidCardnum);
            sb.append(DataConverter.convZonedLongToString(wsCardRidAcctId, 11));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCardRidCardnum());
            sb.append(PictureFormatter.intFormatWithoutSign(wsCardRidAcctId,
                    "00000000000"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdslcWsFileErrorMessage {
        // [T-Up#INFO][COCRDSLC.cbl, LINE #103] FILLER (level: 10)
        private @Getter @Builder.Default String OFFILLER4 = "File Error: ";
        // [T-Up#INFO][COCRDSLC.cbl, LINE #105] ERROR-OPNAME (level: 10)
        private @Getter @Builder.Default String errorOpname = StringUtils
                .repeat(' ', 8);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #107] FILLER (level: 10)
        private @Getter @Builder.Default String OFFILLER5 = " on ";
        // [T-Up#INFO][COCRDSLC.cbl, LINE #109] ERROR-FILE (level: 10)
        private @Getter @Builder.Default String errorFile = StringUtils.repeat(
                ' ', 9);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #111] FILLER (level: 10)
        private @Getter @Builder.Default String OFFILLER6 = " returned RESP ";
        // [T-Up#INFO][COCRDSLC.cbl, LINE #114] ERROR-RESP (level: 10)
        private @Getter @Builder.Default String errorResp = StringUtils.repeat(
                ' ', 10);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #116] FILLER (level: 10)
        private @Getter @Builder.Default String OFFILLER7 = ",RESP2 ";
        // [T-Up#INFO][COCRDSLC.cbl, LINE #118] ERROR-RESP2 (level: 10)
        private @Getter @Builder.Default String errorResp2 = StringUtils
                .repeat(' ', 10);
        // [T-Up#INFO][COCRDSLC.cbl, LINE #120] FILLER (level: 10)
        private @Getter @Builder.Default String OFFILLER8 = StringUtils.repeat(
                ' ', 5);

        public void setOFFILLER4(String source) {
            OFFILLER4 = StringUtils.truncate(StringUtils.rightPad(source, 12),
                    12);
        }

        public void setErrorOpname(String source) {
            errorOpname = StringUtils.truncate(StringUtils.rightPad(source, 8),
                    8);
        }

        public void setOFFILLER5(String source) {
            OFFILLER5 = StringUtils
                    .truncate(StringUtils.rightPad(source, 4), 4);
        }

        public void setErrorFile(String source) {
            errorFile = StringUtils
                    .truncate(StringUtils.rightPad(source, 9), 9);
        }

        public void setOFFILLER6(String source) {
            OFFILLER6 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                    15);
        }

        public void setErrorResp(String source) {
            errorResp = StringUtils.truncate(StringUtils.rightPad(source, 10),
                    10);
        }

        public void setOFFILLER7(String source) {
            OFFILLER7 = StringUtils
                    .truncate(StringUtils.rightPad(source, 7), 7);
        }

        public void setErrorResp2(String source) {
            errorResp2 = StringUtils.truncate(StringUtils.rightPad(source, 10),
                    10);
        }

        public void setOFFILLER8(String source) {
            OFFILLER8 = StringUtils
                    .truncate(StringUtils.rightPad(source, 5), 5);
        }

        public static CocrdslcWsFileErrorMessage createDefaultValueInstance() {
            return new CocrdslcWsFileErrorMessage.builder()
                    .OFFILLER4(StringUtils.repeat(' ', 12))
                    .errorOpname(StringUtils.repeat(' ', 8))
                    .OFFILLER5(StringUtils.repeat(' ', 4))
                    .errorFile(StringUtils.repeat(' ', 9))
                    .OFFILLER6(StringUtils.repeat(' ', 15))
                    .errorResp(StringUtils.repeat(' ', 10))
                    .OFFILLER7(StringUtils.repeat(' ', 7))
                    .errorResp2(StringUtils.repeat(' ', 10))
                    .OFFILLER8(StringUtils.repeat(' ', 5)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
            OFFILLER4 = source.substring(0, 12);
            errorOpname = source.substring(12, 20);
            OFFILLER5 = source.substring(20, 24);
            errorFile = source.substring(24, 33);
            OFFILLER6 = source.substring(33, 48);
            errorResp = source.substring(48, 58);
            OFFILLER7 = source.substring(58, 65);
            errorResp2 = source.substring(65, 75);
            OFFILLER8 = source.substring(75, 80);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(OFFILLER4);
            sb.append(errorOpname);
            sb.append(OFFILLER5);
            sb.append(errorFile);
            sb.append(OFFILLER6);
            sb.append(errorResp);
            sb.append(OFFILLER7);
            sb.append(errorResp2);
            sb.append(OFFILLER8);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OFFILLER4);
            sb.append(getErrorOpname());
            sb.append(OFFILLER5);
            sb.append(getErrorFile());
            sb.append(OFFILLER6);
            sb.append(getErrorResp());
            sb.append(OFFILLER7);
            sb.append(getErrorResp2());
            sb.append(OFFILLER8);
            return sb.toString();
        }
    }
}