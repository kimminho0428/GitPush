package aws.carddemo.variable.group;

import com.tmax.openframe.DataConverter;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:44 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Comen01cWsDateTime {
    // [T-Up#INFO][CSDAT01Y.cpy, LINE #19] WS-CURDATE-DATA (level: 5)
    private @Getter @Setter Comen01cWsCurdateData wsCurdateData = new Comen01cWsCurdateData();
    // [T-Up#INFO][CSDAT01Y.cpy, LINE #31] WS-CURDATE-MM-DD-YY (level: 5)
    private @Getter @Setter Comen01cWsCurdateMmDdYy wsCurdateMmDdYy = new Comen01cWsCurdateMmDdYy();
    // [T-Up#INFO][CSDAT01Y.cpy, LINE #37] WS-CURTIME-HH-MM-SS (level: 5)
    private @Getter @Setter Comen01cWsCurtimeHhMmSs wsCurtimeHhMmSs = new Comen01cWsCurtimeHhMmSs();
    // [T-Up#INFO][CSDAT01Y.cpy, LINE #43] WS-TIMESTAMP (level: 5)
    private @Getter @Setter Comen01cWsTimestamp wsTimestamp = new Comen01cWsTimestamp();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsCurdateData().toString());
        sb.append(getWsCurdateMmDdYy().toString());
        sb.append(getWsCurtimeHhMmSs().toString());
        sb.append(getWsTimestamp().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsCurdateData {
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #20] WS-CURDATE (level: 10)
        private @Getter @Setter Comen01cWsCurdate wsCurdate = new Comen01cWsCurdate();

        public int getWsCurdateN() {
            String temp1 = DataConverter.convZonedLongToString(getWsCurdate()
                    .getWsCurdateYear(), 4);
            String temp2 = DataConverter.convZonedLongToString(getWsCurdate()
                    .getWsCurdateMonth(), 2);
            String temp3 = DataConverter.convZonedLongToString(getWsCurdate()
                    .getWsCurdateDay(), 2);
            try {
                return (int) DataConverter.convZonedStringToLong(temp1 + temp2
                        + temp3, 8);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setWsCurdateN(int source) {
            String temp1 = DataConverter.convZonedLongToString(source, 8);
            try {
                wsCurdate.setWsCurdateYear((int) DataConverter
                        .convZonedStringToLong(temp1.substring(0, 4), 4));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdate.setWsCurdateYear(0);
            }
            try {
                wsCurdate.setWsCurdateMonth((int) DataConverter
                        .convZonedStringToLong(temp1.substring(4, 6), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdate.setWsCurdateMonth(0);
            }
            try {
                wsCurdate.setWsCurdateDay((int) DataConverter
                        .convZonedStringToLong(temp1.substring(6), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdate.setWsCurdateDay(0);
            }
        }

        // [T-Up#INFO][CSDAT01Y.cpy, LINE #25] WS-CURTIME (level: 10)
        private @Getter @Setter Comen01cWsCurtime wsCurtime = new Comen01cWsCurtime();

        public int getWsCurtimeN() {
            String temp1 = DataConverter.convZonedLongToString(getWsCurtime()
                    .getWsCurtimeHours(), 2);
            String temp2 = DataConverter.convZonedLongToString(getWsCurtime()
                    .getWsCurtimeMinute(), 2);
            String temp3 = DataConverter.convZonedLongToString(getWsCurtime()
                    .getWsCurtimeSecond(), 2);
            String temp4 = DataConverter.convZonedLongToString(getWsCurtime()
                    .getWsCurtimeMilsec(), 2);
            try {
                return (int) DataConverter.convZonedStringToLong(temp1 + temp2
                        + temp3 + temp4, 8);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setWsCurtimeN(int source) {
            String temp1 = DataConverter.convZonedLongToString(source, 8);
            try {
                wsCurtime.setWsCurtimeHours((int) DataConverter
                        .convZonedStringToLong(temp1.substring(0, 2), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtime.setWsCurtimeHours(0);
            }
            try {
                wsCurtime.setWsCurtimeMinute((int) DataConverter
                        .convZonedStringToLong(temp1.substring(2, 4), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtime.setWsCurtimeMinute(0);
            }
            try {
                wsCurtime.setWsCurtimeSecond((int) DataConverter
                        .convZonedStringToLong(temp1.substring(4, 6), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtime.setWsCurtimeSecond(0);
            }
            try {
                wsCurtime.setWsCurtimeMilsec((int) DataConverter
                        .convZonedStringToLong(temp1.substring(6), 2));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtime.setWsCurtimeMilsec(0);
            }
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            wsCurdate.set(source.substring(0, 8));
            wsCurtime.set(source.substring(8, 16));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(wsCurdate.get());
            sb.append(wsCurtime.get());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCurdate().toString());
            sb.append(getWsCurtime().toString());
            return sb.toString();
        }

        public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsCurdate {
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #21] WS-CURDATE-YEAR (level: 15)
            private @Getter @Setter int wsCurdateYear;
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #22] WS-CURDATE-MONTH (level: 15)
            private @Getter @Setter int wsCurdateMonth;
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #23] WS-CURDATE-DAY (level: 15)
            private @Getter @Setter int wsCurdateDay;

            public void set(String source) {
                source = StringUtils.truncate(StringUtils.rightPad(source, 8),
                        8);
                try {
                    wsCurdateYear = (int) DataConverter.convZonedStringToLong(
                            source.substring(0, 4), 4);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurdateYear = 0;
                }
                try {
                    wsCurdateMonth = (int) DataConverter.convZonedStringToLong(
                            source.substring(4, 6), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurdateMonth = 0;
                }
                try {
                    wsCurdateDay = (int) DataConverter.convZonedStringToLong(
                            source.substring(6, 8), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurdateDay = 0;
                }
            }

            public String get() {
                StringBuilder sb = new StringBuilder();
                sb.append(DataConverter.convZonedLongToString(wsCurdateYear, 4));
                sb.append(DataConverter
                        .convZonedLongToString(wsCurdateMonth, 2));
                sb.append(DataConverter.convZonedLongToString(wsCurdateDay, 2));
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurdateYear, "0000"));
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurdateMonth, "00"));
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurdateDay, "00"));
                return sb.toString();
            }
        }

        public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsCurtime {
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #26] WS-CURTIME-HOURS (level: 15)
            private @Getter @Setter int wsCurtimeHours;
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #27] WS-CURTIME-MINUTE (level: 15)
            private @Getter @Setter int wsCurtimeMinute;
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #28] WS-CURTIME-SECOND (level: 15)
            private @Getter @Setter int wsCurtimeSecond;
            // [T-Up#INFO][CSDAT01Y.cpy, LINE #29] WS-CURTIME-MILSEC (level: 15)
            private @Getter @Setter int wsCurtimeMilsec;

            public void set(String source) {
                source = StringUtils.truncate(StringUtils.rightPad(source, 8),
                        8);
                try {
                    wsCurtimeHours = (int) DataConverter.convZonedStringToLong(
                            source.substring(0, 2), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurtimeHours = 0;
                }
                try {
                    wsCurtimeMinute = (int) DataConverter
                            .convZonedStringToLong(source.substring(2, 4), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurtimeMinute = 0;
                }
                try {
                    wsCurtimeSecond = (int) DataConverter
                            .convZonedStringToLong(source.substring(4, 6), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurtimeSecond = 0;
                }
                try {
                    wsCurtimeMilsec = (int) DataConverter
                            .convZonedStringToLong(source.substring(6, 8), 2);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    wsCurtimeMilsec = 0;
                }
            }

            public String get() {
                StringBuilder sb = new StringBuilder();
                sb.append(DataConverter
                        .convZonedLongToString(wsCurtimeHours, 2));
                sb.append(DataConverter.convZonedLongToString(wsCurtimeMinute,
                        2));
                sb.append(DataConverter.convZonedLongToString(wsCurtimeSecond,
                        2));
                sb.append(DataConverter.convZonedLongToString(wsCurtimeMilsec,
                        2));
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurtimeHours, "00"));
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurtimeMinute, "00"));
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurtimeSecond, "00"));
                sb.append(PictureFormatter.intFormatWithoutSign(
                        (long) wsCurtimeMilsec, "00"));
                return sb.toString();
            }
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsCurdateMmDdYy {
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #32] WS-CURDATE-MM (level: 10)
        private @Getter @Setter int wsCurdateMm;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #33] FILLER (level: 10)
        private @Getter String OFFILLER1 = "/";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #34] WS-CURDATE-DD (level: 10)
        private @Getter @Setter int wsCurdateDd;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #35] FILLER (level: 10)
        private @Getter String OFFILLER2 = "/";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #36] WS-CURDATE-YY (level: 10)
        private @Getter @Setter int wsCurdateYy;

        public void setOFFILLER1(String source) {
            OFFILLER1 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER2(String source) {
            OFFILLER2 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
            try {
                wsCurdateMm = (int) DataConverter.convZonedStringToLong(
                        source.substring(0, 2), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdateMm = 0;
            }
            OFFILLER1 = source.substring(2, 3);
            try {
                wsCurdateDd = (int) DataConverter.convZonedStringToLong(
                        source.substring(3, 5), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdateDd = 0;
            }
            OFFILLER2 = source.substring(5, 6);
            try {
                wsCurdateYy = (int) DataConverter.convZonedStringToLong(
                        source.substring(6, 8), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurdateYy = 0;
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(DataConverter.convZonedLongToString(wsCurdateMm, 2));
            sb.append(OFFILLER1);
            sb.append(DataConverter.convZonedLongToString(wsCurdateDd, 2));
            sb.append(OFFILLER2);
            sb.append(DataConverter.convZonedLongToString(wsCurdateYy, 2));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurdateMm,
                    "00"));
            sb.append(OFFILLER1);
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurdateDd,
                    "00"));
            sb.append(OFFILLER2);
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurdateYy,
                    "00"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsCurtimeHhMmSs {
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #38] WS-CURTIME-HH (level: 10)
        private @Getter @Setter int wsCurtimeHh;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #39] FILLER (level: 10)
        private @Getter String OFFILLER3 = ":";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #40] WS-CURTIME-MM (level: 10)
        private @Getter @Setter int wsCurtimeMm;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #41] FILLER (level: 10)
        private @Getter String OFFILLER4 = ":";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #42] WS-CURTIME-SS (level: 10)
        private @Getter @Setter int wsCurtimeSs;

        public void setOFFILLER3(String source) {
            OFFILLER3 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER4(String source) {
            OFFILLER4 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
            try {
                wsCurtimeHh = (int) DataConverter.convZonedStringToLong(
                        source.substring(0, 2), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtimeHh = 0;
            }
            OFFILLER3 = source.substring(2, 3);
            try {
                wsCurtimeMm = (int) DataConverter.convZonedStringToLong(
                        source.substring(3, 5), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtimeMm = 0;
            }
            OFFILLER4 = source.substring(5, 6);
            try {
                wsCurtimeSs = (int) DataConverter.convZonedStringToLong(
                        source.substring(6, 8), 2);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                wsCurtimeSs = 0;
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(DataConverter.convZonedLongToString(wsCurtimeHh, 2));
            sb.append(OFFILLER3);
            sb.append(DataConverter.convZonedLongToString(wsCurtimeMm, 2));
            sb.append(OFFILLER4);
            sb.append(DataConverter.convZonedLongToString(wsCurtimeSs, 2));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurtimeHh,
                    "00"));
            sb.append(OFFILLER3);
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurtimeMm,
                    "00"));
            sb.append(OFFILLER4);
            sb.append(PictureFormatter.intFormatWithoutSign((long) wsCurtimeSs,
                    "00"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor class Comen01cWsTimestamp {
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #44] WS-TIMESTAMP-DT-YYYY (level: 10)
        private @Getter @Setter int wsTimestampDtYyyy;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #45] FILLER (level: 10)
        private @Getter String OFFILLER5 = "-";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #46] WS-TIMESTAMP-DT-MM (level: 10)
        private @Getter @Setter int wsTimestampDtMm;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #47] FILLER (level: 10)
        private @Getter String OFFILLER6 = "-";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #48] WS-TIMESTAMP-DT-DD (level: 10)
        private @Getter @Setter int wsTimestampDtDd;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #49] FILLER (level: 10)
        private @Getter String OFFILLER7 = " ";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #50] WS-TIMESTAMP-TM-HH (level: 10)
        private @Getter @Setter int wsTimestampTmHh;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #51] FILLER (level: 10)
        private @Getter String OFFILLER8 = ":";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #52] WS-TIMESTAMP-TM-MM (level: 10)
        private @Getter @Setter int wsTimestampTmMm;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #53] FILLER (level: 10)
        private @Getter String OFFILLER9 = ":";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #54] WS-TIMESTAMP-TM-SS (level: 10)
        private @Getter @Setter int wsTimestampTmSs;
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #55] FILLER (level: 10)
        private @Getter String OFFILLER10 = ".";
        // [T-Up#INFO][CSDAT01Y.cpy, LINE #56] WS-TIMESTAMP-TM-MS6 (level: 10)
        private @Getter @Setter int wsTimestampTmMs6;

        public void setOFFILLER5(String source) {
            OFFILLER5 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER6(String source) {
            OFFILLER6 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER7(String source) {
            OFFILLER7 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER8(String source) {
            OFFILLER8 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER9(String source) {
            OFFILLER9 = StringUtils
                    .truncate(StringUtils.rightPad(source, 1), 1);
        }

        public void setOFFILLER10(String source) {
            OFFILLER10 = StringUtils.truncate(StringUtils.rightPad(source, 1),
                    1);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampDtYyyy, "0000"));
            sb.append(OFFILLER5);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampDtMm, "00"));
            sb.append(OFFILLER6);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampDtDd, "00"));
            sb.append(OFFILLER7);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampTmHh, "00"));
            sb.append(OFFILLER8);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampTmMm, "00"));
            sb.append(OFFILLER9);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampTmSs, "00"));
            sb.append(OFFILLER10);
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) wsTimestampTmMs6, "000000"));
            return sb.toString();
        }
    }
}
