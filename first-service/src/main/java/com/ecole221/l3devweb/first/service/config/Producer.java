package com.ecole221.l3devweb.first.service.config;

import com.ecole221.l3devweb.common.service.event.PersonneEvent;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Producer {

    @Bean
    public ProducerFactory<String, PersonneEvent> producerFactory() {
        Map<String, Object> config
                = new HashMap<>();

        config.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "localhost:19092");

        config.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);

        config.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(config);
    }



    @Bean
    public KafkaTemplate<String, PersonneEvent> personnekafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }


}
