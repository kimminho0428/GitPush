package aws.carddemo.mapper;

import com.tmax.openframe.DataConverter;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.*;
import org.mapstruct.factory.*;
import aws.carddemo.variable.group.Cbact03cFdXreffileRec;
import aws.carddemo.dto.AwsM2CarddemoCardxrefVsamKsdsDto;
import lombok.*;
import java.math.*;
import java.util.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cbact03cMapperInterface {
    /** 
     * <p>Mapper class to convert data for file I/O</p>
     * <ul>
     * <li>source class: {@link Cbact03cFdXreffileRec}</li>
     * <li>target class: {@link AwsM2CarddemoCardxrefVsamKsdsDto}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cbact03cFdXreffileRecToAwsM2CarddemoCardxrefVsamKsdsDto {
        Cbact03cFdXreffileRecToAwsM2CarddemoCardxrefVsamKsdsDto INSTANCE = Mappers
                .getMapper(Cbact03cFdXreffileRecToAwsM2CarddemoCardxrefVsamKsdsDto.class);

        @Mapping(source = "fdXrefCardNum", target = "xrefCardNum")
        AwsM2CarddemoCardxrefVsamKsdsDto toTarget(Cbact03cFdXreffileRec source);

        @Mapping(source = "xrefCardNum", target = "fdXrefCardNum")
        Cbact03cFdXreffileRec toSource(AwsM2CarddemoCardxrefVsamKsdsDto source);

        @AfterMapping
        default void makeTarget(Cbact03cFdXreffileRec source,
                @MappingTarget AwsM2CarddemoCardxrefVsamKsdsDto target) {
            target.setXrefCustId(DataConverter.convZonedStringToBigDecimal(
                    source.getFdXrefData().substring(0, 9), 9, 0));
            target.setXrefAcctId(DataConverter.convZonedStringToBigDecimal(
                    source.getFdXrefData().substring(9, 20), 11, 0));
            target.setFiller(source.getFdXrefData().substring(20));
        }

        @AfterMapping
        default void makeSource(AwsM2CarddemoCardxrefVsamKsdsDto source,
                @MappingTarget Cbact03cFdXreffileRec target) {
            target.setFdXrefData(DataConverter.convZonedBigDecimalToString(
                    source.getXrefCustId(), 9, 0)
                    + DataConverter.convZonedBigDecimalToString(
                            source.getXrefAcctId(), 11, 0) + source.getFiller());
        }
    }

    /** 
     * <p>Mapper class to convert data for indexed file I/O that uses only the record key</p>
     * <ul>
     * <li>source class: {@link Cbact03cFdXreffileRec}</li>
     * <li>target class: {@link AwsM2CarddemoCardxrefVsamKsdsDto}</li>
     * </ul>
     */
    @Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface Cbact03cFdXreffileRecKeyToAwsM2CarddemoCardxrefVsamKsdsDto {
        Cbact03cFdXreffileRecKeyToAwsM2CarddemoCardxrefVsamKsdsDto INSTANCE = Mappers
                .getMapper(Cbact03cFdXreffileRecKeyToAwsM2CarddemoCardxrefVsamKsdsDto.class);

        @Mapping(source = "fdXrefCardNum", target = "xrefCardNum")
        AwsM2CarddemoCardxrefVsamKsdsDto toTarget(Cbact03cFdXreffileRec source);
    }
}