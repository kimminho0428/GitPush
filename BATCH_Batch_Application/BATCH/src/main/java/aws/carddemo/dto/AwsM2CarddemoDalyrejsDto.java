package aws.carddemo.dto;

import lombok.*;

public @Getter @Setter class AwsM2CarddemoDalyrejsDto {
    private long seqId;
    private String fdRejectRecord;
    private String fdValidationTrailer;
}
