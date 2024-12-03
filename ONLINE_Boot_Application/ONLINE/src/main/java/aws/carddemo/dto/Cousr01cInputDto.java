package aws.carddemo.dto;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.group.Cousr01cCousr1ai;
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
public class Cousr01cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COUSR1AI")
  private Cousr01cCousr1ai cousr1ai;
  private Cousr01cDfhcommarea dfhcommarea;
}