package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoDiscgrpVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoDiscgrpVsamKsdsDao {
	@Results(id = "AwsM2CarddemoDiscgrpVsamKsdsDto", value = {
		@Result(property = "fdDisAcctGroupId", column = "FD_DIS_ACCT_GROUP_ID"),
		@Result(property = "fdDisTranTypeCd", column = "FD_DIS_TRAN_TYPE_CD"),
		@Result(property = "fdDisTranCatCd", column = "FD_DIS_TRAN_CAT_CD"),
		@Result(property = "fdDiscgrpData", column = "FD_DISCGRP_DATA")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEq(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGt(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGe(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLt(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLe(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS(FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD,FD_DISCGRP_DATA) " +
			"VALUES(#{fdDisAcctGroupId},#{fdDisTranTypeCd},#{fdDisTranCatCd},#{fdDiscgrpData})")
	int write(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd, @Param("fdDiscgrpData") String fdDiscgrpData);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS SET FD_DISCGRP_DATA= #{fdDiscgrpData} " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	int rewrite(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd, @Param("fdDiscgrpData") String fdDiscgrpData);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	int delete(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS(FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD,FD_DISCGRP_DATA) " +
			"VALUES(#{fdDisAcctGroupId},#{fdDisTranTypeCd},#{fdDisTranCatCd},#{fdDiscgrpData})")
	int writeDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS SET FD_DISCGRP_DATA= #{fdDiscgrpData} " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	int rewriteDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS SET FD_DISCGRP_DATA= #{param4.fdDiscgrpData} " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{param1} AND FD_DIS_TRAN_TYPE_CD = #{param2} AND FD_DIS_TRAN_CAT_CD = #{param3}")
	int rewriteDtoWithKey(String fdDisAcctGroupId, String fdDisTranTypeCd, BigDecimal fdDisTranCatCd, AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	int deleteDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS(FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD,FD_DISCGRP_DATA) " +
			"VALUES(#{fdDisAcctGroupId},#{fdDisTranTypeCd},#{fdDisTranCatCd},#{fdDiscgrpData})")
	int writeDtoReturnLastKey(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdate(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdateNoWait(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdateInf(@Param("fdDisAcctGroupId") String fdDisAcctGroupId, @Param("fdDisTranTypeCd") String fdDisTranTypeCd, @Param("fdDisTranCatCd") BigDecimal fdDisTranCatCd);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) > ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) >= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) < ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID) <= ( #{fdDisAcctGroupId}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey2ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey2ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey2ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey2ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey2ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd}")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3Dto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdateDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdateNoWaitDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE FD_DIS_ACCT_GROUP_ID = #{fdDisAcctGroupId} AND FD_DIS_TRAN_TYPE_CD = #{fdDisTranTypeCd} AND FD_DIS_TRAN_CAT_CD = #{fdDisTranCatCd} FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readEqByKey3ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) > ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGtByKey3ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) >= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readGeByKey3ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) < ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLtByKey3ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoDiscgrpVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DISCGRP_VSAM_KSDS " +
			" WHERE (FD_DIS_ACCT_GROUP_ID,FD_DIS_TRAN_TYPE_CD,FD_DIS_TRAN_CAT_CD) <= ( #{fdDisAcctGroupId}, #{fdDisTranTypeCd}, #{fdDisTranCatCd}) ORDER BY FD_DIS_ACCT_GROUP_ID DESC,FD_DIS_TRAN_TYPE_CD DESC,FD_DIS_TRAN_CAT_CD DESC FOR UPDATE")
	Cursor<AwsM2CarddemoDiscgrpVsamKsdsDto> readLeByKey3ForUpdateInfDto(AwsM2CarddemoDiscgrpVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}