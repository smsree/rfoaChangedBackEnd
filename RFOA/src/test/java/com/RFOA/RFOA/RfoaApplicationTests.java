package com.RFOA.RFOA;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.RFOA.RFOA.Services.UserService;
import com.RFOA.RFOA.controller.UserController;
import com.RFOA.RFOA.model.User;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.RFOA.RFOA.RfoaApplication.class,webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class RfoaApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	@Before
	public void setUp() {
		UserController controller=new UserController();
		controller.setUserService(userService);
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
	}
	//public User(String primaryKey, String email, String name, String street, String city, String pincode,
	//String phoneNumber) {
	User u=new User("1","email@email.com","userTest","userStreet","userCity","userPincode","userPhone");
	@Test
	public void getUserById() throws Exception {
		Mockito.when(userService.getUserById(Mockito.anyString())).thenReturn(u);
		RequestBuilder rquestBuilder = MockMvcRequestBuilders.get("/user/1").accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(rquestBuilder).andReturn();
		System.out.println(result.getResponse());
		String expected = "{'primaryKey':'1','email':'email@email.com','name':'userTest','street':'userStreet','city':'userCity','pincode':'userPincode','phoneNumber':'userPhone'}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
	
	

}
