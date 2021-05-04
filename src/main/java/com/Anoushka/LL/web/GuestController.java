package com.Anoushka.LL.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Anoushka.LL.business.service.GuestService;
import com.Anoushka.LL.data.entity.Guest;


@Controller
@RequestMapping("/guests")
public class GuestController {
	private final GuestService guestService;

	@Autowired
	public GuestController(GuestService guestService) {
		super();
		this.guestService = guestService;
	}
	
	@GetMapping
	public String getReservations(Model model) {
		List<Guest> guests = this.guestService.getAllGuests();
		model.addAttribute("guests" , guests);
		return "guests";
	}
}
