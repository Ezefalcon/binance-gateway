package com.crypto.binance.controller;

import com.crypto.binance.model.dto.TickerDTO;
import com.crypto.binance.service.BinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/binance/")
public class BinanceController {

    @Autowired
    private BinanceService binanceService;

    @GetMapping("/ticker")
    public List<TickerDTO> getAllTickers() {
        return binanceService.getAllTickers();
    }
}