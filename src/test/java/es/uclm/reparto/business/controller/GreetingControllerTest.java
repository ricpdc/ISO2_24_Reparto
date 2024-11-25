package es.uclm.reparto.business.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import es.uclm.reparto.business.entity.Greeting;
import es.uclm.reparto.persistency.GreetingDAO;

@ExtendWith(MockitoExtension.class)
class GreetingControllerTest {
	@Mock
	private GreetingDAO greetingDAO;
	
	@Mock
    private Model model;
	
	
	@InjectMocks
	private GreetingController greetingController;
	
	Greeting greeting;

	@BeforeEach
	protected void setUp() throws Exception {
		 MockitoAnnotations.openMocks(this);
		 greeting = new Greeting();
		 greeting.setContent("hola");
		 greeting.setPerson("X");
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testGreetingForm() {
		String viewName = greetingController.greetingForm(model);
		assertEquals("greeting", viewName);
	}

	@Test
	public void testGreetingSubmit() {
		String viewName = greetingController.greetingSubmit(greeting, model);
		assertEquals("result", viewName);
	}

}
