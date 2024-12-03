package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoDalytranPsDto;

@Mapper
public interface AwsM2CarddemoDalytranPsDao {
	@Results(id = "AwsM2CarddemoDalytranPsDto", value = {
		@Result(property = "seqId", column = "SEQ_ID"),
		@Result(property = "fdTranId", column = "FD_TRAN_ID"),
		@Result(property = "fdCustData", column = "FD_CUST_DATA")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId}")
	Cursor<AwsM2CarddemoDalytranPsDto> readEq(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readGt(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readGe(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readLt(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readLe(@Param("seqId") Long seqId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYTRAN_PS(SEQ_ID,FD_TRAN_ID,FD_CUST_DATA) " +
			"VALUES(AWS_M2_CARDDEMO_DALYTRAN_PS_seq.nextval,#{fdTranId},#{fdCustData})")
	int write(@Param("fdTranId") String fdTranId, @Param("fdCustData") String fdCustData);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYTRAN_PS SET FD_TRAN_ID= #{fdTranId},FD_CUST_DATA= #{fdCustData} " +
			" WHERE SEQ_ID = #{seqId}")
	int rewrite(@Param("fdTranId") String fdTranId, @Param("fdCustData") String fdCustData, @Param("seqId") Long seqId);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId}")
	int delete(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId}")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeDto(AwsM2CarddemoDalytranPsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYTRAN_PS(SEQ_ID,FD_TRAN_ID,FD_CUST_DATA) " +
			"VALUES(AWS_M2_CARDDEMO_DALYTRAN_PS_seq.nextval,#{fdTranId},#{fdCustData})")
	int writeDto(AwsM2CarddemoDalytranPsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYTRAN_PS SET FD_TRAN_ID= #{fdTranId},FD_CUST_DATA= #{fdCustData} " +
			" WHERE SEQ_ID = #{seqId}")
	int rewriteDto(AwsM2CarddemoDalytranPsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYTRAN_PS SET FD_TRAN_ID= #{param2.fdTranId},FD_CUST_DATA= #{param2.fdCustData} " +
			" WHERE SEQ_ID = #{param1}")
	int rewriteDtoWithKey(Long seqId, AwsM2CarddemoDalytranPsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId}")
	int deleteDto(AwsM2CarddemoDalytranPsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYTRAN_PS(SEQ_ID,FD_TRAN_ID,FD_CUST_DATA) " +
			"VALUES(AWS_M2_CARDDEMO_DALYTRAN_PS_seq.nextval,#{fdTranId},#{fdCustData})")
	@SelectKey(statement = "SELECT AWS_M2_CARDDEMO_DALYTRAN_PS_SEQ.CURRVAL FROM DUAL", keyProperty = "seqId", before = false, resultType = int.class)
	int writeDtoReturnLastKey(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdate(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdate(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdate(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdate(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdate(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdateDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdateDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdateDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdateDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdateDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdateNoWait(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdateNoWait(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdateNoWait(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdateNoWait(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdateNoWait(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdateInf(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdateInf(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdateInf(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdateInf(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdateInf(@Param("seqId") Long seqId);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readEqForUpdateInfDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readGtForUpdateInfDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readGeForUpdateInfDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readLtForUpdateInfDto(AwsM2CarddemoDalytranPsDto dto);
	
	@ResultMap("AwsM2CarddemoDalytranPsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYTRAN_PS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalytranPsDto> readLeForUpdateInfDto(AwsM2CarddemoDalytranPsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}