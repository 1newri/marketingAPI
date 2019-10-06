package kr.co.marketingAPI.transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.co.marketingAPI.advice.exception.CBrCodeNotFoundException;
import kr.co.marketingAPI.model.response.ListResult;
import kr.co.marketingAPI.model.response.SingleResult;
import kr.co.marketingAPI.model.response.service.ResponseService;
import kr.co.marketingAPI.transaction.model.Result01;
import kr.co.marketingAPI.transaction.model.Result02;
import kr.co.marketingAPI.transaction.model.Result03;
import kr.co.marketingAPI.transaction.model.Result04;
import kr.co.marketingAPI.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;

@Api(tags = {"1. Branch Marketing API Documnetaion"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class TransactionContoller {
	
	private final ResponseService responseService;
	private final TransactionService transactionService;

	
	@ApiOperation(value = "연도별 합계 금액이 가장 많은 고객추출", notes = "2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API")
	@GetMapping(value = "/1")
	public ListResult<Result01> yearSumAmtManyCustom(){
		
		return responseService.getListResult(transactionService.getYearSumAmtManyCustomList());
	}
	
	
	@ApiOperation(value = "거래가 없는 고객추출", notes = "2018년, 2019년에 거래가 없는 고객을 추출하는 API")
	@GetMapping(value = "/2")
	public ListResult<Result02> yearNoTransactionCustom(){
		
		return responseService.getListResult(transactionService.getYearNoTransactionCustomList());
	}

	@ApiOperation(value = "연도별 관리점별 합계금액", notes = "연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서대로 출력하는 API")
	@GetMapping(value = "/3")
	public ListResult<Result03> yearBranchSumAmt(){
		
		return responseService.getListResult(transactionService.getYearBranchSumAmtList());
	}
	
	/**
	 *  4. 지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API
	 */
	@ApiOperation(value = "지점명 입력", notes = "지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API")
	@GetMapping(value = "/4/{brName}")
	public SingleResult<Result04> branchSumAmtBybranchName(
			@ApiParam(value = "지점명", required = true) @PathVariable String brName,
			@ApiParam(value = "언어", defaultValue = "ko") @RequestParam String lang
			) throws CBrCodeNotFoundException{
		return responseService.getSingleResult(transactionService.branchSumAmtBybranchName(brName));
	}
	
	
	
	
}
