package kr.co.marketingAPI.transaction.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.marketingAPI.transaction.model.Result01;
import kr.co.marketingAPI.transaction.model.Result02;
import kr.co.marketingAPI.transaction.model.Result03;
import kr.co.marketingAPI.transaction.model.Result04;

@Mapper
public interface TransactionMapper {
	
	public List<Result01> getYearSumAmtManyCustomList();

	public List<Result02> getYearNoTransactionCustomList();

	public List<Result03> getYearBranchSumAmtList();

	public Result04 branchSumAmtBybranchName(String brName);

	public void updateBranchName(String brName);
}
