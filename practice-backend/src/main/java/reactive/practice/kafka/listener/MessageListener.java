package reactive.practice.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    /**
     * Kafka Listener
     * Read Message of Kafka
     *
     * Topic : Logical Partition of Message Data
     * Offset : identity Number of Kafka
     *
     * <Log Example>
     * ### record: ConsumerRecord(topic = dev-topic, partition = 0, leaderEpoch = 0, offset = 1, CreateTime = 1649170434791, serialized key size = -1, serialized value size = 13, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = kafka message)
     * ### topic: dev-topic, value: kafka message, offset: 1
     * @param record
     *
     * */
    @KafkaListener(topics = "dev-topic")
    public void messageListener(ConsumerRecord<String,String> record, Acknowledgment ack){
        log.info("Receive Message: {} ", record.toString());
        log.info("### topic: " + record.topic() + ", value: " + record.value() + ", offset: " + record.offset());

        ack.acknowledge();
    }
}
