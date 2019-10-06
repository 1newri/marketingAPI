package kr.co.marketingAPI.transaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "account")
public class Account {
	
	@Id
	@Column(name = "acct_no")
	private String acctNo;			// 계좌번호
	
	@Column(name = "acct_name")
	private String name;			// 계좌명
	
	@Column(name = "br_code")
	private String brCode;			// 지점코드
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "br_code"
				, referencedColumnName = "br_code"
				, insertable = false
				, updatable = false )
	private Branch branch;
	
	// Join 테이블이 Json 결과에 표시 않되도록.
	protected Branch getBranch() {
		return branch;
	}
	
	public Account(Branch branch, String acctNo,
			String name, String brCode) {
		this.branch = branch;
		this.acctNo = acctNo;
		this.name = name;
		this.brCode = brCode;
	}
}
