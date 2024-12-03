package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoAcctdataVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoAcctdataVsamKsdsDao {
	@Results(id = "AwsM2CarddemoAcctdataVsamKsdsDto", value = {
		@Result(property = "acctId", column = "ACCT_ID"),
		@Result(property = "acctActiveStatus", column = "ACCT_ACTIVE_STATUS"),
		@Result(property = "acctCurrBal", column = "ACCT_CURR_BAL"),
		@Result(property = "acctCreditLimit", column = "ACCT_CREDIT_LIMIT"),
		@Result(property = "acctCashCreditLimit", column = "ACCT_CASH_CREDIT_LIMIT"),
		@Result(property = "acctOpenDate", column = "ACCT_OPEN_DATE"),
		@Result(property = "acctExpiraionDate", column = "ACCT_EXPIRAION_DATE"),
		@Result(property = "acctReissueDate", column = "ACCT_REISSUE_DATE"),
		@Result(property = "acctCurrCycCredit", column = "ACCT_CURR_CYC_CREDIT"),
		@Result(property = "acctCurrCycDebit", column = "ACCT_CURR_CYC_DEBIT"),
		@Result(property = "acctAddrZip", column = "ACCT_ADDR_ZIP"),
		@Result(property = "acctGroupId", column = "ACCT_GROUP_ID"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEq(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGt(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGe(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLt(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLe(@Param("acctId") BigDecimal acctId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS(ACCT_ID,ACCT_ACTIVE_STATUS,ACCT_CURR_BAL,ACCT_CREDIT_LIMIT,ACCT_CASH_CREDIT_LIMIT,ACCT_OPEN_DATE,ACCT_EXPIRAION_DATE,ACCT_REISSUE_DATE,ACCT_CURR_CYC_CREDIT,ACCT_CURR_CYC_DEBIT,ACCT_ADDR_ZIP,ACCT_GROUP_ID,FILLER) " +
			"VALUES(#{acctId},#{acctActiveStatus},#{acctCurrBal},#{acctCreditLimit},#{acctCashCreditLimit},#{acctOpenDate},#{acctExpiraionDate},#{acctReissueDate},#{acctCurrCycCredit},#{acctCurrCycDebit},#{acctAddrZip},#{acctGroupId},#{filler})")
	int write(@Param("acctId") BigDecimal acctId, @Param("acctActiveStatus") String acctActiveStatus, @Param("acctCurrBal") BigDecimal acctCurrBal, @Param("acctCreditLimit") BigDecimal acctCreditLimit, @Param("acctCashCreditLimit") BigDecimal acctCashCreditLimit, @Param("acctOpenDate") String acctOpenDate, @Param("acctExpiraionDate") String acctExpiraionDate, @Param("acctReissueDate") String acctReissueDate, @Param("acctCurrCycCredit") BigDecimal acctCurrCycCredit, @Param("acctCurrCycDebit") BigDecimal acctCurrCycDebit, @Param("acctAddrZip") String acctAddrZip, @Param("acctGroupId") String acctGroupId, @Param("filler") String filler);
	
	@Update("UPDATE AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS SET ACCT_ACTIVE_STATUS= #{acctActiveStatus},ACCT_CURR_BAL= #{acctCurrBal},ACCT_CREDIT_LIMIT= #{acctCreditLimit},ACCT_CASH_CREDIT_LIMIT= #{acctCashCreditLimit},ACCT_OPEN_DATE= #{acctOpenDate},ACCT_EXPIRAION_DATE= #{acctExpiraionDate},ACCT_REISSUE_DATE= #{acctReissueDate},ACCT_CURR_CYC_CREDIT= #{acctCurrCycCredit},ACCT_CURR_CYC_DEBIT= #{acctCurrCycDebit},ACCT_ADDR_ZIP= #{acctAddrZip},ACCT_GROUP_ID= #{acctGroupId},FILLER= #{filler} " +
			" WHERE ACCT_ID = #{acctId}")
	int rewrite(@Param("acctId") BigDecimal acctId, @Param("acctActiveStatus") String acctActiveStatus, @Param("acctCurrBal") BigDecimal acctCurrBal, @Param("acctCreditLimit") BigDecimal acctCreditLimit, @Param("acctCashCreditLimit") BigDecimal acctCashCreditLimit, @Param("acctOpenDate") String acctOpenDate, @Param("acctExpiraionDate") String acctExpiraionDate, @Param("acctReissueDate") String acctReissueDate, @Param("acctCurrCycCredit") BigDecimal acctCurrCycCredit, @Param("acctCurrCycDebit") BigDecimal acctCurrCycDebit, @Param("acctAddrZip") String acctAddrZip, @Param("acctGroupId") String acctGroupId, @Param("filler") String filler);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	int delete(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS(ACCT_ID,ACCT_ACTIVE_STATUS,ACCT_CURR_BAL,ACCT_CREDIT_LIMIT,ACCT_CASH_CREDIT_LIMIT,ACCT_OPEN_DATE,ACCT_EXPIRAION_DATE,ACCT_REISSUE_DATE,ACCT_CURR_CYC_CREDIT,ACCT_CURR_CYC_DEBIT,ACCT_ADDR_ZIP,ACCT_GROUP_ID,FILLER) " +
			"VALUES(#{acctId},#{acctActiveStatus},#{acctCurrBal},#{acctCreditLimit},#{acctCashCreditLimit},#{acctOpenDate},#{acctExpiraionDate},#{acctReissueDate},#{acctCurrCycCredit},#{acctCurrCycDebit},#{acctAddrZip},#{acctGroupId},#{filler})")
	int writeDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS SET ACCT_ACTIVE_STATUS= #{acctActiveStatus},ACCT_CURR_BAL= #{acctCurrBal},ACCT_CREDIT_LIMIT= #{acctCreditLimit},ACCT_CASH_CREDIT_LIMIT= #{acctCashCreditLimit},ACCT_OPEN_DATE= #{acctOpenDate},ACCT_EXPIRAION_DATE= #{acctExpiraionDate},ACCT_REISSUE_DATE= #{acctReissueDate},ACCT_CURR_CYC_CREDIT= #{acctCurrCycCredit},ACCT_CURR_CYC_DEBIT= #{acctCurrCycDebit},ACCT_ADDR_ZIP= #{acctAddrZip},ACCT_GROUP_ID= #{acctGroupId},FILLER= #{filler} " +
			" WHERE ACCT_ID = #{acctId}")
	int rewriteDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS SET ACCT_ACTIVE_STATUS= #{param2.acctActiveStatus},ACCT_CURR_BAL= #{param2.acctCurrBal},ACCT_CREDIT_LIMIT= #{param2.acctCreditLimit},ACCT_CASH_CREDIT_LIMIT= #{param2.acctCashCreditLimit},ACCT_OPEN_DATE= #{param2.acctOpenDate},ACCT_EXPIRAION_DATE= #{param2.acctExpiraionDate},ACCT_REISSUE_DATE= #{param2.acctReissueDate},ACCT_CURR_CYC_CREDIT= #{param2.acctCurrCycCredit},ACCT_CURR_CYC_DEBIT= #{param2.acctCurrCycDebit},ACCT_ADDR_ZIP= #{param2.acctAddrZip},ACCT_GROUP_ID= #{param2.acctGroupId},FILLER= #{param2.filler} " +
			" WHERE ACCT_ID = #{param1}")
	int rewriteDtoWithKey(BigDecimal acctId, AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	int deleteDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS(ACCT_ID,ACCT_ACTIVE_STATUS,ACCT_CURR_BAL,ACCT_CREDIT_LIMIT,ACCT_CASH_CREDIT_LIMIT,ACCT_OPEN_DATE,ACCT_EXPIRAION_DATE,ACCT_REISSUE_DATE,ACCT_CURR_CYC_CREDIT,ACCT_CURR_CYC_DEBIT,ACCT_ADDR_ZIP,ACCT_GROUP_ID,FILLER) " +
			"VALUES(#{acctId},#{acctActiveStatus},#{acctCurrBal},#{acctCreditLimit},#{acctCashCreditLimit},#{acctOpenDate},#{acctExpiraionDate},#{acctReissueDate},#{acctCurrCycCredit},#{acctCurrCycDebit},#{acctAddrZip},#{acctGroupId},#{filler})")
	int writeDtoReturnLastKey(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdate(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("acctId") BigDecimal acctId);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId}")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE ACCT_ID = #{acctId} FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) > ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) >= ( #{acctId}) ORDER BY ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) < ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoAcctdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_ACCTDATA_VSAM_KSDS " +
			" WHERE (ACCT_ID) <= ( #{acctId}) ORDER BY ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoAcctdataVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoAcctdataVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}