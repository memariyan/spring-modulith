package com.example.modulith.payment.internal.api.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public record CashInRequest(@Schema(description = "The cash-in amount", example = "1000") @NotNull @Positive Long amount) {

}
