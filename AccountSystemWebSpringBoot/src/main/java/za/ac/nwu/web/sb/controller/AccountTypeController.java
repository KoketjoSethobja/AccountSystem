package za.ac.nwu.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.service.GeneralResponse;

@RestController
@RequestMapping("account-type")
//@RequestMapping("demo")
public class AccountTypeController {

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Return a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<String>> getAll() {
        GeneralResponse<String> response = new GeneralResponse<>(true, "No types found");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    @GetMapping("/ping")
//    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<String>> ping(
//            @RequestParam(value = "echo", defaultValue = "pong")
//                    String echo) {
//        GeneralResponse<String> response = new GeneralResponse<>(true, echo);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @GetMapping("")
//    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<String>> getPing(
//            @RequestParam(value = "echo", defaultValue = "pong")
//                    String echo) {
//        GeneralResponse<String> response = new GeneralResponse<>(true, echo);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//    @PostMapping("/ping")
//    @ApiOperation(value = "Creates a new Pong.", notes = "Creates a new Pong in the system.")
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "The Pong was created successfully", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<Pong>> postPong(
//            @ApiParam(value = "Request body to create a new Pong.", required = true)
//            @RequestBody Pong pong) {
//        GeneralResponse<Pong> response = new GeneralResponse<>(true, pong);
//        return new ResponseEntity<>(response, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/ping")
//    @ApiOperation(value = "Update the Pong.")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "The Pong was updated", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<Pong>> putPong(
//            @RequestParam(value = "The number of days to add", defaultValue = "2")
//                    int daysToAdd,
//            @ApiParam(value = "The Pong.", required = true)
//            @RequestBody Pong pong) {
//        pong.setOnDate(pong.getOnDate().plusDays(daysToAdd));
//        GeneralResponse<Pong> response = new GeneralResponse<>(true, pong);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/ping")
//    @ApiOperation(value = "Delete the Pong.")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "The Pong was deleted", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<Pong>> putPong(
//            @ApiParam(value = "The Pong.", required = true)
//            @RequestBody Pong pong) {
//        GeneralResponse<Pong> response = new GeneralResponse<>(true, pong);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @GetMapping("/error")
//    @ApiOperation(value = "Throws an exception")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<String>> ping() {
//        throw new RuntimeException("Give an error");
//    }
//    @GetMapping("/ping")
//    public GeneralResponse<String> ping(@RequestParam(value = "echo", defaultValue = "pong") String echo){
//        return new GeneralResponse<String>(true, "No types found");
//    }
}
