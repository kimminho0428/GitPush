package aws.carddemo.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import aws.carddemo.dto.AwsM2CarddemoCustdataVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCustdataVsamKsdsDao {
	@Results(id = "AwsM2CarddemoCustdataVsamKsdsDto", value = {
		@Result(property = "custId", column = "CUST_ID"),
		@Result(property = "custFirstName", column = "CUST_FIRST_NAME"),
		@Result(property = "custMiddleName", column = "CUST_MIDDLE_NAME"),
		@Result(property = "custLastName", column = "CUST_LAST_NAME"),
		@Result(property = "custAddrLine1", column = "CUST_ADDR_LINE_1"),
		@Result(property = "custAddrLine2", column = "CUST_ADDR_LINE_2"),
		@Result(property = "custAddrLine3", column = "CUST_ADDR_LINE_3"),
		@Result(property = "custAddrStateCd", column = "CUST_ADDR_STATE_CD"),
		@Result(property = "custAddrCountryCd", column = "CUST_ADDR_COUNTRY_CD"),
		@Result(property = "custAddrZip", column = "CUST_ADDR_ZIP"),
		@Result(property = "custPhoneNum1", column = "CUST_PHONE_NUM_1"),
		@Result(property = "custPhoneNum2", column = "CUST_PHONE_NUM_2"),
		@Result(property = "custSsn", column = "CUST_SSN"),
		@Result(property = "custGovtIssuedId", column = "CUST_GOVT_ISSUED_ID"),
		@Result(property = "custDobYyyymmdd", column = "CUST_DOB_YYYYMMDD"),
		@Result(property = "custEftAccountId", column = "CUST_EFT_ACCOUNT_ID"),
		@Result(property = "custPriCardHolderInd", column = "CUST_PRI_CARD_HOLDER_IND"),
		@Result(property = "custFicoCreditScore", column = "CUST_FICO_CREDIT_SCORE"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEq(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGt(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGe(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLt(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLe(@Param("custId") BigDecimal custId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS(CUST_ID,CUST_FIRST_NAME,CUST_MIDDLE_NAME,CUST_LAST_NAME,CUST_ADDR_LINE_1,CUST_ADDR_LINE_2,CUST_ADDR_LINE_3,CUST_ADDR_STATE_CD,CUST_ADDR_COUNTRY_CD,CUST_ADDR_ZIP,CUST_PHONE_NUM_1,CUST_PHONE_NUM_2,CUST_SSN,CUST_GOVT_ISSUED_ID,CUST_DOB_YYYYMMDD,CUST_EFT_ACCOUNT_ID,CUST_PRI_CARD_HOLDER_IND,CUST_FICO_CREDIT_SCORE,FILLER) " +
			"VALUES(#{custId},#{custFirstName},#{custMiddleName},#{custLastName},#{custAddrLine1},#{custAddrLine2},#{custAddrLine3},#{custAddrStateCd},#{custAddrCountryCd},#{custAddrZip},#{custPhoneNum1},#{custPhoneNum2},#{custSsn},#{custGovtIssuedId},#{custDobYyyymmdd},#{custEftAccountId},#{custPriCardHolderInd},#{custFicoCreditScore},#{filler})")
	int write(@Param("custId") BigDecimal custId, @Param("custFirstName") String custFirstName, @Param("custMiddleName") String custMiddleName, @Param("custLastName") String custLastName, @Param("custAddrLine1") String custAddrLine1, @Param("custAddrLine2") String custAddrLine2, @Param("custAddrLine3") String custAddrLine3, @Param("custAddrStateCd") String custAddrStateCd, @Param("custAddrCountryCd") String custAddrCountryCd, @Param("custAddrZip") String custAddrZip, @Param("custPhoneNum1") String custPhoneNum1, @Param("custPhoneNum2") String custPhoneNum2, @Param("custSsn") BigDecimal custSsn, @Param("custGovtIssuedId") String custGovtIssuedId, @Param("custDobYyyymmdd") String custDobYyyymmdd, @Param("custEftAccountId") String custEftAccountId, @Param("custPriCardHolderInd") String custPriCardHolderInd, @Param("custFicoCreditScore") BigDecimal custFicoCreditScore, @Param("filler") String filler);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS SET CUST_FIRST_NAME= #{custFirstName},CUST_MIDDLE_NAME= #{custMiddleName},CUST_LAST_NAME= #{custLastName},CUST_ADDR_LINE_1= #{custAddrLine1},CUST_ADDR_LINE_2= #{custAddrLine2},CUST_ADDR_LINE_3= #{custAddrLine3},CUST_ADDR_STATE_CD= #{custAddrStateCd},CUST_ADDR_COUNTRY_CD= #{custAddrCountryCd},CUST_ADDR_ZIP= #{custAddrZip},CUST_PHONE_NUM_1= #{custPhoneNum1},CUST_PHONE_NUM_2= #{custPhoneNum2},CUST_SSN= #{custSsn},CUST_GOVT_ISSUED_ID= #{custGovtIssuedId},CUST_DOB_YYYYMMDD= #{custDobYyyymmdd},CUST_EFT_ACCOUNT_ID= #{custEftAccountId},CUST_PRI_CARD_HOLDER_IND= #{custPriCardHolderInd},CUST_FICO_CREDIT_SCORE= #{custFicoCreditScore},FILLER= #{filler} " +
			" WHERE CUST_ID = #{custId}")
	int rewrite(@Param("custId") BigDecimal custId, @Param("custFirstName") String custFirstName, @Param("custMiddleName") String custMiddleName, @Param("custLastName") String custLastName, @Param("custAddrLine1") String custAddrLine1, @Param("custAddrLine2") String custAddrLine2, @Param("custAddrLine3") String custAddrLine3, @Param("custAddrStateCd") String custAddrStateCd, @Param("custAddrCountryCd") String custAddrCountryCd, @Param("custAddrZip") String custAddrZip, @Param("custPhoneNum1") String custPhoneNum1, @Param("custPhoneNum2") String custPhoneNum2, @Param("custSsn") BigDecimal custSsn, @Param("custGovtIssuedId") String custGovtIssuedId, @Param("custDobYyyymmdd") String custDobYyyymmdd, @Param("custEftAccountId") String custEftAccountId, @Param("custPriCardHolderInd") String custPriCardHolderInd, @Param("custFicoCreditScore") BigDecimal custFicoCreditScore, @Param("filler") String filler);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	int delete(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS(CUST_ID,CUST_FIRST_NAME,CUST_MIDDLE_NAME,CUST_LAST_NAME,CUST_ADDR_LINE_1,CUST_ADDR_LINE_2,CUST_ADDR_LINE_3,CUST_ADDR_STATE_CD,CUST_ADDR_COUNTRY_CD,CUST_ADDR_ZIP,CUST_PHONE_NUM_1,CUST_PHONE_NUM_2,CUST_SSN,CUST_GOVT_ISSUED_ID,CUST_DOB_YYYYMMDD,CUST_EFT_ACCOUNT_ID,CUST_PRI_CARD_HOLDER_IND,CUST_FICO_CREDIT_SCORE,FILLER) " +
			"VALUES(#{custId},#{custFirstName},#{custMiddleName},#{custLastName},#{custAddrLine1},#{custAddrLine2},#{custAddrLine3},#{custAddrStateCd},#{custAddrCountryCd},#{custAddrZip},#{custPhoneNum1},#{custPhoneNum2},#{custSsn},#{custGovtIssuedId},#{custDobYyyymmdd},#{custEftAccountId},#{custPriCardHolderInd},#{custFicoCreditScore},#{filler})")
	int writeDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS SET CUST_FIRST_NAME= #{custFirstName},CUST_MIDDLE_NAME= #{custMiddleName},CUST_LAST_NAME= #{custLastName},CUST_ADDR_LINE_1= #{custAddrLine1},CUST_ADDR_LINE_2= #{custAddrLine2},CUST_ADDR_LINE_3= #{custAddrLine3},CUST_ADDR_STATE_CD= #{custAddrStateCd},CUST_ADDR_COUNTRY_CD= #{custAddrCountryCd},CUST_ADDR_ZIP= #{custAddrZip},CUST_PHONE_NUM_1= #{custPhoneNum1},CUST_PHONE_NUM_2= #{custPhoneNum2},CUST_SSN= #{custSsn},CUST_GOVT_ISSUED_ID= #{custGovtIssuedId},CUST_DOB_YYYYMMDD= #{custDobYyyymmdd},CUST_EFT_ACCOUNT_ID= #{custEftAccountId},CUST_PRI_CARD_HOLDER_IND= #{custPriCardHolderInd},CUST_FICO_CREDIT_SCORE= #{custFicoCreditScore},FILLER= #{filler} " +
			" WHERE CUST_ID = #{custId}")
	int rewriteDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS SET CUST_FIRST_NAME= #{param2.custFirstName},CUST_MIDDLE_NAME= #{param2.custMiddleName},CUST_LAST_NAME= #{param2.custLastName},CUST_ADDR_LINE_1= #{param2.custAddrLine1},CUST_ADDR_LINE_2= #{param2.custAddrLine2},CUST_ADDR_LINE_3= #{param2.custAddrLine3},CUST_ADDR_STATE_CD= #{param2.custAddrStateCd},CUST_ADDR_COUNTRY_CD= #{param2.custAddrCountryCd},CUST_ADDR_ZIP= #{param2.custAddrZip},CUST_PHONE_NUM_1= #{param2.custPhoneNum1},CUST_PHONE_NUM_2= #{param2.custPhoneNum2},CUST_SSN= #{param2.custSsn},CUST_GOVT_ISSUED_ID= #{param2.custGovtIssuedId},CUST_DOB_YYYYMMDD= #{param2.custDobYyyymmdd},CUST_EFT_ACCOUNT_ID= #{param2.custEftAccountId},CUST_PRI_CARD_HOLDER_IND= #{param2.custPriCardHolderInd},CUST_FICO_CREDIT_SCORE= #{param2.custFicoCreditScore},FILLER= #{param2.filler} " +
			" WHERE CUST_ID = #{param1}")
	int rewriteDtoWithKey(BigDecimal custId, AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	int deleteDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS(CUST_ID,CUST_FIRST_NAME,CUST_MIDDLE_NAME,CUST_LAST_NAME,CUST_ADDR_LINE_1,CUST_ADDR_LINE_2,CUST_ADDR_LINE_3,CUST_ADDR_STATE_CD,CUST_ADDR_COUNTRY_CD,CUST_ADDR_ZIP,CUST_PHONE_NUM_1,CUST_PHONE_NUM_2,CUST_SSN,CUST_GOVT_ISSUED_ID,CUST_DOB_YYYYMMDD,CUST_EFT_ACCOUNT_ID,CUST_PRI_CARD_HOLDER_IND,CUST_FICO_CREDIT_SCORE,FILLER) " +
			"VALUES(#{custId},#{custFirstName},#{custMiddleName},#{custLastName},#{custAddrLine1},#{custAddrLine2},#{custAddrLine3},#{custAddrStateCd},#{custAddrCountryCd},#{custAddrZip},#{custPhoneNum1},#{custPhoneNum2},#{custSsn},#{custGovtIssuedId},#{custDobYyyymmdd},#{custEftAccountId},#{custPriCardHolderInd},#{custFicoCreditScore},#{filler})")
	int writeDtoReturnLastKey(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdate(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdateNoWait(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdateInf(@Param("custId") BigDecimal custId);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId}")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1Dto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1Dto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1Dto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1Dto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1Dto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdateDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdateNoWaitDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE CUST_ID = #{custId} FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readEqByKey1ForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) > ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGtByKey1ForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) >= ( #{custId}) ORDER BY CUST_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readGeByKey1ForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) < ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLtByKey1ForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@ResultMap("AwsM2CarddemoCustdataVsamKsdsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CUSTDATA_VSAM_KSDS " +
			" WHERE (CUST_ID) <= ( #{custId}) ORDER BY CUST_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCustdataVsamKsdsDto> readLeByKey1ForUpdateInfDto(AwsM2CarddemoCustdataVsamKsdsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}