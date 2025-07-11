package com.nareshit.ticketbooking.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.ticketbooking.model.Ticket;
import java.util.*;

// here we are taking TicketDAO as interface because CrudRepository is an interface.
// if we take it as a class, we need to implement the code again / override the methods again.
@Repository
public interface TicketDAO extends CrudRepository<Ticket, Integer>{

}
