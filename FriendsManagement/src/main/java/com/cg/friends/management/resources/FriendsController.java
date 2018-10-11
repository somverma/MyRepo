package com.cg.friends.management.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cg.friends.management.service.FriendsService;

@Controller
public class FriendsController {

	@Autowired
	private FriendsService friendsService;

	@RequestMapping(value = "//friendmgt/list", method = RequestMethod.GET)
	public ResponseEntity<List> getFriendsDetails() {

		List friendsDetails = friendsService.getFriends();
		return new ResponseEntity<>(friendsDetails, HttpStatus.OK);
	}
}
