package br.com.meatApp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.meatApp.domain.MenuItem;
import br.com.meatApp.domain.Restaurant;
import br.com.meatApp.domain.User;
import br.com.meatApp.repositories.MenuItemRepository;
import br.com.meatApp.repositories.RestaurantRepository;
import br.com.meatApp.repositories.UserRepository;

@SpringBootApplication
public class MeatAppApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private MenuItemRepository menuItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeatAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		User user1 = new User(1, "tst1", "asdasa@asdsad.com", "111");
		User user2 = new User(2, "tst2", "bhsjka@bjsax.com", "222");
		userRepository.saveAll(Arrays.asList(user1, user2));
		
		Restaurant restaurant = new Restaurant(1, "Restaurante", "pingando de oleo", "Só pra alimento", 
				6.9, "ExampleImage", "19:00 às 23:50", "É ué");
		restaurantRepository.saveAll(Arrays.asList(restaurant));
		
		MenuItem menuItem = new MenuItem(1, "Pão com ovo", "ovo", 5.0, "ImageExample", restaurant);
		menuItemRepository.saveAll(Arrays.asList(menuItem));
	}
	
	

}
