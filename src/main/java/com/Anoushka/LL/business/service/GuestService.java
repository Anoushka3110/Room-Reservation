package com.Anoushka.LL.business.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anoushka.LL.data.entity.Guest;
import com.Anoushka.LL.data.repository.GuestRepository;

@Service
public class GuestService {
	private final GuestRepository guestRepository;

	@Autowired
	public GuestService(GuestRepository guestRepository) {
		super();
		this.guestRepository = guestRepository;
	}
	
	public List<Guest> getAllGuests(){
		List<Guest> guests = (List<Guest>) guestRepository.findAll();
		guests.sort(new Comparator<Guest>() {
			@Override
			public int compare(Guest g1 , Guest g2) {
				if(g1.getLastName() == g2.getLastName()) return g1.getFirstName().compareTo(g2.getFirstName());
				return g1.getLastName().compareTo(g2.getLastName());
			}
		});
		return guests;
	}
}
