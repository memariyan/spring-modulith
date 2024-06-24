package com.example.modulith.payment.internal.api;

import com.example.modulith.payment.internal.api.model.request.CashInRequest;
import com.example.modulith.payment.internal.api.model.response.CashInResponse;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/cash-in")
    @Operation(summary = "Doing cash-in (Increasing wallet balance)")
    public ResponseEntity<CashInResponse> cashIn(
            @RequestHeader(value = "User-Id") String userId, @Valid @RequestBody final CashInRequest request) {

        return ResponseEntity.ok(CashInResponse.builder().redirectUrl("http://sample.com").build());
    }

}
