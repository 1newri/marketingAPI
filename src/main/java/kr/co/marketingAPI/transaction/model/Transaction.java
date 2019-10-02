package kr.co.marketingAPI.transaction.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Transaction {
	
	private String transactionDate;		// 거래일자
	private String accountNo;			// 계좌번호
	private String transactionOrder; 	// 거래번호
	private int money; 					// 금액
	private int commission;				// 수수료
	private String cancleYn;			// 취소여부

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_no")
	private Account account;
	
	// Join 테이블이 Json 결과에 표시 않되도록.
	protected Account getAccount() {
		return account;
	}
}
