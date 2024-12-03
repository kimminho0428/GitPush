package aws.carddemo.dto;

import aws.carddemo.variable.Cousr03cVariableContainer.Cousr03cCousr3ao;

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
public class Cousr03cOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("COUSR3AO")
  private Cousr03cCousr3ao cousr3ao;
}