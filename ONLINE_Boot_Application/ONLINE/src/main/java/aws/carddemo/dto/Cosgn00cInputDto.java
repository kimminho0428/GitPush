package aws.carddemo.dto;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.group.Cosgn00cCosgn0ai;
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
public class Cosgn00cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COSGN0AI")
  private Cosgn00cCosgn0ai cosgn0ai;
  private Cosgn00cDfhcommarea dfhcommarea;
}