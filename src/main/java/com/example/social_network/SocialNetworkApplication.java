package com.example.social_network;

import com.example.social_network.model.*;
import com.example.social_network.service.SocialNetworkService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class SocialNetworkApplication {

	public static void main(String[] args) {
        SpringApplication.run(SocialNetworkApplication.class, args);
	}

	@Bean
	CommandLineRunner run(SocialNetworkService service) {
		return args -> {
			Blogger blogger0 = new Blogger("Almazik", PlatformType.FACEBOOK);


			Follower follower0 = new Follower("Ilias");
			service.showRoles(List.of(blogger0, follower0));

			Blogger blogger = service.createBlogger("Alex", PlatformType.INSTAGRAM);
			Post post = service.createPost(blogger, "Мой первый пост");

			Follower follower = service.createFollower("Maria");
			service.addComment(follower, post, "Очень круто 🔥");

			for (Post p : service.getAllPosts()) {
				System.out.println("Автор: " + p.getAuthor().getName());
				System.out.println("Текст: " + p.getText());

				for (Comment c : p.getComments()) {
					System.out.println("Комментарий от "
							+ c.getAuthor().getName()
							+ ": " + c.getText());
				}
			}
		};
	}



}
