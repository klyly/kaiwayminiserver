package niit.wei.exception;

import niit.wei.utils.ResultCode;
import niit.wei.utils.ResultJson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author WeiJinLong
 * @Date 2023-08-05 8:44
 * @Version 1.0
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    @ResponseBody
    @ExceptionHandler
    public Object getException(Exception exception) {
        return new ResultJson<>(exception.getMessage(), ResultCode.EXCEPTION_ERROR);
    }
}
