package com.fazal.videocall;

import com.fazal.videocall.user.User;
import com.fazal.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Fazal")
							.email("fazal@mail.com")
							.password("pathan")
					.build());

			service.register(User.builder()
					.username("Arsh")
					.email("arsh@mail.com")
					.password("sayyed")
					.build());

		};
	}

}
