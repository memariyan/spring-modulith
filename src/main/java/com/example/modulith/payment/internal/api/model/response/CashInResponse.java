package com.example.modulith.payment.internal.api.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder(toBuilder = true)
public record CashInResponse(
        @Schema(description = "The address user is redirected to it", example = "http://www.bpm.com") String redirectUrl) {

}
