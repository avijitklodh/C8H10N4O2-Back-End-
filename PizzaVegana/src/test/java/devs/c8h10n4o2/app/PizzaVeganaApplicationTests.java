package devs.c8h10n4o2.app;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import devs.c8h10n4o2.repositories.ClientRepository;
import devs.c8h10n4o2.repositories.PizzaRepository;
import devs.c8h10n4o2.repositories.TicketRepository;
import devs.c8h10n4o2.repositories.UserRoleRepository;

@SpringBootTest
@ContextConfiguration(classes = devs.c8h10n4o2.app.PizzaVeganaApplication.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PizzaVeganaApplicationTests {

	@Autowired
	UserRoleRepository ur;
	
	@Autowired
	TicketRepository tr;
	
	@Autowired
	ClientRepository cr;
	
	@Autowired
	PizzaRepository pr;



	
}
