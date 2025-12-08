package com.minibank.transactionservice.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEvent {
    private UUID transactionId;
    private UUID accountId;
    private UUID customerId;
    private String transactionType; // DEPOSIT, WITHDRAWAL, TRANSFER
    private Double amount;
    private String status; // SUCCESS, FAILED, PENDING
    private String eventType; // CREATED, COMPLETED, FAILED
    private LocalDateTime timestamp;
    private String email; // For email notifications
    private String description;
}
