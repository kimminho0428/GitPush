package aws.carddemo.dto;

import aws.carddemo.variable.Coadm01cVariableContainer.Coadm01cCoadm1ao;

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
public class Coadm01cOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("COADM1AO")
  private Coadm01cCoadm1ao coadm1ao;
}