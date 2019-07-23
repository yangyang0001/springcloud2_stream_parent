package com.inspur;

import com.inspur.producer.api.SendMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessageChannel.class)
public class Springcloud2StreamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud2StreamProducerApplication.class, args);
	}

}
