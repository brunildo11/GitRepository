

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.meatApp.domain.User;
import br.com.meatApp.repositories.UserRepository;

	@SpringBootApplication
	public class meatApp2Application implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(meatApp2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		User user1 = new User(1, "tst1", "asdasa@asdsad.com", "111");
		User user2 = new User(2, "tst2", "bhsjka@bjsax.com", "222");
		userRepository.saveAll(Arrays.asList(user1, user2));
	}

}