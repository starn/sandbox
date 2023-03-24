package fr.starn.sandbox;

import fr.starn.sandbox.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class StarnApplication {

	@Autowired
	TestInjected testInjectedByName2;

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(StarnApplication.class, args);
	}

	@GetMapping("/users")
	public List<User> getUsers(@RequestParam(value = "myName", defaultValue = "World") String name) {
		System.out.println(testInjectedByName2);
		List<User> users = userService.getUsers();
		List<User> result = users.stream().sorted(Comparator.comparing((User us1) -> us1.getAge())).filter((User u) -> u.getAge() <50).collect(Collectors.toList());

		return result;
	}

}
