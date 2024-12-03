package aws.carddemo.dto;

import aws.carddemo.variable.CocrdupcVariableContainer.CocrdupcCcrdupao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.tmax.openframe.online.domain.context.storage.SystemDtoAccessable;
import com.tmax.openframe.online.service.dto.SystemDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CocrdupcOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("CCRDUPAO")
  private CocrdupcCcrdupao ccrdupao;
}