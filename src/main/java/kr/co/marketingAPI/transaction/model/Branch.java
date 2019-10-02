package kr.co.marketingAPI.transaction.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Branch {

	private String branchCode;				// 관리점코드
	private String branchName;				// 관리점명
	
}
