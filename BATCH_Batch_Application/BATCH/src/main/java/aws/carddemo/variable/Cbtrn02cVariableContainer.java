package aws.carddemo.variable;

import aws.carddemo.variable.group.*;
import com.tmax.openframe.DataConverter;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 * <hr>
 * <p>Class that defines variables that defined in the data division of COBOL program</p>
 */
public class Cbtrn02cVariableContainer {
    // ***************************************************************** 
    //       *COPY CVTRA06Y.                                                   
    // *(/home/oflab/repository/ref/COBOL_COPYBOOK/CARDDEMO/CVTRA06Y.cpy)
    // ***************************************************************** 
    // *    Data-structure for DALYTRANsaction record (RECLN = 350)      
    // ***************************************************************** 
    // [T-Up#INFO][CVTRA06Y.cpy, LINE #5] DALYTRAN-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cDalytranRecord dalytranRecord = new Cbtrn02cDalytranRecord();
    // *                                                                 
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT 
    // *                                                                 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #126] DALYTRAN-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cDalytranStatus dalytranStatus = new Cbtrn02cDalytranStatus();
    //       *COPY CVTRA05Y.                                                   
    // *(/home/oflab/repository/ref/COBOL_COPYBOOK/CARDDEMO/CVTRA05Y.cpy)
    // ***************************************************************** 
    // *    Data-structure for TRANsaction record (RECLN = 350)          
    // ***************************************************************** 
    // [T-Up#INFO][CVTRA05Y.cpy, LINE #5] TRAN-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cTranRecord tranRecord = new Cbtrn02cTranRecord();
    // *                                                                 
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT 
    // *                                                                 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #131] TRANFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cTranfileStatus tranfileStatus = new Cbtrn02cTranfileStatus();
    //       *COPY CVACT03Y.                                                   
    // *(/home/oflab/repository/ref/COBOL_COPYBOOK/CARDDEMO/CVACT03Y.cpy)
    // ***************************************************************** 
    // *    Data-structure for card xref (RECLN 50)                      
    // ***************************************************************** 
    // [T-Up#INFO][CVACT03Y.cpy, LINE #5] CARD-XREF-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cCardXrefRecord cardXrefRecord = new Cbtrn02cCardXrefRecord();
    // *                                                                 
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT 
    // *                                                                 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #136] XREFFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cXreffileStatus xreffileStatus = new Cbtrn02cXreffileStatus();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #140] DALYREJS-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cDalyrejsStatus dalyrejsStatus = new Cbtrn02cDalyrejsStatus();
    //       *COPY CVACT01Y.                                                   
    // *(/home/oflab/repository/ref/COBOL_COPYBOOK/CARDDEMO/CVACT01Y.cpy)
    // ***************************************************************** 
    // *    Data-structure for  account entity (RECLN 300)               
    // ***************************************************************** 
    // [T-Up#INFO][CVACT01Y.cpy, LINE #5] ACCOUNT-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cAccountRecord accountRecord = new Cbtrn02cAccountRecord();
    // *                                                                 
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT 
    // *                                                                 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #145] ACCTFILE-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cAcctfileStatus acctfileStatus = new Cbtrn02cAcctfileStatus();
    //       *COPY CVTRA01Y.                                                   
    // *(/home/oflab/repository/ref/COBOL_COPYBOOK/CARDDEMO/CVTRA01Y.cpy)
    // ***************************************************************** 
    // *    Data-structure for transaction category balance (RECLN = 50) 
    // ***************************************************************** 
    // [T-Up#INFO][CVTRA01Y.cpy, LINE #5] TRAN-CAT-BAL-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cTranCatBalRecord tranCatBalRecord = new Cbtrn02cTranCatBalRecord();
    // *                                                                 
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT 
    // *                                                                 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #150] TCATBALF-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cTcatbalfStatus tcatbalfStatus = new Cbtrn02cTcatbalfStatus();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #154] IO-STATUS (level: 1)
    private @Getter @Setter Cbtrn02cIoStatus ioStatus = new Cbtrn02cIoStatus();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #157] TWO-BYTES-BINARY (level: 1)
    private @Getter @Setter int twoBytesBinary;

    public Cbtrn02cTwoBytesAlpha getTwoBytesAlpha() {
        return Cbtrn02cTwoBytesAlpha.builder().twoBytesLeft(getTwoBytesLeft())
                .twoBytesRight(getTwoBytesRight()).build();
    }

    public void setTwoBytesAlpha(String source) {
        setTwoBytesLeft(source.substring(0, 1));
        setTwoBytesRight(source.substring(1, 2));
    }

    public void setTwoBytesAlpha(Cbtrn02cTwoBytesAlpha source) {
        setTwoBytesAlpha(source.toString());
    }

    public String getTwoBytesLeft() {
        ByteBuffer tempByteBuffer1;
        tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer1.putShort((short) getTwoBytesBinary());
        tempByteBuffer1.flip();
        String temp1 = StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                .toString();
        return temp1.substring(0, 1);
    }

    public void setTwoBytesLeft(String source) {
        ByteBuffer tempByteBuffer1;
        ByteBuffer tempByteBuffer2;
        tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer1.putShort((short) getTwoBytesBinary());
        tempByteBuffer1.flip();
        tempByteBuffer2 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer2.put(StringUtils.overlay(
                StandardCharsets.ISO_8859_1.decode(tempByteBuffer1).toString(),
                source, 0, 1).getBytes(StandardCharsets.ISO_8859_1));
        tempByteBuffer2.flip();
        setTwoBytesBinary(tempByteBuffer2.getShort());
    }

    public String getTwoBytesRight() {
        ByteBuffer tempByteBuffer1;
        tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer1.putShort((short) getTwoBytesBinary());
        tempByteBuffer1.flip();
        String temp1 = StandardCharsets.ISO_8859_1.decode(tempByteBuffer1)
                .toString();
        return temp1.substring(1);
    }

    public void setTwoBytesRight(String source) {
        ByteBuffer tempByteBuffer1;
        ByteBuffer tempByteBuffer2;
        tempByteBuffer1 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer1.putShort((short) getTwoBytesBinary());
        tempByteBuffer1.flip();
        tempByteBuffer2 = ByteBuffer.allocate(Short.BYTES);
        tempByteBuffer2.put(StringUtils.overlay(
                StandardCharsets.ISO_8859_1.decode(tempByteBuffer1).toString(),
                source, 1, 2).getBytes(StandardCharsets.ISO_8859_1));
        tempByteBuffer2.flip();
        setTwoBytesBinary(tempByteBuffer2.getShort());
    }

    // [T-Up#INFO][CBTRN02C.cbl, LINE #161] IO-STATUS-04 (level: 1)
    private @Getter @Setter Cbtrn02cIoStatus04 ioStatus04 = new Cbtrn02cIoStatus04();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #165] APPL-RESULT (level: 1)
    private @Getter @Setter int applResult;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #166] APPL-AOK (level: 88)
    public static final int APPL_AOK = 0;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #167] APPL-EOF (level: 88)
    public static final int APPL_EOF = 16;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #169] END-OF-FILE (level: 1)
    private @Getter String endOfFile = "N";
    // [T-Up#INFO][CBTRN02C.cbl, LINE #170] ABCODE (level: 1)
    private @Getter @Setter int abcode;
    // [T-Up#INFO][CBTRN02C.cbl, LINE #171] TIMING (level: 1)
    private @Getter @Setter int timing;
    // * T I M E S T A M P   D B 2  X(26)     EEEE-MM-DD-UU.MM.SS.HH0000 
    // [T-Up#INFO][CBTRN02C.cbl, LINE #173] COBOL-TS (level: 1)
    private @Getter @Setter Cbtrn02cCobolTs cobolTs = new Cbtrn02cCobolTs();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #182] DB2-FORMAT-TS (level: 1)
    private @Getter String db2FormatTs = StringUtils.repeat(' ', 26);

    public _OFFILLER1 getOFFILLER1() {
        return _OFFILLER1.builder().db2Yyyy(getDb2Yyyy())
                .db2Streep1(getDb2Streep1()).db2Mm(getDb2Mm())
                .db2Streep2(getDb2Streep2()).db2Dd(getDb2Dd())
                .db2Streep3(getDb2Streep3()).db2Hh(getDb2Hh())
                .db2Dot1(getDb2Dot1()).db2Min(getDb2Min())
                .db2Dot2(getDb2Dot2()).db2Ss(getDb2Ss()).db2Dot3(getDb2Dot3())
                .db2Mil(getDb2Mil()).db2Rest(getDb2Rest()).build();
    }

    public void setOFFILLER1(String source) {
        setDb2Yyyy(source.substring(0, 4));
        setDb2Streep1(source.substring(4, 5));
        setDb2Mm(source.substring(5, 7));
        setDb2Streep2(source.substring(7, 8));
        setDb2Dd(source.substring(8, 10));
        setDb2Streep3(source.substring(10, 11));
        setDb2Hh(source.substring(11, 13));
        setDb2Dot1(source.substring(13, 14));
        setDb2Min(source.substring(14, 16));
        setDb2Dot2(source.substring(16, 17));
        setDb2Ss(source.substring(17, 19));
        setDb2Dot3(source.substring(19, 20));
        setDb2Mil(Integer.parseInt(source.substring(20, 22)));
        setDb2Rest(source.substring(22, 26));
    }

    public void setOFFILLER1(_OFFILLER1 source) {
        setOFFILLER1(source.toString());
    }

    public String getDb2Yyyy() {
        return getDb2FormatTs().substring(0, 4);
    }

    public void setDb2Yyyy(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 0, 4));
    }

    public String getDb2Streep1() {
        return getDb2FormatTs().substring(4, 5);
    }

    public void setDb2Streep1(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 4, 5));
    }

    public String getDb2Mm() {
        return getDb2FormatTs().substring(5, 7);
    }

    public void setDb2Mm(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 5, 7));
    }

    public String getDb2Streep2() {
        return getDb2FormatTs().substring(7, 8);
    }

    public void setDb2Streep2(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 7, 8));
    }

    public String getDb2Dd() {
        return getDb2FormatTs().substring(8, 10);
    }

    public void setDb2Dd(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 8, 10));
    }

    public String getDb2Streep3() {
        return getDb2FormatTs().substring(10, 11);
    }

    public void setDb2Streep3(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 10, 11));
    }

    public String getDb2Hh() {
        return getDb2FormatTs().substring(11, 13);
    }

    public void setDb2Hh(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 11, 13));
    }

    public String getDb2Dot1() {
        return getDb2FormatTs().substring(13, 14);
    }

    public void setDb2Dot1(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 13, 14));
    }

    public String getDb2Min() {
        return getDb2FormatTs().substring(14, 16);
    }

    public void setDb2Min(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 14, 16));
    }

    public String getDb2Dot2() {
        return getDb2FormatTs().substring(16, 17);
    }

    public void setDb2Dot2(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 16, 17));
    }

    public String getDb2Ss() {
        return getDb2FormatTs().substring(17, 19);
    }

    public void setDb2Ss(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 17, 19));
    }

    public String getDb2Dot3() {
        return getDb2FormatTs().substring(19, 20);
    }

    public void setDb2Dot3(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 19, 20));
    }

    public int getDb2Mil() {
        try {
            return (int) DataConverter.convZonedStringToLong(getDb2FormatTs()
                    .substring(20, 22), 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setDb2Mil(int source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(),
                DataConverter.convZonedLongToString(source, 2), 20, 22));
    }

    public String getDb2Rest() {
        return getDb2FormatTs().substring(22);
    }

    public void setDb2Rest(String source) {
        setDb2FormatTs(StringUtils.overlay(getDb2FormatTs(), source, 22, 26));
    }

    // [T-Up#INFO][CBTRN02C.cbl, LINE #199] REJECT-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cRejectRecord rejectRecord = new Cbtrn02cRejectRecord();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #203] WS-VALIDATION-TRAILER (level: 1)
    private @Getter @Setter Cbtrn02cWsValidationTrailer wsValidationTrailer = new Cbtrn02cWsValidationTrailer();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #207] WS-COUNTERS (level: 1)
    private @Getter @Setter Cbtrn02cWsCounters wsCounters = new Cbtrn02cWsCounters();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #212] WS-FLAGS (level: 1)
    private @Getter @Setter Cbtrn02cWsFlags wsFlags = new Cbtrn02cWsFlags();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #67] FD-TRAN-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cFdTranRecord fdTranRecord = new Cbtrn02cFdTranRecord();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #72] FD-TRANFILE-REC (level: 1)
    private @Getter @Setter Cbtrn02cFdTranfileRec fdTranfileRec = new Cbtrn02cFdTranfileRec();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #89] FD-XREFFILE-REC (level: 1)
    private @Getter @Setter Cbtrn02cFdXreffileRec fdXreffileRec = new Cbtrn02cFdXreffileRec();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #94] FD-REJS-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cFdRejsRecord fdRejsRecord = new Cbtrn02cFdRejsRecord();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #99] FD-ACCTFILE-REC (level: 1)
    private @Getter @Setter Cbtrn02cFdAcctfileRec fdAcctfileRec = new Cbtrn02cFdAcctfileRec();
    // [T-Up#INFO][CBTRN02C.cbl, LINE #115] FD-TRAN-CAT-BAL-RECORD (level: 1)
    private @Getter @Setter Cbtrn02cFdTranCatBalRecord fdTranCatBalRecord = new Cbtrn02cFdTranCatBalRecord();

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class Cbtrn02cTwoBytesAlpha {
        // [T-Up#INFO][CBTRN02C.cbl, LINE #159] TWO-BYTES-LEFT (level: 5)
        private @Getter String twoBytesLeft = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #160] TWO-BYTES-RIGHT (level: 5)
        private @Getter String twoBytesRight = StringUtils.repeat(' ', 1);

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(twoBytesLeft);
            sb.append(twoBytesRight);
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _OFFILLER1 {
        // [T-Up#INFO][CBTRN02C.cbl, LINE #184] DB2-YYYY (level: 6)
        private @Getter String db2Yyyy = StringUtils.repeat(' ', 4);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #185] DB2-STREEP-1 (level: 6)
        private @Getter String db2Streep1 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #186] DB2-MM (level: 6)
        private @Getter String db2Mm = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #187] DB2-STREEP-2 (level: 6)
        private @Getter String db2Streep2 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #188] DB2-DD (level: 6)
        private @Getter String db2Dd = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #189] DB2-STREEP-3 (level: 6)
        private @Getter String db2Streep3 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #190] DB2-HH (level: 6)
        private @Getter String db2Hh = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #191] DB2-DOT-1 (level: 6)
        private @Getter String db2Dot1 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #192] DB2-MIN (level: 6)
        private @Getter String db2Min = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #193] DB2-DOT-2 (level: 6)
        private @Getter String db2Dot2 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #194] DB2-SS (level: 6)
        private @Getter String db2Ss = StringUtils.repeat(' ', 2);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #195] DB2-DOT-3 (level: 6)
        private @Getter String db2Dot3 = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBTRN02C.cbl, LINE #196] DB2-MIL (level: 6)
        private @Getter @Setter int db2Mil;
        // [T-Up#INFO][CBTRN02C.cbl, LINE #197] DB2-REST (level: 6)
        private @Getter String db2Rest = StringUtils.repeat(' ', 4);

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(db2Yyyy);
            sb.append(db2Streep1);
            sb.append(db2Mm);
            sb.append(db2Streep2);
            sb.append(db2Dd);
            sb.append(db2Streep3);
            sb.append(db2Hh);
            sb.append(db2Dot1);
            sb.append(db2Min);
            sb.append(db2Dot2);
            sb.append(db2Ss);
            sb.append(db2Dot3);
            sb.append(String.valueOf(db2Mil));
            sb.append(db2Rest);
            return sb.toString();
        }
    }

    public void setEndOfFile(String source) {
        endOfFile = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setDb2FormatTs(String source) {
        db2FormatTs = StringUtils
                .truncate(StringUtils.rightPad(source, 26), 26);
    }
}
