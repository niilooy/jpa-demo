package com.niilooy.jpa;

import com.github.javafaker.Faker;
import com.niilooy.jpa.model.Author;
import com.niilooy.jpa.model.Video;
import com.niilooy.jpa.repository.AuthorRepository;
import com.niilooy.jpa.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository) {
		//System.out.println(authorRepository.findAllByFirstName("Patrick"));
		return args -> {
////			Create fake data
//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(16, 80))
//						.email(faker.name().username() + "@gmail.com")
//						.build();
//				authorRepository.save(author);
//			}
//			var video = Video.builder()
//					.name("abc")
//					.length(6)
//					.build();
//			videoRepository.save(video);
		};
	}

}
