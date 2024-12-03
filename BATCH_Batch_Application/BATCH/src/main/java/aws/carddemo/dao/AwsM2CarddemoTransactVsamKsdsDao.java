package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoTransactVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoTransactVsamKsdsDao {
	@Results(id = "AwsM2CarddemoTransactVsamKsdsDto", value = {
		@Result(property = "tranId", column = "TRAN_ID"),
		@Result(property = "tranTypeCd", column = "TRAN_TYPE_CD"),
		@Result(property = "tranCatCd", column = "TRAN_CAT_CD"),
		@Result(property = "tranSource", column = "TRAN_SOURCE"),
		@Result(property = "tranDesc", column = "TRAN_DESC"),
		@Result(property = "tranAmt", column = "TRAN_AMT"),
		@Result(property = "tranMerchantId", column = "TRAN_MERCHANT_ID"),
		@Result(property = "tranMerchantName", column = "TRAN_MERCHANT_NAME"),
		@Result(property = "tranMerchantCity", column = "TRAN_MERCHANT_CITY"),
		@Result(property = "tranMerchantZip", column = "TRAN_MERCHANT_ZIP"),
		@Result(property = "tranCardNum", column = "TRAN_CARD_NUM"),
		@Result(property = "tranOrigTs", column = "TRAN_ORIG_TS"),
		@Result(property = "tranProcTs", column = "TRAN_PROC_TS"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEq(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGt(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGe(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLt(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLe(@Param("tranId") String tranId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS(TRAN_ID,TRAN_TYPE_CD,TRAN_CAT_CD,TRAN_SOURCE,TRAN_DESC,TRAN_AMT,TRAN_MERCHANT_ID,TRAN_MERCHANT_NAME,TRAN_MERCHANT_CITY,TRAN_MERCHANT_ZIP,TRAN_CARD_NUM,TRAN_ORIG_TS,TRAN_PROC_TS,FILLER) " +
			"VALUES(#{tranId},#{tranTypeCd},#{tranCatCd},#{tranSource},#{tranDesc},#{tranAmt},#{tranMerchantId},#{tranMerchantName},#{tranMerchantCity},#{tranMerchantZip},#{tranCardNum},#{tranOrigTs},#{tranProcTs},#{filler})")
	int write(@Param("tranId") String tranId, @Param("tranTypeCd") String tranTypeCd, @Param("tranCatCd") BigDecimal tranCatCd, @Param("tranSource") String tranSource, @Param("tranDesc") String tranDesc, @Param("tranAmt") BigDecimal tranAmt, @Param("tranMerchantId") BigDecimal tranMerchantId, @Param("tranMerchantName") String tranMerchantName, @Param("tranMerchantCity") String tranMerchantCity, @Param("tranMerchantZip") String tranMerchantZip, @Param("tranCardNum") String tranCardNum, @Param("tranOrigTs") String tranOrigTs, @Param("tranProcTs") String tranProcTs, @Param("filler") String filler);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS SET TRAN_TYPE_CD= #{tranTypeCd},TRAN_CAT_CD= #{tranCatCd},TRAN_SOURCE= #{tranSource},TRAN_DESC= #{tranDesc},TRAN_AMT= #{tranAmt},TRAN_MERCHANT_ID= #{tranMerchantId},TRAN_MERCHANT_NAME= #{tranMerchantName},TRAN_MERCHANT_CITY= #{tranMerchantCity},TRAN_MERCHANT_ZIP= #{tranMerchantZip},TRAN_CARD_NUM= #{tranCardNum},TRAN_ORIG_TS= #{tranOrigTs},TRAN_PROC_TS= #{tranProcTs},FILLER= #{filler} " +
			" WHERE TRAN_ID = #{tranId}")
	int rewrite(@Param("tranId") String tranId, @Param("tranTypeCd") String tranTypeCd, @Param("tranCatCd") BigDecimal tranCatCd, @Param("tranSource") String tranSource, @Param("tranDesc") String tranDesc, @Param("tranAmt") BigDecimal tranAmt, @Param("tranMerchantId") BigDecimal tranMerchantId, @Param("tranMerchantName") String tranMerchantName, @Param("tranMerchantCity") String tranMerchantCity, @Param("tranMerchantZip") String tranMerchantZip, @Param("tranCardNum") String tranCardNum, @Param("tranOrigTs") String tranOrigTs, @Param("tranProcTs") String tranProcTs, @Param("filler") String filler);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	int delete(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS(TRAN_ID,TRAN_TYPE_CD,TRAN_CAT_CD,TRAN_SOURCE,TRAN_DESC,TRAN_AMT,TRAN_MERCHANT_ID,TRAN_MERCHANT_NAME,TRAN_MERCHANT_CITY,TRAN_MERCHANT_ZIP,TRAN_CARD_NUM,TRAN_ORIG_TS,TRAN_PROC_TS,FILLER) " +
			"VALUES(#{tranId},#{tranTypeCd},#{tranCatCd},#{tranSource},#{tranDesc},#{tranAmt},#{tranMerchantId},#{tranMerchantName},#{tranMerchantCity},#{tranMerchantZip},#{tranCardNum},#{tranOrigTs},#{tranProcTs},#{filler})")
	int writeDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS SET TRAN_TYPE_CD= #{tranTypeCd},TRAN_CAT_CD= #{tranCatCd},TRAN_SOURCE= #{tranSource},TRAN_DESC= #{tranDesc},TRAN_AMT= #{tranAmt},TRAN_MERCHANT_ID= #{tranMerchantId},TRAN_MERCHANT_NAME= #{tranMerchantName},TRAN_MERCHANT_CITY= #{tranMerchantCity},TRAN_MERCHANT_ZIP= #{tranMerchantZip},TRAN_CARD_NUM= #{tranCardNum},TRAN_ORIG_TS= #{tranOrigTs},TRAN_PROC_TS= #{tranProcTs},FILLER= #{filler} " +
			" WHERE TRAN_ID = #{tranId}")
	int rewriteDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS SET TRAN_TYPE_CD= #{param2.tranTypeCd},TRAN_CAT_CD= #{param2.tranCatCd},TRAN_SOURCE= #{param2.tranSource},TRAN_DESC= #{param2.tranDesc},TRAN_AMT= #{param2.tranAmt},TRAN_MERCHANT_ID= #{param2.tranMerchantId},TRAN_MERCHANT_NAME= #{param2.tranMerchantName},TRAN_MERCHANT_CITY= #{param2.tranMerchantCity},TRAN_MERCHANT_ZIP= #{param2.tranMerchantZip},TRAN_CARD_NUM= #{param2.tranCardNum},TRAN_ORIG_TS= #{param2.tranOrigTs},TRAN_PROC_TS= #{param2.tranProcTs},FILLER= #{param2.filler} " +
			" WHERE TRAN_ID = #{param1}")
	int rewriteDtoWithKey(String tranId, AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	int deleteDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS(TRAN_ID,TRAN_TYPE_CD,TRAN_CAT_CD,TRAN_SOURCE,TRAN_DESC,TRAN_AMT,TRAN_MERCHANT_ID,TRAN_MERCHANT_NAME,TRAN_MERCHANT_CITY,TRAN_MERCHANT_ZIP,TRAN_CARD_NUM,TRAN_ORIG_TS,TRAN_PROC_TS,FILLER) " +
			"VALUES(#{tranId},#{tranTypeCd},#{tranCatCd},#{tranSource},#{tranDesc},#{tranAmt},#{tranMerchantId},#{tranMerchantName},#{tranMerchantCity},#{tranMerchantZip},#{tranCardNum},#{tranOrigTs},#{tranProcTs},#{filler})")
	int writeDtoReturnLastKey(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdate(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("tranId") String tranId);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId}")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE TRAN_ID = #{tranId} FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) > ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) >= ( #{tranId}) ORDER BY TRAN_ID FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) < ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoTransactVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_TRANSACT_VSAM_KSDS " +
			" WHERE (TRAN_ID) <= ( #{tranId}) ORDER BY TRAN_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoTransactVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoTransactVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}