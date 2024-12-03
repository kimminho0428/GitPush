package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoSystranDto;

@Mapper
public interface AwsM2CarddemoSystranDao {
	@Results(id = "AwsM2CarddemoSystranDto", value = {
		@Result(property = "fdTransId", column = "FD_TRANS_ID"),
		@Result(property = "fdAcctData", column = "FD_ACCT_DATA")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	Cursor<AwsM2CarddemoSystranDto> readEq(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGt(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGe(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLt(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLe(@Param("fdTransId") String fdTransId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_SYSTRAN(FD_TRANS_ID,FD_ACCT_DATA) " +
			"VALUES(#{fdTransId},#{fdAcctData})")
	int write(@Param("fdTransId") String fdTransId, @Param("fdAcctData") String fdAcctData);
	
	@Update("UPDATE AWS_M2_CARDDEMO_SYSTRAN SET FD_ACCT_DATA= #{fdAcctData} " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	int rewrite(@Param("fdTransId") String fdTransId, @Param("fdAcctData") String fdAcctData);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	int delete(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	Cursor<AwsM2CarddemoSystranDto> readEqDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGtDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGeDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLtDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLeDto(AwsM2CarddemoSystranDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_SYSTRAN(FD_TRANS_ID,FD_ACCT_DATA) " +
			"VALUES(#{fdTransId},#{fdAcctData})")
	int writeDto(AwsM2CarddemoSystranDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_SYSTRAN SET FD_ACCT_DATA= #{fdAcctData} " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	int rewriteDto(AwsM2CarddemoSystranDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_SYSTRAN SET FD_ACCT_DATA= #{param2.fdAcctData} " +
			" WHERE FD_TRANS_ID = #{param1}")
	int rewriteDtoWithKey(String fdTransId, AwsM2CarddemoSystranDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	int deleteDto(AwsM2CarddemoSystranDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_SYSTRAN(FD_TRANS_ID,FD_ACCT_DATA) " +
			"VALUES(#{fdTransId},#{fdAcctData})")
	int writeDtoReturnLastKey(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readEqForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGtForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGeForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLtForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLeForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdate(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdateNoWait(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdateInf(@Param("fdTransId") String fdTransId);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId}")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1Dto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1Dto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1Dto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1Dto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1Dto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdateDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE FD_TRANS_ID = #{fdTransId} FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) > ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) >= ( #{fdTransId}) ORDER BY FD_TRANS_ID FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) < ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@ResultMap("AwsM2CarddemoSystranDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_SYSTRAN " +
			" WHERE (FD_TRANS_ID) <= ( #{fdTransId}) ORDER BY FD_TRANS_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoSystranDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoSystranDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}