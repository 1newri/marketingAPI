package kr.co.marketingAPI.transaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@Table(name = "branch")
public class Branch {
	
	@Id
	@Column(name = "br_code")
	private String brCode;				// 관리점코드
	
	@Column(name = "br_name")
	private String brName;				// 관리점명

	public Branch(String brCode, String brName) {
		this.brCode = brCode;
		this.brName = brName;
	}
}
