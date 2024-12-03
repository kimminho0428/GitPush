package aws.carddemo.variable.group;

import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:50 UTC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CsutldtcFeedbackCode {
    // [T-Up#INFO][CSUTLDTC.cbl, LINE #61] FEEDBACK-TOKEN-VALUE (level: 2)
    private @Getter @Setter CsutldtcFeedbackTokenValue feedbackTokenValue = new CsutldtcFeedbackTokenValue();
    // [T-Up#INFO][CSUTLDTC.cbl, LINE #80] I-S-INFO (level: 2)
    private @Getter @Setter int iSInfo;

    public void set(String source) {
        ByteBuffer tempByteBuffer1;
        source = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
        feedbackTokenValue.set(source.substring(0, 8));
        try {
            tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
            tempByteBuffer1.put(source.substring(8, 12).getBytes(
                    StandardCharsets.ISO_8859_1));
            tempByteBuffer1.flip();
            iSInfo = tempByteBuffer1.getInt();
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            iSInfo = 0;
        }
    }

    public String get() {
        ByteBuffer tempByteBuffer1;
        StringBuilder sb = new StringBuilder();
        sb.append(feedbackTokenValue.get());
        tempByteBuffer1 = ByteBuffer.allocate(Integer.BYTES);
        tempByteBuffer1.putInt(iSInfo);
        tempByteBuffer1.flip();
        sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                .toString());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFeedbackTokenValue().toString());
        sb.append(String.valueOf(getISInfo()));
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor class CsutldtcFeedbackTokenValue {
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #62] FC-INVALID-DATE (level: 88)
        public static final String FC_INVALID_DATE = "\0\0\0\0\0\0\0\0";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #63] FC-INSUFFICIENT-DATA (level: 88)
        public static final String FC_INSUFFICIENT_DATA = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #64] FC-BAD-DATE-VALUE (level: 88)
        public static final String FC_BAD_DATE_VALUE = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #65] FC-INVALID-ERA (level: 88)
        public static final String FC_INVALID_ERA = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #66] FC-UNSUPP-RANGE (level: 88)
        public static final String FC_UNSUPP_RANGE = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #67] FC-INVALID-MONTH (level: 88)
        public static final String FC_INVALID_MONTH = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #68] FC-BAD-PIC-STRING (level: 88)
        public static final String FC_BAD_PIC_STRING = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #69] FC-NON-NUMERIC-DATA (level: 88)
        public static final String FC_NON_NUMERIC_DATA = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #70] FC-YEAR-IN-ERA-ZERO (level: 88)
        public static final String FC_YEAR_IN_ERA_ZERO = "\0\3\t�Y���";
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #71] CASE-1-CONDITION-ID (level: 3)
        private @Getter @Setter CsutldtcCase1ConditionId case1ConditionId = new CsutldtcCase1ConditionId();

        public CsutldtcCase2ConditionId getCase2ConditionId() {
            return CsutldtcCase2ConditionId.builder().classCode(getClassCode())
                    .causeCode(getCauseCode()).build();
        }

        public void setCase2ConditionId(String source) {
            setClassCode(Integer.parseInt(source.substring(0, 2)));
            setCauseCode(Integer.parseInt(source.substring(2, 4)));
        }

        public void setCase2ConditionId(CsutldtcCase2ConditionId source) {
            setCase2ConditionId(source.toString());
        }

        public int getClassCode() {
            return getCase1ConditionId().getSeverity();
        }

        public void setClassCode(int source) {
            getCase1ConditionId().setSeverity(source);
        }

        public int getCauseCode() {
            return getCase1ConditionId().getMsgNo();
        }

        public void setCauseCode(int source) {
            getCase1ConditionId().setMsgNo(source);
        }

        // [T-Up#INFO][CSUTLDTC.cbl, LINE #78] CASE-SEV-CTL (level: 3)
        private @Getter String caseSevCtl = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CSUTLDTC.cbl, LINE #79] FACILITY-ID (level: 3)
        private @Getter String facilityId = StringUtils.repeat(' ', 3);

        public void setCaseSevCtl(String source) {
            caseSevCtl = StringUtils.truncate(StringUtils.rightPad(source, 1),
                    1);
        }

        public void setFacilityId(String source) {
            facilityId = StringUtils.truncate(StringUtils.rightPad(source, 3),
                    3);
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
            case1ConditionId.set(source.substring(0, 4));
            caseSevCtl = source.substring(4, 5);
            facilityId = source.substring(5, 8);
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(case1ConditionId.get());
            sb.append(caseSevCtl);
            sb.append(facilityId);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCase1ConditionId().toString());
            sb.append(getCaseSevCtl());
            sb.append(getFacilityId());
            return sb.toString();
        }

        public static @AllArgsConstructor @NoArgsConstructor class CsutldtcCase1ConditionId {
            // [T-Up#INFO][CSUTLDTC.cbl, LINE #72] SEVERITY (level: 4)
            private @Getter @Setter int severity;
            // [T-Up#INFO][CSUTLDTC.cbl, LINE #73] MSG-NO (level: 4)
            private @Getter @Setter int msgNo;

            public void set(String source) {
                ByteBuffer tempByteBuffer1;
                source = StringUtils.truncate(StringUtils.rightPad(source, 4),
                        4);
                try {
                    tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                    tempByteBuffer1.put(source.substring(0, 2).getBytes(
                            StandardCharsets.ISO_8859_1));
                    tempByteBuffer1.flip();
                    severity = tempByteBuffer1.getShort();
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    severity = 0;
                }
                try {
                    tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                    tempByteBuffer1.put(source.substring(2, 4).getBytes(
                            StandardCharsets.ISO_8859_1));
                    tempByteBuffer1.flip();
                    msgNo = tempByteBuffer1.getShort();
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                    msgNo = 0;
                }
            }

            public String get() {
                ByteBuffer tempByteBuffer1;
                StringBuilder sb = new StringBuilder();
                tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                tempByteBuffer1.putShort((short) severity);
                tempByteBuffer1.flip();
                sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                        .toString());
                tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                tempByteBuffer1.putShort((short) msgNo);
                tempByteBuffer1.flip();
                sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                        .toString());
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(getSeverity()));
                sb.append(String.valueOf(getMsgNo()));
                return sb.toString();
            }
        }

        public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CsutldtcCase2ConditionId {
            // [T-Up#INFO][CSUTLDTC.cbl, LINE #76] CLASS-CODE (level: 4)
            private @Getter @Setter int classCode;
            // [T-Up#INFO][CSUTLDTC.cbl, LINE #77] CAUSE-CODE (level: 4)
            private @Getter @Setter int causeCode;

            public String get() {
                ByteBuffer tempByteBuffer1;
                StringBuilder sb = new StringBuilder();
                tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                tempByteBuffer1.putShort((short) classCode);
                tempByteBuffer1.flip();
                sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                        .toString());
                tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
                tempByteBuffer1.putShort((short) causeCode);
                tempByteBuffer1.flip();
                sb.append(StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                        .toString());
                return sb.toString();
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(classCode));
                sb.append(String.valueOf(causeCode));
                return sb.toString();
            }
        }
    }
}