package com.minibank.accountservice.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEvent {
    private UUID accountId;
    private UUID customerId;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private String eventType; // CREATED, UPDATED, DELETED, DEPOSIT, WITHDRAW
    private LocalDateTime timestamp;
    private String email; // For email notifications
}
