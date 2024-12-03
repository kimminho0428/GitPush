package aws.carddemo.dto;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.group.CocrdupcCcrdupai;
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
public class CocrdupcInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("CCRDUPAI")
  private CocrdupcCcrdupai ccrdupai;
  private CocrdupcDfhcommarea dfhcommarea;
}