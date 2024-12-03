package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoCardxrefVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCardxrefVsamAixDao {
	@Results(id = "Aix10", value = {
		@Result(property = "xrefCardNum", column = "XREF_CARD_NUM"),
		@Result(property = "xrefCustId", column = "XREF_CUST_ID"),
		@Result(property = "xrefAcctId", column = "XREF_ACCT_ID"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllAscAix10();
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllDescAix10();
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1Aix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1Aix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1Aix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1Aix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1Aix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWaitAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInfAix10(@Param("xrefAcctId") BigDecimal xrefAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1DtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1DtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1DtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1DtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1DtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
}