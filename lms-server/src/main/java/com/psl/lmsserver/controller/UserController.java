package com.psl.lmsserver.controller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import com.psl.lmsserver.factory.ApplicationFactory;
import com.psl.lmsserver.filter.generic.Response;
import com.psl.lmsserver.models.User;
import com.psl.lmsserver.service.helper.userResponse;
import com.psl.lmsserver.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class UserController {
	private final Logger logger= LoggerFactory.getLogger(getClass());

	@Value("${secret.key}")
	private String secret_Key;
	@Autowired
	private userService userServiceobj;


	@GetMapping(path = "/getAllUser")
	public Response<Object> getAllUser() {
		List<userResponse> users = null;
		try {
			Instant start = Instant.now();
			users = userServiceobj.getAllUser();
			Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			logger.info("JourneyService.Controller : User add in at Execution time: " + timeElapsed.toNanos());
			return ApplicationFactory.getInstance().createResponse("The Users Found SuccessFully", HttpStatus.OK, users);
		} catch (Exception e) {
			return ApplicationFactory.getInstance().createResponse("The Users is Not Found SuccessFully!" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, users);

		}
	}


	@PostMapping(path = "/addUser")
	public Response<Object> addUser(@RequestBody Map<String,Object> user_details) {
		try {
			Instant start = Instant.now();
			User user = userServiceobj.addUser(user_details);
			Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			logger.info("JourneyService.Controller : User add in at Execution time: " + timeElapsed.toNanos());
			logger.info("The User Added SuccessFully!");
			return ApplicationFactory.getInstance().createResponse("The User is Added SuccessFully!", HttpStatus.OK, user);
		} catch (Exception e) {
			logger.error("The User is Not Added SuccessFully!" + e.getMessage());
			return ApplicationFactory.getInstance().createResponse("The User is Not Added SuccessFully!" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



	@GetMapping(path="/searchUserByKeyword/{keyword}")
	public Response<Object> searchUserByKeyword(@PathVariable String keyword){
		try {
			List<User> users=userServiceobj.searchByKeyWord(keyword);
			return ApplicationFactory.getInstance().createResponse("The Users Found Succesfuuly",HttpStatus.FOUND,users);
		}
		catch (Exception e){
			return ApplicationFactory.getInstance().createResponse(e.getMessage(),HttpStatus.NOT_FOUND,null);
		}
	}
}
