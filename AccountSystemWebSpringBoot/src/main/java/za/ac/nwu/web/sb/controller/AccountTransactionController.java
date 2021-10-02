package za.ac.nwu.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.domain.dto.AccountTransactionDto;
import za.ac.nwu.domain.service.GeneralResponse;
import za.ac.nwu.logic.flow.CreateAccountTransactionFlow;
import za.ac.nwu.logic.flow.FetchAccountTransactionFlow;
import za.ac.nwu.repo.persistence.AccountTransactionRepository;

import java.util.List;

@RestController
@RequestMapping("account-transaction")
public class AccountTransactionController {

    private final CreateAccountTransactionFlow createAccountTransactionFlow;
    private final FetchAccountTransactionFlow fetchAccountTransactionFlow;
    private final AccountTransactionRepository repo;

    @Autowired
    public AccountTransactionController(CreateAccountTransactionFlow createAccountTransactionFlow,
                                        FetchAccountTransactionFlow fetchAccountTransactionFlow, AccountTransactionRepository repo) {
        this.createAccountTransactionFlow = createAccountTransactionFlow;
        this.fetchAccountTransactionFlow = fetchAccountTransactionFlow;
        this.repo = repo;
    }

    @PostMapping("")
    @ApiOperation(value = "Creates a new AccountTransaction.", notes = "Creates a new AccountTransaction in the DB")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The AccountTransaction was created successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<AccountTransactionDto>> create(
            @ApiParam(value = "Request body to create a new AccountTransaction",
                    required = true)
            @RequestBody AccountTransactionDto AccountTransaction) {
        AccountTransactionDto AccountTransactionResponse = createAccountTransactionFlow.create(AccountTransaction);
        GeneralResponse<AccountTransactionDto> response = new GeneralResponse<>(true, AccountTransactionResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured AccountTransactions.", notes = "Return a list of AccountTransactions")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "AccountTransactions returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountTransactionDto>>> getAll() {
        List<AccountTransactionDto> AccountTransactions = fetchAccountTransactionFlow.getAllAccountTransactions();
        GeneralResponse<List<AccountTransactionDto>> response = new GeneralResponse<>(true, AccountTransactions);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{transactionId}")
    @ApiOperation(value = "Fetches the specified AccountTransaction.", notes = "Fetches the AccountTransaction corresponding to the given transactionId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "AccountTransaction Found", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<AccountTransactionDto>> getAccountTransaction(
            @ApiParam(value = "The transactionId that uniquely identifies the AccountTransaction.",
                    example = "5002",
                    name = "transactionId",
                    required = true)
            @PathVariable("transactionId") final Long transactionId) {
        AccountTransactionDto AccountTransaction = fetchAccountTransactionFlow.getAccountTransactionById(transactionId);
        GeneralResponse<AccountTransactionDto> response = new GeneralResponse<>(true, AccountTransaction);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/addAmount/{addAmount}")
    @ApiOperation(value = "Add miles to specified account transaction.", notes = "Updates the AccountTransaction corresponding to the given memberId.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "AccountTransaction Updated"),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Resource not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<Integer>> addMilesToMilesAccount(
            @ApiParam(value = "Amount to be added",
                    example = "300",
                    name = "addAmount",
                    required = true)
            @PathVariable("addAmount") final Long addAmount,

            @ApiParam(value = "The memberId.",
                    name = "memberId",
                    required = true)
            @RequestParam("memberId") final Long memberId
    ){
        Integer accountTransaction = repo.addMilesToMilesAccount(addAmount, memberId);
        GeneralResponse<Integer> response = new GeneralResponse<>(true, accountTransaction);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/subAmount/{subAmount}")
    @ApiOperation(value = "subtract miles from specified account transaction.", notes = "Updates the AccountTransaction corresponding to the given memberId.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "AccountTransaction Updated"),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Resource not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<Integer>> subtractMilesFromMilesAccount(
            @ApiParam(value = "Amount to be subtracted",
                    example = "300",
                    name = "subAmount",
                    required = true)
            @PathVariable("subAmount") final Long subAmount,

            @ApiParam(value = "The memberId.",
                    name = "memberId",
                    required = true)
            @RequestParam("memberId") final Long memberId
    ){
        Integer accountTransaction = repo.subtractMilesFromMilesAccount(subAmount, memberId);
        GeneralResponse<Integer> response = new GeneralResponse<>(true, accountTransaction);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/memberId/{memberId}")
    @ApiOperation(value = "Views the specified Currency for member.", notes = "Views the Currency corresponding to the given memberId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Currency Found", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<AccountTransactionDto>> viewMilesForMember(
            @ApiParam(value = "The memberId that uniquely identifies the Currency.",
                    example = "1234567",
                    name = "memberId",
                    required = true)
            @PathVariable("memberId") final Long memberId) {
        AccountTransactionDto AccountTransaction = fetchAccountTransactionFlow.viewMilesForMember(memberId);
        GeneralResponse<AccountTransactionDto> response = new GeneralResponse<>(true, AccountTransaction);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}

