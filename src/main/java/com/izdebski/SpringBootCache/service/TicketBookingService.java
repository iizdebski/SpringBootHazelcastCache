package com.izdebski.SpringBootCache.service;

import com.izdebski.SpringBootCache.dao.TicketBookingDao;
import com.izdebski.SpringBootCache.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    @Cacheable(value="ticketsCache",key="#ticketId")
    public Ticket getTicketById(Integer ticketId) {
        return ticketBookingDao.findOne(ticketId);
    }

    @CacheEvict(value="ticketsCache",key="#ticketId")
    public void deleteTicket(Integer ticketId) {
        ticketBookingDao.delete(ticketId);
    }

    @CachePut(value="ticketsCache",key="#ticketId")
    public Ticket updateTicket(Integer ticketId, String newEmail) {
        Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
        ticketFromDb.setEmail(newEmail);
        Ticket upatedTicket = ticketBookingDao.save(ticketFromDb);
        return upatedTicket;
    }
}