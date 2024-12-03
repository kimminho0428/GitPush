package aws.carddemo.dto;

import aws.carddemo.variable.Cotrn01cVariableContainer.Cotrn01cCotrn1ao;

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
public class Cotrn01cOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("COTRN1AO")
  private Cotrn01cCotrn1ao cotrn1ao;
}