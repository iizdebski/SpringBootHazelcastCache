package com.izdebski.SpringBootHazelcastCache.dao;

import com.izdebski.SpringBootHazelcastCache.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}