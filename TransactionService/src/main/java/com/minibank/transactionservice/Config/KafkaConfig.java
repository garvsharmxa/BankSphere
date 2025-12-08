package com.minibank.transactionservice.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic transactionCreatedTopic() {
        return TopicBuilder.name("transaction-created")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic transactionCompletedTopic() {
        return TopicBuilder.name("transaction-completed")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic transactionFailedTopic() {
        return TopicBuilder.name("transaction-failed")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic emailNotificationsTopic() {
        return TopicBuilder.name("email-notifications")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
