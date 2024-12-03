package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoUsrsecVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoUsrsecVsamKsdsDao {
	@Results(id = "AwsM2CarddemoUsrsecVsamKsdsDto", value = {
		@Result(property = "secUsrId", column = "SEC_USR_ID"),
		@Result(property = "secUsrFname", column = "SEC_USR_FNAME"),
		@Result(property = "secUsrLname", column = "SEC_USR_LNAME"),
		@Result(property = "secUsrPwd", column = "SEC_USR_PWD"),
		@Result(property = "secUsrType", column = "SEC_USR_TYPE"),
		@Result(property = "secUsrFiller", column = "SEC_USR_FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEq(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGt(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGe(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLt(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLe(@Param("secUsrId") String secUsrId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS(SEC_USR_ID,SEC_USR_FNAME,SEC_USR_LNAME,SEC_USR_PWD,SEC_USR_TYPE,SEC_USR_FILLER) " +
			"VALUES(#{secUsrId},#{secUsrFname},#{secUsrLname},#{secUsrPwd},#{secUsrType},#{secUsrFiller})")
	int write(@Param("secUsrId") String secUsrId, @Param("secUsrFname") String secUsrFname, @Param("secUsrLname") String secUsrLname, @Param("secUsrPwd") String secUsrPwd, @Param("secUsrType") String secUsrType, @Param("secUsrFiller") String secUsrFiller);
	
	@Update("UPDATE AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS SET SEC_USR_FNAME= #{secUsrFname},SEC_USR_LNAME= #{secUsrLname},SEC_USR_PWD= #{secUsrPwd},SEC_USR_TYPE= #{secUsrType},SEC_USR_FILLER= #{secUsrFiller} " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	int rewrite(@Param("secUsrId") String secUsrId, @Param("secUsrFname") String secUsrFname, @Param("secUsrLname") String secUsrLname, @Param("secUsrPwd") String secUsrPwd, @Param("secUsrType") String secUsrType, @Param("secUsrFiller") String secUsrFiller);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	int delete(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS(SEC_USR_ID,SEC_USR_FNAME,SEC_USR_LNAME,SEC_USR_PWD,SEC_USR_TYPE,SEC_USR_FILLER) " +
			"VALUES(#{secUsrId},#{secUsrFname},#{secUsrLname},#{secUsrPwd},#{secUsrType},#{secUsrFiller})")
	int writeDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS SET SEC_USR_FNAME= #{secUsrFname},SEC_USR_LNAME= #{secUsrLname},SEC_USR_PWD= #{secUsrPwd},SEC_USR_TYPE= #{secUsrType},SEC_USR_FILLER= #{secUsrFiller} " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	int rewriteDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS SET SEC_USR_FNAME= #{param2.secUsrFname},SEC_USR_LNAME= #{param2.secUsrLname},SEC_USR_PWD= #{param2.secUsrPwd},SEC_USR_TYPE= #{param2.secUsrType},SEC_USR_FILLER= #{param2.secUsrFiller} " +
			" WHERE SEC_USR_ID = #{param1}")
	int rewriteDtoWithKey(String secUsrId, AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	int deleteDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS(SEC_USR_ID,SEC_USR_FNAME,SEC_USR_LNAME,SEC_USR_PWD,SEC_USR_TYPE,SEC_USR_FILLER) " +
			"VALUES(#{secUsrId},#{secUsrFname},#{secUsrLname},#{secUsrPwd},#{secUsrType},#{secUsrFiller})")
	int writeDtoReturnLastKey(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdate(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("secUsrId") String secUsrId);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId}")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE SEC_USR_ID = #{secUsrId} FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) > ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) >= ( #{secUsrId}) ORDER BY SEC_USR_ID FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) < ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoUsrsecVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_USRSEC_VSAM_KSDS " +
			" WHERE (SEC_USR_ID) <= ( #{secUsrId}) ORDER BY SEC_USR_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoUsrsecVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoUsrsecVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}