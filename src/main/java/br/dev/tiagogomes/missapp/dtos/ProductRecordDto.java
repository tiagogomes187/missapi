package br.dev.tiagogomes.missapp.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;


public record ProductRecordDto(
        @NotNull Long referencia,
        @NotBlank String cor,
        @NotBlank String nome,
        @NotBlank String marca,
        @NotNull Long gtin,
        @NotBlank String ncm,
        @NotNull @PastOrPresent(message = "A data do produto não pode ser futura") @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") Instant data,
        @NotBlank String tipo
) {
}
