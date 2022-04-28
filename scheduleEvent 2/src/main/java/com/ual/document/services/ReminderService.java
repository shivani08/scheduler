package com.ual.document.services;

import com.ual.document.Domain.Reminder;
import com.ual.document.services.implementation.ReminderNotFoundException;
import com.ual.document.services.implementation.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class ReminderService {

    @Autowired
    ReminderRepository reminderRepository;

    // to retrieve all the details by id
    public List<Reminder> findById(String id) throws ReminderNotFoundException {
        List<Reminder> getId = new ArrayList<Reminder>();
        getId.addAll(reminderRepository.getReminderById(id));
        return getId;
    }

    // to retrieve details by the status of the event; either DONE or NOTDONE
    public Iterable<Reminder> findAll(String STATUS) throws ReminderNotFoundException {
        List<Reminder> getByStatus = new ArrayList<Reminder>();
        getByStatus.addAll(reminderRepository.getReminderBySTATUS(STATUS));
        return getByStatus;
    }

    // after update ,to save the updated details
    public Reminder save(Reminder reminder) {

        return reminderRepository.save(reminder);
    }

    // get by id
    public Reminder get(String id) {

        return reminderRepository.findById(id).get();
    }

    // any details can be updated, and are saved
    public Reminder update(String id, Reminder reminder) throws ReminderNotFoundException {
        return reminderRepository.save(reminder);
    }

    // to delete  items
    public void deleteById(String id) {
        reminderRepository.deleteById(id);
    }

   public List<Reminder> remindByDate(Date DATETIME) throws ReminderNotFoundException {
        System.out.println(remindByDate(DATETIME));
    return reminderRepository.getReminderByDate(DATETIME);

    }



}
