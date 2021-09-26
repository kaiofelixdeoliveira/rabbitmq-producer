package com.br.thekingoftech.mensageria;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStarterAmqpSenderApplication {

	@Value("${queue.order.name}")
    private String orderQueue;
 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterAmqpSenderApplication.class, args);
	}
	
	@Bean
    public Queue queue() {
        return new Queue(orderQueue, true);
    }

}
