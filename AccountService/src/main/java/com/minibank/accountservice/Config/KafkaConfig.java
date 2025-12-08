package com.minibank.accountservice.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic accountCreatedTopic() {
        return TopicBuilder.name("account-created")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic accountUpdatedTopic() {
        return TopicBuilder.name("account-updated")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic accountDeletedTopic() {
        return TopicBuilder.name("account-deleted")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
