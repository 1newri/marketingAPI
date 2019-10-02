package kr.co.marketingAPI.transaction.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Account {
	
	private String accountNo;			// 계좌번호
	private String accountName;			// 계좌명
	private String branchCode;			// 지점코드
	
	@OneToOne
	@JoinColumn(name = "branch_code")
	private Branch branch;
}
