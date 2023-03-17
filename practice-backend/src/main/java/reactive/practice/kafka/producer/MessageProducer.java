package reactive.practice.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Kafka Producer Controller
 * */
@RequestMapping("kafka/message")
@RestController
@RequiredArgsConstructor
public class MessageProducer {

    // inject Template of definition in Spring application.yaml
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static String TOPIC_NAME = "dev-topic";

    /**
     * Kafka Producer
     * send to message of kafka
     * @reutrn
     * */

    @GetMapping("producer")
    public String sendMessage(){
        String messageData = "kafka message";
        kafkaTemplate.send(TOPIC_NAME, messageData);
        return "success.";
    }


}
