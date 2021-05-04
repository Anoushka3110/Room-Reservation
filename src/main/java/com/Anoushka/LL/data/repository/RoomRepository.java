package com.Anoushka.LL.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Anoushka.LL.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room , Long>{
}
