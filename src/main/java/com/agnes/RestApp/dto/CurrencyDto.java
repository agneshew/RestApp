package com.agnes.RestApp.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class CurrencyDto {

    @NotBlank
    private String currency;

}
