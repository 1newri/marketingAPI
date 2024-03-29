package kr.co.marketingAPI.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kr.co.marketingAPI.advice.exception.CBrCodeNotFoundException;
import kr.co.marketingAPI.model.response.CommonResult;
import kr.co.marketingAPI.model.response.service.ResponseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {
	
	private final ResponseService responseService;
	
	private final MessageSource messageSource;
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected CommonResult defaultException(HttpServletRequest request, Exception e) {
		return responseService.getFailResult(Integer.valueOf(getMessage("unKnown.code")), getMessage("unKnown.msg"));
	}
	
	@ExceptionHandler(CBrCodeNotFoundException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected CommonResult brCodeNotFoundException(HttpServletRequest request, CBrCodeNotFoundException e) {
		return responseService.getFailResult(Integer.valueOf(getMessage("notFound.code")), getMessage("notFound.msg"));
	}

	private String getMessage(String code) {
		return getMessage(code, null);
	}
	
	private String getMessage(String code, Object[] args) {
		return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
	}

}
