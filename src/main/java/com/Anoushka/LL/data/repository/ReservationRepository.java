package com.Anoushka.LL.data.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;

import com.Anoushka.LL.data.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation , Long>{
	Iterable<Reservation> findReservationByReservationDate(Date date);
}
