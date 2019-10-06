package kr.co.marketingAPI.transaction.service;

import java.util.List;

import kr.co.marketingAPI.advice.exception.CBrCodeNotFoundException;
import kr.co.marketingAPI.transaction.model.Result01;
import kr.co.marketingAPI.transaction.model.Result02;
import kr.co.marketingAPI.transaction.model.Result03;
import kr.co.marketingAPI.transaction.model.Result04;

public interface TransactionService {

	List<Result01> getYearSumAmtManyCustomList();

	List<Result02> getYearNoTransactionCustomList();

	List<Result03> getYearBranchSumAmtList();

	Result04 branchSumAmtBybranchName(String brName) throws CBrCodeNotFoundException;

}
