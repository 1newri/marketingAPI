package kr.co.marketingAPI.transaction.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
//@IdClass(TransactionId.class)
@Table(name = "transaction")
public class Transaction {

	@EmbeddedId
	private Integer id;
	
	@Column(name = "trnsct_date")
	private String trnsctDate;		// 거래일자
	
	@Column(name = "acct_no")
	private String acctNo;			// 계좌번호
	
	@Column(name = "trnsct_order")
	private int trnsctOrder; 	// 거래번호
	
	@Column(name = "amt")
	private int amt; 					// 금액
	
	@Column(name = "commission")
	private int commission;				// 수수료
	
	@Column(name = "cancle_yn")
	private String cancleYn;			// 취소여부

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "acct_no"
				, referencedColumnName="acct_no"
				, insertable = false
				, updatable = false )
	private Account account;
	
	// Join 테이블이 Json 결과에 표시 않되도록.
	protected Account getAccount() {
		return account;
	}
	
	public Transaction(Account account, String trnsctDate, String acctNo,
			int trnsctOrder, int amt, int commission, String cancleYn) {
		this.account = account;
		this.trnsctDate = trnsctDate;
		this.acctNo = acctNo;
		this.trnsctOrder = trnsctOrder;
		this.amt = amt;
		this.commission = commission;
		this.cancleYn = cancleYn;
	}
}
