package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:51 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsThisProgcommarea {
    // [T-Up#INFO][COCRDLIC.cbl, LINE #229] WS-CA-LAST-CARDKEY (level: 10)
    private @Getter @Setter @Builder.Default CocrdlicWsCaLastCardkey wsCaLastCardkey = new CocrdlicWsCaLastCardkey();
    // [T-Up#INFO][COCRDLIC.cbl, LINE #232] WS-CA-FIRST-CARDKEY (level: 10)
    private @Getter @Setter @Builder.Default CocrdlicWsCaFirstCardkey wsCaFirstCardkey = new CocrdlicWsCaFirstCardkey();
    // [T-Up#INFO][COCRDLIC.cbl, LINE #236] WS-CA-SCREEN-NUM (level: 10)
    private @Getter @Setter int wsCaScreenNum;
    // [T-Up#INFO][COCRDLIC.cbl, LINE #237] CA-FIRST-PAGE (level: 88)
    public static final int CA_FIRST_PAGE = 1;
    // [T-Up#INFO][COCRDLIC.cbl, LINE #238] WS-CA-LAST-PAGE-DISPLAYED (level: 10)
    private @Getter @Setter int wsCaLastPageDisplayed;
    // [T-Up#INFO][COCRDLIC.cbl, LINE #239] CA-LAST-PAGE-SHOWN (level: 88)
    public static final int CA_LAST_PAGE_SHOWN = 0;
    // [T-Up#INFO][COCRDLIC.cbl, LINE #240] CA-LAST-PAGE-NOT-SHOWN (level: 88)
    public static final int CA_LAST_PAGE_NOT_SHOWN = 9;
    // [T-Up#INFO][COCRDLIC.cbl, LINE #241] WS-CA-NEXT-PAGE-IND (level: 10)
    private @Getter @Builder.Default String wsCaNextPageInd = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDLIC.cbl, LINE #242] CA-NEXT-PAGE-NOT-EXISTS (level: 88)
    public static final String CA_NEXT_PAGE_NOT_EXISTS = StringUtils.repeat(
            (char) 0x00, 1);
    // [T-Up#INFO][COCRDLIC.cbl, LINE #243] CA-NEXT-PAGE-EXISTS (level: 88)
    public static final String CA_NEXT_PAGE_EXISTS = "Y";
    // [T-Up#INFO][COCRDLIC.cbl, LINE #245] WS-RETURN-FLAG (level: 10)
    private @Getter @Builder.Default String wsReturnFlag = StringUtils.repeat(
            ' ', 1);
    // [T-Up#INFO][COCRDLIC.cbl, LINE #246] WS-RETURN-FLAG-OFF (level: 88)
    public static final String WS_RETURN_FLAG_OFF = StringUtils.repeat(
            (char) 0x00, 1);
    // [T-Up#INFO][COCRDLIC.cbl, LINE #247] WS-RETURN-FLAG-ON (level: 88)
    public static final String WS_RETURN_FLAG_ON = "1";
    // ******************************************************************
    // *  File Data Array         28 CHARS X 7 ROWS = 196                
    // ******************************************************************
    // [T-Up#INFO][COCRDLIC.cbl, LINE #251] WS-SCREEN-DATA (level: 5)
    private @Getter @Setter @Builder.Default CocrdlicWsScreenData wsScreenData = new CocrdlicWsScreenData();

    public void setWsCaNextPageInd(String source) {
        wsCaNextPageInd = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsReturnFlag(String source) {
        wsReturnFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public static CocrdlicWsThisProgcommarea createDefaultValueInstance() {
        return new CocrdlicWsThisProgcommarea.builder()
                .wsCaLastCardkey(
                        CocrdlicWsCaLastCardkey.createDefaultValueInstance())
                .wsCaFirstCardkey(
                        CocrdlicWsCaFirstCardkey.createDefaultValueInstance())
                .wsScreenData(CocrdlicWsScreenData.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 254), 254);
        wsCaLastCardkey.set(source.substring(0, 27));
        wsCaFirstCardkey.set(source.substring(27, 54));
        try {
            wsCaScreenNum = (int) DataConverter.convZonedStringToLong(
                    source.substring(54, 55), 1);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            wsCaScreenNum = 0;
        }
        try {
            wsCaLastPageDisplayed = (int) DataConverter.convZonedStringToLong(
                    source.substring(55, 56), 1);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            wsCaLastPageDisplayed = 0;
        }
        wsCaNextPageInd = source.substring(56, 57);
        wsReturnFlag = source.substring(57, 58);
        wsScreenData.set(source.substring(58, 254));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(wsCaLastCardkey.get());
        sb.append(wsCaFirstCardkey.get());
        sb.append(DataConverter.convZonedLongToString(wsCaScreenNum, 1));
        sb.append(DataConverter.convZonedLongToString(wsCaLastPageDisplayed, 1));
        sb.append(wsCaNextPageInd);
        sb.append(wsReturnFlag);
        sb.append(wsScreenData.get());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsCaLastCardkey().toString());
        sb.append(getWsCaFirstCardkey().toString());
        sb.append(PictureFormatter.intFormatWithoutSign((long) wsCaScreenNum,
                "0"));
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) wsCaLastPageDisplayed, "0"));
        sb.append(getWsCaNextPageInd());
        sb.append(getWsReturnFlag());
        sb.append(getWsScreenData().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsCaLastCardkey {
        // [T-Up#INFO][COCRDLIC.cbl, LINE #230] WS-CA-LAST-CARD-NUM (level: 15)
        private @Getter @Builder.Default String wsCaLastCardNum = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDLIC.cbl, LINE #231] WS-CA-LAST-CARD-ACCT-ID (level: 15)
        private @Getter @Setter long wsCaLastCardAcctId;

        public void setWsCaLastCardNum(String source) {
            wsCaLastCardNum = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public static CocrdlicWsCaLastCardkey createDefaultValueInstance() {
            return new CocrdlicWsCaLastCardkey.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 27), 27);
            wsCaLastCardNum = source.substring(0, 16);
            try {
                wsCaLastCardAcctId = DataConverter.convZonedStringToLong(
                        source.substring(16, 27), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCaLastCardAcctId = 0;
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsCaLastCardNum);
            sb.append(DataConverter.convZonedLongToString(wsCaLastCardAcctId,
                    11));
            return sb.toString();
        }

        public void set(
                CocrdlicWsThisProgcommarea.CocrdlicWsCaFirstCardkey source) {
            wsCaLastCardNum = source.getWsCaFirstCardNum();
            wsCaLastCardAcctId = source.getWsCaFirstCardAcctId();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCaLastCardNum());
            sb.append(PictureFormatter.intFormatWithoutSign(wsCaLastCardAcctId,
                    "00000000000"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsCaFirstCardkey {
        // [T-Up#INFO][COCRDLIC.cbl, LINE #233] WS-CA-FIRST-CARD-NUM (level: 15)
        private @Getter @Builder.Default String wsCaFirstCardNum = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDLIC.cbl, LINE #234] WS-CA-FIRST-CARD-ACCT-ID (level: 15)
        private @Getter @Setter long wsCaFirstCardAcctId;

        public void setWsCaFirstCardNum(String source) {
            wsCaFirstCardNum = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public static CocrdlicWsCaFirstCardkey createDefaultValueInstance() {
            return new CocrdlicWsCaFirstCardkey.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 27), 27);
            wsCaFirstCardNum = source.substring(0, 16);
            try {
                wsCaFirstCardAcctId = DataConverter.convZonedStringToLong(
                        source.substring(16, 27), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCaFirstCardAcctId = 0;
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsCaFirstCardNum);
            sb.append(DataConverter.convZonedLongToString(wsCaFirstCardAcctId,
                    11));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCaFirstCardNum());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    wsCaFirstCardAcctId, "00000000000"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsScreenData {
        // [T-Up#INFO][COCRDLIC.cbl, LINE #252] WS-SCREEN-ROWS (level: 15)
        private @Getter @Setter @Builder.Default CocrdlicWsScreenRows[] wsScreenRows = Stream
                .generate(CocrdlicWsScreenRows::new).limit(7)
                .toArray(CocrdlicWsScreenRows[]::new);

        public CocrdlicWsScreenRows getWsScreenRows(int index) {
            return wsScreenRows[index];
        }

        public void setWsScreenRows(int index, CocrdlicWsScreenRows source) {
            wsScreenRows[index] = source;
        }

        public static CocrdlicWsScreenData createDefaultValueInstance() {
            return new CocrdlicWsScreenData.builder().wsScreenRows(
                    Stream.generate(CocrdlicWsScreenRows::new).limit(7)
                            .toArray(CocrdlicWsScreenRows[]::new)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 196),
                    196);
            getWsScreenRows(0).set(source.substring(0, 28));
            getWsScreenRows(1).set(source.substring(28, 56));
            getWsScreenRows(2).set(source.substring(56, 84));
            getWsScreenRows(3).set(source.substring(84, 112));
            getWsScreenRows(4).set(source.substring(112, 140));
            getWsScreenRows(5).set(source.substring(140, 168));
            getWsScreenRows(6).set(source.substring(168, 196));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(Arrays.stream(getWsScreenRows())
                    .map(CocrdlicWsScreenRows::toString)
                    .collect(Collectors.joining()));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsScreenRows().toString());
            return sb.toString();
        }

        public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsScreenRows {
            // [T-Up#INFO][COCRDLIC.cbl, LINE #253] WS-EACH-ROW (level: 20)
            private @Getter @Setter @Builder.Default CocrdlicWsEachRow wsEachRow = new CocrdlicWsEachRow();

            public static CocrdlicWsScreenRows createDefaultValueInstance() {
                return new CocrdlicWsScreenRows.builder().wsEachRow(
                        CocrdlicWsEachRow.createDefaultValueInstance()).build();
            }

            public void set(String source) {
                source = StringUtils.truncate(StringUtils.rightPad(source, 28),
                        28);
                wsEachRow.set(source.substring(0, 28));
            }

            public String get() {
                StringBuilder sb = new StringBuilder();
                sb.append(wsEachRow.get());
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(getWsEachRow().toString());
                return sb.toString();
            }

            public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsEachRow {
                // [T-Up#INFO][COCRDLIC.cbl, LINE #254] WS-EACH-CARD (level: 25)
                private @Getter @Setter @Builder.Default CocrdlicWsEachCard wsEachCard = new CocrdlicWsEachCard();

                public static CocrdlicWsEachRow createDefaultValueInstance() {
                    return new CocrdlicWsEachRow.builder().wsEachCard(
                            CocrdlicWsEachCard.createDefaultValueInstance())
                            .build();
                }

                public void set(String source) {
                    source = StringUtils.truncate(
                            StringUtils.rightPad(source, 28), 28);
                    wsEachCard.set(source.substring(0, 28));
                }

                public String get() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wsEachCard.get());
                    return sb.toString();
                }

                @Override
                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getWsEachCard().toString());
                    return sb.toString();
                }

                public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdlicWsEachCard {
                    // [T-Up#INFO][COCRDLIC.cbl, LINE #255] WS-ROW-ACCTNO (level: 30)
                    private @Getter @Builder.Default String wsRowAcctno = StringUtils
                            .repeat(' ', 11);
                    // [T-Up#INFO][COCRDLIC.cbl, LINE #256] WS-ROW-CARD-NUM (level: 30)
                    private @Getter @Builder.Default String wsRowCardNum = StringUtils
                            .repeat(' ', 16);
                    // [T-Up#INFO][COCRDLIC.cbl, LINE #257] WS-ROW-CARD-STATUS (level: 30)
                    private @Getter @Builder.Default String wsRowCardStatus = StringUtils
                            .repeat(' ', 1);

                    public void setWsRowAcctno(String source) {
                        wsRowAcctno = StringUtils.truncate(
                                StringUtils.rightPad(source, 11), 11);
                    }

                    public void setWsRowCardNum(String source) {
                        wsRowCardNum = StringUtils.truncate(
                                StringUtils.rightPad(source, 16), 16);
                    }

                    public void setWsRowCardStatus(String source) {
                        wsRowCardStatus = StringUtils.truncate(
                                StringUtils.rightPad(source, 1), 1);
                    }

                    public static CocrdlicWsEachCard createDefaultValueInstance() {
                        return new CocrdlicWsEachCard.builder().build();
                    }

                    public void set(String source) {
                        source = StringUtils.truncate(
                                StringUtils.rightPad(source, 28), 28);
                        wsRowAcctno = source.substring(0, 11);
                        wsRowCardNum = source.substring(11, 27);
                        wsRowCardStatus = source.substring(27, 28);
                    }

                    public String get() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(wsRowAcctno);
                        sb.append(wsRowCardNum);
                        sb.append(wsRowCardStatus);
                        return sb.toString();
                    }

                    @Override
                    public String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getWsRowAcctno());
                        sb.append(getWsRowCardNum());
                        sb.append(getWsRowCardStatus());
                        return sb.toString();
                    }
                }
            }
        }
    }
}
