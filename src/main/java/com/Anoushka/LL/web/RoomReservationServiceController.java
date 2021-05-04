package com.Anoushka.LL.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Anoushka.LL.business.domain.RoomReservation;
import com.Anoushka.LL.business.service.ReservationService;

@RestController
@RequestMapping("api/reservations")
public class RoomReservationServiceController {
	private final ReservationService reservationService;

	@Autowired
	public RoomReservationServiceController(ReservationService reservationService) {
		super();
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public List<RoomReservation> getRoomReservations(@RequestParam(value = "date", required = false) String dateString){
		Date date = DateUtils.createDateFromString(dateString);
		return this.reservationService.getRoomReservationsForDate(date);
	}
}
