package aws.carddemo.dto;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.group.Comen01cComen1ai;
import com.tmax.openframe.online.service.dto.SystemDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.tmax.openframe.online.domain.context.storage.SystemDtoAccessable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comen01cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COMEN1AI")
  private Comen01cComen1ai comen1ai;
  private Comen01cDfhcommarea dfhcommarea;
}