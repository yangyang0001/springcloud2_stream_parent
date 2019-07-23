package com.inspur.consumer.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * User: YANG
 * Date: 2019/7/23-13:00
 * Description: No Description
 */
@Component
public class GetMessageListener {

	@Value("${server.port}")
	private String serverPort;

	@StreamListener("my_message_channel")
	public void listener(String message) {
		System.out.println("消费者获取生产者发送的消息:" + message + ",端口号:" + serverPort);
	}


}
