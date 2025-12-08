package com.minibank.accountservice.Producer;

import com.minibank.accountservice.Event.AccountEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountEventProducer {

    private final KafkaTemplate<String, AccountEvent> kafkaTemplate;

    public void sendAccountCreatedEvent(AccountEvent event) {
        log.info("Sending account created event for account: {}", event.getAccountId());
        kafkaTemplate.send("account-created", event.getAccountId().toString(), event);
    }

    public void sendAccountUpdatedEvent(AccountEvent event) {
        log.info("Sending account updated event for account: {}", event.getAccountId());
        kafkaTemplate.send("account-updated", event.getAccountId().toString(), event);
    }

    public void sendAccountDeletedEvent(AccountEvent event) {
        log.info("Sending account deleted event for account: {}", event.getAccountId());
        kafkaTemplate.send("account-deleted", event.getAccountId().toString(), event);
    }

    public void sendEmailNotificationEvent(AccountEvent event) {
        log.info("Sending email notification event for account: {}", event.getAccountId());
        kafkaTemplate.send("email-notifications", event.getAccountId().toString(), event);
    }
}
