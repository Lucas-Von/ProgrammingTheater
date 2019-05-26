package hackathon.vivo.ProgrammingTheater.Exception;

import javax.servlet.http.HttpServletRequest;

import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;


import java.net.ConnectException;
import java.sql.SQLException;

@RestControllerAdvice(annotations = { RestController.class, Controller.class })
public class SpringExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(SpringExceptionHandle.class);

    /**
     * 请求参数类型错误异常的捕获
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(value = { BindException.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BasicResponse badRequest(BindException e) {
        logger.error("occurs error when execute method ,message {}", e.getMessage());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(ExceptionEnums.BAD_REQUEST);
        return basicResponse;
    }

    /**
     * 404错误异常的捕获
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(value = { NoHandlerFoundException.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public BasicResponse badRequestNotFound(BindException e) {
        logger.error("occurs error when execute method ,message {}", e.getMessage());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(ExceptionEnums.NOT_FOUND);
        return basicResponse;
    }

    /**
     * 自定义异常的捕获 自定义抛出异常。统一的在这里捕获返回JSON格式的友好提示。
     * 
     * @param exception
     * @param request
     * @return
     */
    @ExceptionHandler(value = { MyRuntimeException.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BasicResponse sendError(MyRuntimeException exception, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        logger.error("occurs error when execute url ={} ,message {}", requestURI, exception.getMsg());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(exception);
        return basicResponse;
    }

    /**
     * 数据库操作出现异常
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(value = { SQLException.class, DataAccessException.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BasicResponse systemError(Exception e) {
        logger.error("occurs error when execute method ,message {}", e.getMessage());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(ExceptionEnums.DATABASE_ERROR);
        return basicResponse;
    }

    /**
     * 网络连接失败！
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(value = { ConnectException.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BasicResponse connect(Exception e) {
        logger.error("occurs error when execute method ,message {}", e.getMessage());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(ExceptionEnums.CONNECTION_ERROR);
        return basicResponse;
    }

    @ExceptionHandler(value = { Exception.class })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    public BasicResponse notAllowed(Exception e) {
        logger.error("occurs error when execute method ,message {}", e.getMessage());
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(false);
        basicResponse.setContent(ExceptionEnums.METHOD_NOT_ALLOWED);
        return basicResponse;
    }

}