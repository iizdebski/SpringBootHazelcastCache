package com.izdebski.SpringBootCache.dao;

import com.izdebski.SpringBootCache.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}