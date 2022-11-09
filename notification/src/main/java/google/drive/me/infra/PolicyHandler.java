package google.drive.me.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import google.drive.me.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.me.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationHistoryRepository notificationHistoryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='VideoProcessed'")
    public void wheneverVideoProcessed_SendNotification(@Payload VideoProcessed videoProcessed){

        VideoProcessed event = videoProcessed;
        System.out.println("\n\n##### listener SendNotification : " + videoProcessed + "\n\n");


        

        // Sample Logic //
        NotificationHistory.sendNotification(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileUploaded'")
    public void wheneverFileUploaded_SendNotification(@Payload FileUploaded fileUploaded){

        FileUploaded event = fileUploaded;
        System.out.println("\n\n##### listener SendNotification : " + fileUploaded + "\n\n");


        

        // Sample Logic //
        NotificationHistory.sendNotification(event);
        

        

    }

}


