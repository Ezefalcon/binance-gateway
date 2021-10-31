package com.crypto.binance.service;

import com.crypto.binance.model.dto.TickerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class BinanceService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${binance.url}")
    private String binanceUrl;

    public List<TickerDTO> getAllTickers() {
        TickerDTO[] forObject = restTemplate.getForObject(binanceUrl + "/api/v3/ticker/price", TickerDTO[].class);
        return Arrays.asList(forObject);
    }
}
