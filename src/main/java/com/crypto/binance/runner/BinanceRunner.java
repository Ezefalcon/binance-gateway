package com.crypto.binance.runner;

import com.crypto.binance.model.dto.TickerDTO;
import com.crypto.binance.service.BinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BinanceRunner implements CommandLineRunner {

    @Autowired
    private BinanceService binanceService;

    @Override
    public void run(String... args) throws Exception {
        List<String> neededTickers = Arrays.asList("BTCUSDT", "BNBUSDT");
        while (true) {
            List<TickerDTO> allTickers = binanceService.getAllTickers();
            allTickers.stream()
                .filter(ticker -> neededTickers.contains(ticker.getSymbol()))
                .forEach(System.out::println);
        }
    }
}
