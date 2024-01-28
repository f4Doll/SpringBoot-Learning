package com.learning.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@RestController
	public class NameService {

		@GetMapping("/api/v1/getName")
		@ResponseStatus(HttpStatus.OK)
		public String getName() {

			return "Getting a name but some string right now.";

		}

	}

	@RestController
	public class FoodOrder {

		@GetMapping("/api/v1/foodShopping")
		@ResponseStatus(HttpStatus.OK)
		public String getShoppingList() {

			return "The shopping list for next week needs snack for Ace.";

		}

	}
}
