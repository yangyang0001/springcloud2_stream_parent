package com.inspur;

import com.inspur.consumer.api.GetMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(GetMessageChannel.class)
public class Springcloud2StreamConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud2StreamConsumerApplication.class, args);
	}

}
