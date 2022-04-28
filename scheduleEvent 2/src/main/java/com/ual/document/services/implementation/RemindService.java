package com.ual.document.services.implementation;

import com.ual.document.Domain.Reminder;
import com.ual.document.services.ReminderService;

import java.util.Optional;

public class RemindService extends ReminderService {
    ReminderRepository reminderRepository;

    @Override
    public Reminder update(String id, Reminder reminder) throws ReminderNotFoundException {
        Optional<Reminder> reminderOptional = reminderRepository.findById(id);
        if (!reminderOptional.isPresent()) {
            throw new ReminderNotFoundException();
        }
        reminder.setID(id);
        return save(reminder);
    }
}
