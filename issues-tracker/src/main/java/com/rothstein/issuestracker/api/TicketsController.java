package com.rothstein.issuestracker.api;

import com.rothstein.issuestracker.dao.TicketDao;
import com.rothstein.issuestracker.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/tickets")
public class TicketsController {
    @Autowired
    private TicketDao ticketDao;

    @GetMapping
    public List<Ticket> list() {
        return ticketDao.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Ticket ticket) {
        ticketDao.save(ticket);
    }

    @GetMapping("/{id}")
    public Ticket get(@PathVariable("id") long id) {
        return ticketDao.getOne(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTicket(@RequestBody Long id) {
        ticketDao.deleteById(id);
    }
}
