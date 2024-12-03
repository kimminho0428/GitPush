package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoTcatbalfVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoTcatbalfVsamKsdsDao {
	@Results(id = "AwsM2CarddemoTcatbalfVsamKsdsDto", value = {
		@Result(property = "fdTrancatAcctId", column = "FD_TRANCAT_ACCT_ID"),
		@Result(property = "fdTrancatTypeCd", column = "FD_TRANCAT_TYPE_CD"),
		@Result(property = "fdTrancatCd", column = "FD_TRANCAT_CD"),
		@Result(property = "fdFdTranCatData", column = "FD_FD_TRAN_CAT_DATA")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEq(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGt(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGe(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLt(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLe(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS(FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD,FD_FD_TRAN_CAT_DATA) " +
			"VALUES(#{fdTrancatAcctId},#{fdTrancatTypeCd},#{fdTrancatCd},#{fdFdTranCatData})")
	int write(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd, @Param("fdFdTranCatData") String fdFdTranCatData);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS SET FD_FD_TRAN_CAT_DATA= #{fdFdTranCatData} " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	int rewrite(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd, @Param("fdFdTranCatData") String fdFdTranCatData);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	int delete(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS(FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD,FD_FD_TRAN_CAT_DATA) " +
			"VALUES(#{fdTrancatAcctId},#{fdTrancatTypeCd},#{fdTrancatCd},#{fdFdTranCatData})")
	int writeDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS SET FD_FD_TRAN_CAT_DATA= #{fdFdTranCatData} " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	int rewriteDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS SET FD_FD_TRAN_CAT_DATA= #{param4.fdFdTranCatData} " +
			" WHERE FD_TRANCAT_ACCT_ID = #{param1} AND FD_TRANCAT_TYPE_CD = #{param2} AND FD_TRANCAT_CD = #{param3}")
	int rewriteDtoWithKey(BigDecimal fdTrancatAcctId, String fdTrancatTypeCd, BigDecimal fdTrancatCd, AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	int deleteDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS(FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD,FD_FD_TRAN_CAT_DATA) " +
			"VALUES(#{fdTrancatAcctId},#{fdTrancatTypeCd},#{fdTrancatCd},#{fdFdTranCatData})")
	int writeDtoReturnLastKey(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdate(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdateNoWait(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdateInf(@Param("fdTrancatAcctId") BigDecimal fdTrancatAcctId, @Param("fdTrancatTypeCd") String fdTrancatTypeCd, @Param("fdTrancatCd") BigDecimal fdTrancatCd);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) > ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) >= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) < ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID) <= ( #{fdTrancatAcctId}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey2ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey2ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey2ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey2ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey2ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd}")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3Dto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdateDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdateNoWaitDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE FD_TRANCAT_ACCT_ID = #{fdTrancatAcctId} AND FD_TRANCAT_TYPE_CD = #{fdTrancatTypeCd} AND FD_TRANCAT_CD = #{fdTrancatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readEqByKey3ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) > ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGtByKey3ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) >= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readGeByKey3ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) < ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLtByKey3ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTcatbalfVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TCATBALF_VSAM_KSDS " +
			" WHERE (FD_TRANCAT_ACCT_ID,FD_TRANCAT_TYPE_CD,FD_TRANCAT_CD) <= ( #{fdTrancatAcctId}, #{fdTrancatTypeCd}, #{fdTrancatCd}) ORDER BY FD_TRANCAT_ACCT_ID DESC,FD_TRANCAT_TYPE_CD DESC,FD_TRANCAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTcatbalfVsamKsdsDto> readLeByKey3ForUpdateInfDto(AwsM2CarddemoTcatbalfVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}