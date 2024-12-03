package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoCarddataVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCarddataVsamAixDao {
	@Results(id = "Aix11", value = {
		@Result(property = "cardNum", column = "CARD_NUM"),
		@Result(property = "cardAcctId", column = "CARD_ACCT_ID"),
		@Result(property = "cardCvvCd", column = "CARD_CVV_CD"),
		@Result(property = "cardEmbossedName", column = "CARD_EMBOSSED_NAME"),
		@Result(property = "cardExpiraionDate", column = "CARD_EXPIRAION_DATE"),
		@Result(property = "cardActiveStatus", column = "CARD_ACTIVE_STATUS"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllAscAix11();
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllDescAix11();
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1Aix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1Aix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1Aix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1Aix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1Aix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWaitAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInfAix11(@Param("cardAcctId") BigDecimal cardAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1DtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1DtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1DtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1DtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1DtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
}