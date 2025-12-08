package com.minibank.transactionservice.Producer;

import com.minibank.transactionservice.Event.TransactionEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionEventProducer {

    private final KafkaTemplate<String, TransactionEvent> kafkaTemplate;

    public void sendTransactionCreatedEvent(TransactionEvent event) {
        log.info("Sending transaction created event for transaction: {}", event.getTransactionId());
        kafkaTemplate.send("transaction-created", event.getTransactionId().toString(), event);
    }

    public void sendTransactionCompletedEvent(TransactionEvent event) {
        log.info("Sending transaction completed event for transaction: {}", event.getTransactionId());
        kafkaTemplate.send("transaction-completed", event.getTransactionId().toString(), event);
    }

    public void sendTransactionFailedEvent(TransactionEvent event) {
        log.info("Sending transaction failed event for transaction: {}", event.getTransactionId());
        kafkaTemplate.send("transaction-failed", event.getTransactionId().toString(), event);
    }

    public void sendEmailNotificationEvent(TransactionEvent event) {
        log.info("Sending email notification event for transaction: {}", event.getTransactionId());
        kafkaTemplate.send("email-notifications", event.getTransactionId().toString(), event);
    }
}
