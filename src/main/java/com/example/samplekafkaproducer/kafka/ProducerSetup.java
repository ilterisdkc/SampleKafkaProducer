package com.example.samplekafkaproducer.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;

/**
 * @author ilterisdkc
 */
public class ProducerSetup {

    public static KafkaProducer<byte[], byte[]> producer = ProducerSetup.newProducer();

    private static KafkaProducer<byte[],byte[]> newProducer() {

        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "");
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, "");
        properties.put(ProducerConfig.ACKS_CONFIG, "");
        properties.put(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, "");

        return new KafkaProducer<byte[],byte[]>(properties);

    }
}
