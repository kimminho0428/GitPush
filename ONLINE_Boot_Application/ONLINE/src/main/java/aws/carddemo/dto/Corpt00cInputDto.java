package aws.carddemo.dto;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.group.Corpt00cCorpt0ai;
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
public class Corpt00cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("CORPT0AI")
  private Corpt00cCorpt0ai corpt0ai;
  private Corpt00cDfhcommarea dfhcommarea;
}