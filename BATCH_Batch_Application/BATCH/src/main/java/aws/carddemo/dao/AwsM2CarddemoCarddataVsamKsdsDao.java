package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoCarddataVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCarddataVsamKsdsDao extends AwsM2CarddemoCarddataVsamAixDao {
	@Results(id = "AwsM2CarddemoCarddataVsamKsdsDto", value = {
		@Result(property = "cardNum", column = "CARD_NUM"),
		@Result(property = "cardAcctId", column = "CARD_ACCT_ID"),
		@Result(property = "cardCvvCd", column = "CARD_CVV_CD"),
		@Result(property = "cardEmbossedName", column = "CARD_EMBOSSED_NAME"),
		@Result(property = "cardExpiraionDate", column = "CARD_EXPIRAION_DATE"),
		@Result(property = "cardActiveStatus", column = "CARD_ACTIVE_STATUS"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEq(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGt(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGe(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLt(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLe(@Param("cardNum") String cardNum);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS(CARD_NUM,CARD_ACCT_ID,CARD_CVV_CD,CARD_EMBOSSED_NAME,CARD_EXPIRAION_DATE,CARD_ACTIVE_STATUS,FILLER) " +
			"VALUES(#{cardNum},#{cardAcctId},#{cardCvvCd},#{cardEmbossedName},#{cardExpiraionDate},#{cardActiveStatus},#{filler})")
	int write(@Param("cardNum") String cardNum, @Param("cardAcctId") BigDecimal cardAcctId, @Param("cardCvvCd") BigDecimal cardCvvCd, @Param("cardEmbossedName") String cardEmbossedName, @Param("cardExpiraionDate") String cardExpiraionDate, @Param("cardActiveStatus") String cardActiveStatus, @Param("filler") String filler);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS SET CARD_ACCT_ID= #{cardAcctId},CARD_CVV_CD= #{cardCvvCd},CARD_EMBOSSED_NAME= #{cardEmbossedName},CARD_EXPIRAION_DATE= #{cardExpiraionDate},CARD_ACTIVE_STATUS= #{cardActiveStatus},FILLER= #{filler} " +
			" WHERE CARD_NUM = #{cardNum}")
	int rewrite(@Param("cardNum") String cardNum, @Param("cardAcctId") BigDecimal cardAcctId, @Param("cardCvvCd") BigDecimal cardCvvCd, @Param("cardEmbossedName") String cardEmbossedName, @Param("cardExpiraionDate") String cardExpiraionDate, @Param("cardActiveStatus") String cardActiveStatus, @Param("filler") String filler);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	int delete(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS(CARD_NUM,CARD_ACCT_ID,CARD_CVV_CD,CARD_EMBOSSED_NAME,CARD_EXPIRAION_DATE,CARD_ACTIVE_STATUS,FILLER) " +
			"VALUES(#{cardNum},#{cardAcctId},#{cardCvvCd},#{cardEmbossedName},#{cardExpiraionDate},#{cardActiveStatus},#{filler})")
	int writeDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS SET CARD_ACCT_ID= #{cardAcctId},CARD_CVV_CD= #{cardCvvCd},CARD_EMBOSSED_NAME= #{cardEmbossedName},CARD_EXPIRAION_DATE= #{cardExpiraionDate},CARD_ACTIVE_STATUS= #{cardActiveStatus},FILLER= #{filler} " +
			" WHERE CARD_NUM = #{cardNum}")
	int rewriteDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS SET CARD_ACCT_ID= #{param2.cardAcctId},CARD_CVV_CD= #{param2.cardCvvCd},CARD_EMBOSSED_NAME= #{param2.cardEmbossedName},CARD_EXPIRAION_DATE= #{param2.cardExpiraionDate},CARD_ACTIVE_STATUS= #{param2.cardActiveStatus},FILLER= #{param2.filler} " +
			" WHERE CARD_NUM = #{param1}")
	int rewriteDtoWithKey(String cardNum, AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	int deleteDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS(CARD_NUM,CARD_ACCT_ID,CARD_CVV_CD,CARD_EMBOSSED_NAME,CARD_EXPIRAION_DATE,CARD_ACTIVE_STATUS,FILLER) " +
			"VALUES(#{cardNum},#{cardAcctId},#{cardCvvCd},#{cardEmbossedName},#{cardExpiraionDate},#{cardActiveStatus},#{filler})")
	int writeDtoReturnLastKey(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdate(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("cardNum") String cardNum);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_NUM = #{cardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) > ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) >= ( #{cardNum}) ORDER BY CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) < ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCarddataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_NUM) <= ( #{cardNum}) ORDER BY CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}