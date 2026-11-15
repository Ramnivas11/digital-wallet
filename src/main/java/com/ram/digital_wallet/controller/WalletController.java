package com.ram.digital_wallet.controller;

import com.ram.digital_wallet.dto.WalletBalanceResponse;
import com.ram.digital_wallet.service.WalletService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {

    private final WalletService walletService;

    // Constructor Injection
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping("/{walletId}/balance")
    public WalletBalanceResponse getBalance(
            @PathVariable Long walletId) {

        return walletService.getWalletBalance(walletId);
    }
}