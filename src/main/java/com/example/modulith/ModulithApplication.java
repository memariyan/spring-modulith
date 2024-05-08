package com.example.modulith;

import com.example.modulith.payment.spi.dto.PaymentDTO;
import com.example.modulith.payment.spi.PaymentSPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Date;

@EnableAsync
@SpringBootApplication
public class ModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModulithApplication.class, args).getBean(PaymentSPI.class)
				.pay(new PaymentDTO("1234", new Date(), 10000L));
	}

}
