package com.izdebski.SpringBootSimpleCacheAutoConfigurable.dao;

import com.izdebski.SpringBootSimpleCacheAutoConfigurable.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}