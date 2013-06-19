package test;


import java.GeekDAO;
import java.GeekService;

import org.junit.Before;
import org.mockito.Mockito;

public class GeekTest{

	private GeekDAO mockDAO;
	@SuppressWarnings("unused")
	private GeekService service;
	
	@Before
	public void prepareDAO(){
		mockDAO = Mockito.mock(GeekDAO.class);
		service = new GeekService(mockDAO);
	}
	
	/*
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
	*/
}