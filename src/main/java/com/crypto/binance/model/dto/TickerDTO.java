package com.crypto.binance.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TickerDTO {
    private String symbol;
    private BigDecimal price;
}
