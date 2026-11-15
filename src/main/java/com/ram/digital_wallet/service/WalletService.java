package com.ram.wallet.service;

import com.ram.digital_wallet.dto.WalletBalanceResponse;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class WalletService {

    public WalletBalanceResponse getWalletBalance(Long walletId) {

        // Temporary dummy data
        BigDecimal balance = new BigDecimal("1000.00");

        return new WalletBalanceResponse(
                walletId,
                balance,
                "INR"
        );
    }
}