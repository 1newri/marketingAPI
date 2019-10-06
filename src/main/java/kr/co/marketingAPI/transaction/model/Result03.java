package kr.co.marketingAPI.transaction.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result03 {
	
	@ApiModelProperty(value = "년도", required = true)
	private String year;
	
	@ApiModelProperty(value = "관리점명", required = true)
	private String brName;
	
	@ApiModelProperty(value = "관리점코드", required = true)
	private String brCode;
	
	@ApiModelProperty(value = "합계금액", required = true)
	private String sumAmt;

}
