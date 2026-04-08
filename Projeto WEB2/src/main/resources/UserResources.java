package br.edu.ifspcjo.ads.web2.ifitness.resource;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.ifitness.domain.model.User;

@RestController
public class UserResources {
	
	@GetMapping("/users")
	public List<User> list(){
		User user1 = new User();
		user1.setId(1L);
		user1.setName("Pedro Euzébio");
		user1.setEmail("pedro.euzebio@aluno.ifsp.edu.br");
		user1.setPassword("1234");
		user1.setBirthDate(LocalDate.of(2006, 03, 08));
		user1.getActive(true);
		User user2 = new User();
		user2.setId(2L);
		user2.setName("Amanda Sugano");
		user2.setEmail("amanda@gmail.com");
		user2.setPassword("5678");
		user2.setBirthDate(LocalDate.of(2006, 02, 08));
		user2.setActive(true);
	}

}
