package deyi.com.revise.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.support.Acknowledgment;

import java.util.List;

public class KafkaLearning {
    public static void main(String[] args) {

    }

    public void testKafka (List<ConsumerRecord<String, String>> recordList, Acknowledgment ack) {
        for (ConsumerRecord<String, String> record :
                recordList) {
            String message = record.value();
        }

    }
}
