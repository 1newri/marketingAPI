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
public class Result01 {
	
	@ApiModelProperty(value = "년도", required = true)
	private String year;
	
	@ApiModelProperty(value = "계좌명", required = true)
	private String name;
	
	@ApiModelProperty(value = "계좌번호", required = true)
	private String acctNo;
	
	@ApiModelProperty(value = "합계금액", required = true)
	private Long sumAmt;

}
