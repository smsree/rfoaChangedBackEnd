package com.RFOA.RFOA;

import org.junit.Before;
import org.junit.Test;
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

import com.RFOA.RFOA.Services.UserRegistrationService;
import com.RFOA.RFOA.controller.UserRegistrationController;
import com.RFOA.RFOA.model.UserRegistration;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.RFOA.RFOA.RfoaApplication.class,webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class RfoaApplicationTests2 {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserRegistrationService userRegService ;
	@Before
	public void setUp() {
		UserRegistrationController controller=new UserRegistrationController();
		controller.setUserRegistrationService(userRegService);
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
	}
	//public UserRegistration(String name, String email, String phoneNumber, String password)
	UserRegistration u=new UserRegistration("username","useremail","userphone","userPass");
	
	@Test
	public void getById()throws Exception{
		Mockito.when(userRegService.getUserById(Mockito.anyString())).thenReturn(u);
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/userRegistration/find/useremail").accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		String expected = "{'name':'username','email':'useremail','phoneNumber':'userphone','password':'userPass'}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
}
