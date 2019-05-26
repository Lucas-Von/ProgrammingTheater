package hackathon.vivo.ProgrammingTheater;

import hackathon.vivo.ProgrammingTheater.Entity.Code;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import hackathon.vivo.ProgrammingTheater.Service.CodeService;
import hackathon.vivo.ProgrammingTheater.Service.GameService;
import hackathon.vivo.ProgrammingTheater.Service.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgrammingTheaterApplicationTests {

	@Autowired
	LoginService loginService;

	@Autowired
	CodeService codeService;

	@Autowired
	GameService gameService;

//	@Test
//	public void registerTest1(){
//		BasicResponse basicResponse = loginService.register("abc", "123456");
//		Assert.assertTrue(basicResponse.isSuccess());
//	}
//
//	@Test
//	public void registerTest2(){
//		BasicResponse basicResponse = loginService.register("abc", "123");
//		Assert.assertTrue(!basicResponse.isSuccess());
//	}
//
//	@Test
//	public void loginTest1(){
//		BasicResponse basicResponse = loginService.login("123", "asdfghjkl");
//		Assert.assertTrue(!basicResponse.isSuccess());
//	}
//
//	@Test
//	public void loginTest2(){
//		BasicResponse basicResponse = loginService.login("abc", "1234");
//		Assert.assertTrue(!basicResponse.isSuccess());
//	}
//
//	@Test
//	public void loginTest3(){
//		BasicResponse basicResponse = loginService.login("abc", "123456");
//		Assert.assertTrue(basicResponse.isSuccess());
//	}
//
//	@Test
//	public void setCodeTest1(){
//		BasicResponse basicResponse = codeService.setCode("123", "123's code.");
//		Assert.assertTrue(!basicResponse.isSuccess());
//	}
//
//	@Test
//	public void setCodeTest2(){
//		BasicResponse basicResponse = codeService.setCode("abc", "abc's code.");
//		Assert.assertTrue(basicResponse.isSuccess());
//	}
//
//	@Test
//	public void getCodeTest1(){
//		BasicResponse basicResponse = codeService.getCode("123");
//		Assert.assertTrue(!basicResponse.isSuccess());
//	}
//
//	@Test
//	public void getCodeTest2(){
//		BasicResponse basicResponse = codeService.getCode("abc");
////		System.out.println(basicResponse.getMessage());
//		Assert.assertEquals("abc's code.", basicResponse.getMessage());
//	}

	@Test
	public void startTest1(){
		loginService.register("1", "1");
		loginService.register("2", "2");
		loginService.register("3", "3");
		loginService.register("4", "4");
		loginService.register("5", "5");
		codeService.setCode("1", "1");
		codeService.setCode("2", "2");
		codeService.setCode("3", "3");
		codeService.setCode("4", "4");
		codeService.setCode("5", "5");
		BasicResponse basicResponse = gameService.start(5);
		System.out.println(basicResponse.isSuccess());
		System.out.println(basicResponse.getMessage());
		Code[] codes = basicResponse.getCodes();
		if (codes == null|| codes.length == 0){
			System.out.println("空数组");
			return;
		}
		for (Code c : codes){
//			System.out.println(c.getUserId() + "___" + c.getContent());
		}
//		Assert.assertTrue(!basicResponse.isSuccess());
	}
}
