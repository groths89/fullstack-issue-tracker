package com.rothstein.issuestracker.dao;

import com.rothstein.issuestracker.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Long> {
}
