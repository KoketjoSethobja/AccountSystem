package za.ac.nwu.web.sb.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionResponseHandler  extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(value = {RuntinesException.class})
//    private ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request){
//        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());
//        GeneralResponse<ErrorResponse> generalResponse = new GeneralResponse<>(true, errorResponse);
//        ResponseEntity<GeneralResponse<ErrorResponse>> response = new ResponseEntity<>(generalResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//        return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
//    }
}
