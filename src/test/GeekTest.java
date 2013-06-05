package test;

import static org.junit.Assert.assertEquals;

import java.GeekDAO;
import java.GeekService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeekTest{

	private GeekDAO mockDAO;
	private GeekService service;
	
	@Before
	public void prepareDAO(){
		mockDAO = Mockito.mock(GeekDAO.class);
		service = new GeekService(mockDAO);
	}
	
	@Test
	public void testTrouver() throws IOException {
		List<String> geeks = new ArrayList<>();
		geeks.add("geek 1");
		geeks.add("jean-claude");
		geeks.add("paul");
		geeks.add("pierre");
		Mockito.when(service.dao.lire()).thenReturn(geeks);
		
		List<String> attendue = Arrays.asList("geek 1");
		assertEquals(service.trouver("geek 1"), attendue);
	}
}