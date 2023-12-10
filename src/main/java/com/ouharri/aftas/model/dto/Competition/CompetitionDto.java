package com.ouharri.aftas.model.dto.Competition;

import com.ouharri.aftas.model.dto.Address.AddressDto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 * DTO for {@link com.ouharri.aftas.model.entities.Competition}
 */
public record CompetitionDto(
        @NotNull(message = "The date cannot be null.") Date date,
        @NotNull(message = "The start time cannot be null.") Time startTime,
        @NotNull(message = "The end time cannot be null.") Time endTime,
        @NotNull(message = "The number of participants cannot be null.") @Min(message = "The number of participants must be at least 0.", value = 0) Integer numberOfParticipants,
        @NotBlank(message = "The location cannot be empty.") String location,
        @NotNull(message = "The address cannot be null.") AddressDto address,
        @NotNull(message = "The amount cannot be null.") @Min(0) Double amount
) implements Serializable {
}