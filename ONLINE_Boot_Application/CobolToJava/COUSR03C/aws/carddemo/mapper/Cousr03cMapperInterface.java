package aws.carddemo.mapper;

import com.tmax.openframe.DataConverter;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;
import org.mapstruct.factory.*;
import aws.carddemo.variable.group.Cousr03cCarddemoCommarea;
import aws.carddemo.variable.group.Cousr00cDfhcommarea;
import aws.carddemo.variable.group.Coadm01cDfhcommarea;
import aws.carddemo.variable.group.Cosgn00cDfhcommarea;
import aws.carddemo.variable.group.Cousr03cDfhcommarea;
import aws.carddemo.variable.group.Cousr03cSecUserData;
import aws.carddemo.dto.AwsM2CarddemoUsrsecVsamKsdsDto;
import lombok.*;
import java.math.*;
import java.util.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:57:48 UTC</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cousr03cMapperInterface {
    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr03cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cousr03cCarddemoCommareaToCousr00cDfhcommarea {
        Cousr03cCarddemoCommareaToCousr00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr03cCarddemoCommareaToCousr00cDfhcommarea.class);

        Cousr00cDfhcommarea toTarget(Cousr03cCarddemoCommarea source);

        Cousr03cCarddemoCommarea toSource(Cousr00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr03cCarddemoCommarea source,
                @MappingTarget Cousr00cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu03Info().getCdemoCu03UsridFirst()
                    + source.getCdemoCu03Info().getCdemoCu03UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu03Info().getCdemoCu03PageNum(), 8)
                    + source.getCdemoCu03Info().getCdemoCu03NextPageFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr00cDfhcommarea source,
                @MappingTarget Cousr03cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    source.getLkCommarea().substring(0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    source.getLkCommarea().substring(4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    source.getLkCommarea().substring(12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    source.getLkCommarea().substring(16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    source.getLkCommarea().substring(24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    source.getLkCommarea().substring(32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    source.getLkCommarea().substring(43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    source.getLkCommarea().substring(68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    source.getLkCommarea().substring(93, 118));
            target.getCdemoAccountInfo().setCdemoAcctId(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(118, 129), 11));
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    source.getLkCommarea().substring(129, 130));
            target.getCdemoCardInfo().setCdemoCardNum(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(130, 146), 16));
            target.getCdemoMoreInfo().setCdemoLastMap(
                    source.getLkCommarea().substring(146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    source.getLkCommarea().substring(153, 160));
            target.getCdemoCu03Info().setCdemoCu03UsridFirst(
                    source.getLkCommarea().substring(160, 168));
            target.getCdemoCu03Info().setCdemoCu03UsridLast(
                    source.getLkCommarea().substring(168, 176));
            target.getCdemoCu03Info().setCdemoCu03PageNum(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(176, 184), 8)));
            target.getCdemoCu03Info().setCdemoCu03NextPageFlg(
                    source.getLkCommarea().substring(184, 185));
            target.getCdemoCu03Info().setCdemoCu03UsrSelFlg(
                    source.getLkCommarea().substring(185, 186));
            target.getCdemoCu03Info().setCdemoCu03UsrSelected(
                    source.getLkCommarea().substring(186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr03cCarddemoCommarea}</li>
     * <li>target class: {@link Coadm01cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cousr03cCarddemoCommareaToCoadm01cDfhcommarea {
        Cousr03cCarddemoCommareaToCoadm01cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr03cCarddemoCommareaToCoadm01cDfhcommarea.class);

        Coadm01cDfhcommarea toTarget(Cousr03cCarddemoCommarea source);

        Cousr03cCarddemoCommarea toSource(Coadm01cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr03cCarddemoCommarea source,
                @MappingTarget Coadm01cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu03Info().getCdemoCu03UsridFirst()
                    + source.getCdemoCu03Info().getCdemoCu03UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu03Info().getCdemoCu03PageNum(), 8)
                    + source.getCdemoCu03Info().getCdemoCu03NextPageFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelected());
        }

        @AfterMapping
        default void makeSource(Coadm01cDfhcommarea source,
                @MappingTarget Cousr03cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    source.getLkCommarea().substring(0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    source.getLkCommarea().substring(4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    source.getLkCommarea().substring(12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    source.getLkCommarea().substring(16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    source.getLkCommarea().substring(24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    source.getLkCommarea().substring(32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    source.getLkCommarea().substring(43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    source.getLkCommarea().substring(68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    source.getLkCommarea().substring(93, 118));
            target.getCdemoAccountInfo().setCdemoAcctId(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(118, 129), 11));
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    source.getLkCommarea().substring(129, 130));
            target.getCdemoCardInfo().setCdemoCardNum(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(130, 146), 16));
            target.getCdemoMoreInfo().setCdemoLastMap(
                    source.getLkCommarea().substring(146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    source.getLkCommarea().substring(153, 160));
            target.getCdemoCu03Info().setCdemoCu03UsridFirst(
                    source.getLkCommarea().substring(160, 168));
            target.getCdemoCu03Info().setCdemoCu03UsridLast(
                    source.getLkCommarea().substring(168, 176));
            target.getCdemoCu03Info().setCdemoCu03PageNum(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(176, 184), 8)));
            target.getCdemoCu03Info().setCdemoCu03NextPageFlg(
                    source.getLkCommarea().substring(184, 185));
            target.getCdemoCu03Info().setCdemoCu03UsrSelFlg(
                    source.getLkCommarea().substring(185, 186));
            target.getCdemoCu03Info().setCdemoCu03UsrSelected(
                    source.getLkCommarea().substring(186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr03cCarddemoCommarea}</li>
     * <li>target class: {@link Cosgn00cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cousr03cCarddemoCommareaToCosgn00cDfhcommarea {
        Cousr03cCarddemoCommareaToCosgn00cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr03cCarddemoCommareaToCosgn00cDfhcommarea.class);

        Cosgn00cDfhcommarea toTarget(Cousr03cCarddemoCommarea source);

        Cousr03cCarddemoCommarea toSource(Cosgn00cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr03cCarddemoCommarea source,
                @MappingTarget Cosgn00cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu03Info().getCdemoCu03UsridFirst()
                    + source.getCdemoCu03Info().getCdemoCu03UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu03Info().getCdemoCu03PageNum(), 8)
                    + source.getCdemoCu03Info().getCdemoCu03NextPageFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cosgn00cDfhcommarea source,
                @MappingTarget Cousr03cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    source.getLkCommarea().substring(0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    source.getLkCommarea().substring(4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    source.getLkCommarea().substring(12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    source.getLkCommarea().substring(16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    source.getLkCommarea().substring(24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    source.getLkCommarea().substring(32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    source.getLkCommarea().substring(43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    source.getLkCommarea().substring(68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    source.getLkCommarea().substring(93, 118));
            target.getCdemoAccountInfo().setCdemoAcctId(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(118, 129), 11));
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    source.getLkCommarea().substring(129, 130));
            target.getCdemoCardInfo().setCdemoCardNum(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(130, 146), 16));
            target.getCdemoMoreInfo().setCdemoLastMap(
                    source.getLkCommarea().substring(146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    source.getLkCommarea().substring(153, 160));
            target.getCdemoCu03Info().setCdemoCu03UsridFirst(
                    source.getLkCommarea().substring(160, 168));
            target.getCdemoCu03Info().setCdemoCu03UsridLast(
                    source.getLkCommarea().substring(168, 176));
            target.getCdemoCu03Info().setCdemoCu03PageNum(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(176, 184), 8)));
            target.getCdemoCu03Info().setCdemoCu03NextPageFlg(
                    source.getLkCommarea().substring(184, 185));
            target.getCdemoCu03Info().setCdemoCu03UsrSelFlg(
                    source.getLkCommarea().substring(185, 186));
            target.getCdemoCu03Info().setCdemoCu03UsrSelected(
                    source.getLkCommarea().substring(186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr03cCarddemoCommarea}</li>
     * <li>target class: {@link Cousr03cDfhcommarea}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cousr03cCarddemoCommareaToCousr03cDfhcommarea {
        Cousr03cCarddemoCommareaToCousr03cDfhcommarea INSTANCE = Mappers
                .getMapper(Cousr03cCarddemoCommareaToCousr03cDfhcommarea.class);

        Cousr03cDfhcommarea toTarget(Cousr03cCarddemoCommarea source);

        Cousr03cCarddemoCommarea toSource(Cousr03cDfhcommarea source);

        @AfterMapping
        default void makeTarget(Cousr03cCarddemoCommarea source,
                @MappingTarget Cousr03cDfhcommarea target) {
            target.setLkCommarea(source.getCdemoGeneralInfo()
                    .getCdemoFromTranid()
                    + source.getCdemoGeneralInfo().getCdemoFromProgram()
                    + source.getCdemoGeneralInfo().getCdemoToTranid()
                    + source.getCdemoGeneralInfo().getCdemoToProgram()
                    + source.getCdemoGeneralInfo().getCdemoUserId()
                    + source.getCdemoGeneralInfo().getCdemoUserType()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoGeneralInfo().getCdemoPgmContext(), 1)
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCustomerInfo().getCdemoCustId(), 9)
                    + source.getCdemoCustomerInfo().getCdemoCustFname()
                    + source.getCdemoCustomerInfo().getCdemoCustMname()
                    + source.getCdemoCustomerInfo().getCdemoCustLname()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoAccountInfo().getCdemoAcctId(), 11)
                    + source.getCdemoAccountInfo().getCdemoAcctStatus()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCardInfo().getCdemoCardNum(), 16)
                    + source.getCdemoMoreInfo().getCdemoLastMap()
                    + source.getCdemoMoreInfo().getCdemoLastMapset()
                    + source.getCdemoCu03Info().getCdemoCu03UsridFirst()
                    + source.getCdemoCu03Info().getCdemoCu03UsridLast()
                    + DataConverter.convZonedLongToString(source
                            .getCdemoCu03Info().getCdemoCu03PageNum(), 8)
                    + source.getCdemoCu03Info().getCdemoCu03NextPageFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelFlg()
                    + source.getCdemoCu03Info().getCdemoCu03UsrSelected());
        }

        @AfterMapping
        default void makeSource(Cousr03cDfhcommarea source,
                @MappingTarget Cousr03cCarddemoCommarea target) {
            target.getCdemoGeneralInfo().setCdemoFromTranid(
                    source.getLkCommarea().substring(0, 4));
            target.getCdemoGeneralInfo().setCdemoFromProgram(
                    source.getLkCommarea().substring(4, 12));
            target.getCdemoGeneralInfo().setCdemoToTranid(
                    source.getLkCommarea().substring(12, 16));
            target.getCdemoGeneralInfo().setCdemoToProgram(
                    source.getLkCommarea().substring(16, 24));
            target.getCdemoGeneralInfo().setCdemoUserId(
                    source.getLkCommarea().substring(24, 32));
            target.getCdemoGeneralInfo().setCdemoUserType(
                    source.getLkCommarea().substring(32, 33));
            target.getCdemoGeneralInfo().setCdemoPgmContext(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(33, 34), 1)));
            target.getCdemoCustomerInfo().setCdemoCustId(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(34, 43), 9)));
            target.getCdemoCustomerInfo().setCdemoCustFname(
                    source.getLkCommarea().substring(43, 68));
            target.getCdemoCustomerInfo().setCdemoCustMname(
                    source.getLkCommarea().substring(68, 93));
            target.getCdemoCustomerInfo().setCdemoCustLname(
                    source.getLkCommarea().substring(93, 118));
            target.getCdemoAccountInfo().setCdemoAcctId(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(118, 129), 11));
            target.getCdemoAccountInfo().setCdemoAcctStatus(
                    source.getLkCommarea().substring(129, 130));
            target.getCdemoCardInfo().setCdemoCardNum(
                    DataConverter.convZonedStringToLong(source.getLkCommarea()
                            .substring(130, 146), 16));
            target.getCdemoMoreInfo().setCdemoLastMap(
                    source.getLkCommarea().substring(146, 153));
            target.getCdemoMoreInfo().setCdemoLastMapset(
                    source.getLkCommarea().substring(153, 160));
            target.getCdemoCu03Info().setCdemoCu03UsridFirst(
                    source.getLkCommarea().substring(160, 168));
            target.getCdemoCu03Info().setCdemoCu03UsridLast(
                    source.getLkCommarea().substring(168, 176));
            target.getCdemoCu03Info().setCdemoCu03PageNum(
                    ((int) DataConverter.convZonedStringToLong(source
                            .getLkCommarea().substring(176, 184), 8)));
            target.getCdemoCu03Info().setCdemoCu03NextPageFlg(
                    source.getLkCommarea().substring(184, 185));
            target.getCdemoCu03Info().setCdemoCu03UsrSelFlg(
                    source.getLkCommarea().substring(185, 186));
            target.getCdemoCu03Info().setCdemoCu03UsrSelected(
                    source.getLkCommarea().substring(186, 194));
        }
    }

    /** 
     * <p>Mapper class to convert data for CICS processing</p>
     * <ul>
     * <li>source class: {@link Cousr03cSecUserData}</li>
     * <li>target class: {@link AwsM2CarddemoUsrsecVsamKsdsDto}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cousr03cSecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto {
        Cousr03cSecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto INSTANCE = Mappers
                .getMapper(Cousr03cSecUserDataToAwsM2CarddemoUsrsecVsamKsdsDto.class);

        @Mapping(source = "secUsrId", target = "secUsrId")
        @Mapping(source = "secUsrFname", target = "secUsrFname")
        @Mapping(source = "secUsrLname", target = "secUsrLname")
        @Mapping(source = "secUsrPwd", target = "secUsrPwd")
        @Mapping(source = "secUsrType", target = "secUsrType")
        @Mapping(source = "secUsrFiller", target = "secUsrFiller")
        AwsM2CarddemoUsrsecVsamKsdsDto toTarget(Cousr03cSecUserData source);

        @Mapping(source = "secUsrId", target = "secUsrId")
        @Mapping(source = "secUsrFname", target = "secUsrFname")
        @Mapping(source = "secUsrLname", target = "secUsrLname")
        @Mapping(source = "secUsrPwd", target = "secUsrPwd")
        @Mapping(source = "secUsrType", target = "secUsrType")
        @Mapping(source = "secUsrFiller", target = "secUsrFiller")
        Cousr03cSecUserData toSource(AwsM2CarddemoUsrsecVsamKsdsDto source);
    }
}