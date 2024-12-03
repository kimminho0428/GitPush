package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoCardxrefVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCardxrefVsamKsdsDao extends AwsM2CarddemoCardxrefVsamAixDao {
	@Results(id = "AwsM2CarddemoCardxrefVsamKsdsDto", value = {
		@Result(property = "xrefCardNum", column = "XREF_CARD_NUM"),
		@Result(property = "xrefCustId", column = "XREF_CUST_ID"),
		@Result(property = "xrefAcctId", column = "XREF_ACCT_ID"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEq(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGt(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGe(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLt(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLe(@Param("xrefCardNum") String xrefCardNum);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS(XREF_CARD_NUM,XREF_CUST_ID,XREF_ACCT_ID,FILLER) " +
			"VALUES(#{xrefCardNum},#{xrefCustId},#{xrefAcctId},#{filler})")
	int write(@Param("xrefCardNum") String xrefCardNum, @Param("xrefCustId") BigDecimal xrefCustId, @Param("xrefAcctId") BigDecimal xrefAcctId, @Param("filler") String filler);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS SET XREF_CUST_ID= #{xrefCustId},XREF_ACCT_ID= #{xrefAcctId},FILLER= #{filler} " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	int rewrite(@Param("xrefCardNum") String xrefCardNum, @Param("xrefCustId") BigDecimal xrefCustId, @Param("xrefAcctId") BigDecimal xrefAcctId, @Param("filler") String filler);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	int delete(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS(XREF_CARD_NUM,XREF_CUST_ID,XREF_ACCT_ID,FILLER) " +
			"VALUES(#{xrefCardNum},#{xrefCustId},#{xrefAcctId},#{filler})")
	int writeDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS SET XREF_CUST_ID= #{xrefCustId},XREF_ACCT_ID= #{xrefAcctId},FILLER= #{filler} " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	int rewriteDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS SET XREF_CUST_ID= #{param2.xrefCustId},XREF_ACCT_ID= #{param2.xrefAcctId},FILLER= #{param2.filler} " +
			" WHERE XREF_CARD_NUM = #{param1}")
	int rewriteDtoWithKey(String xrefCardNum, AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	int deleteDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS(XREF_CARD_NUM,XREF_CUST_ID,XREF_ACCT_ID,FILLER) " +
			"VALUES(#{xrefCardNum},#{xrefCustId},#{xrefAcctId},#{filler})")
	int writeDtoReturnLastKey(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdate(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("xrefCardNum") String xrefCardNum);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_CARD_NUM = #{xrefCardNum} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) > ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) >= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) < ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCardxrefVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_CARD_NUM) <= ( #{xrefCardNum}) ORDER BY XREF_CARD_NUM DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}