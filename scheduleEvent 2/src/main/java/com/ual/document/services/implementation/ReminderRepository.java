package com.ual.document.services.implementation;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.ual.document.Domain.Reminder;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder, String> {


    @Query(value = "select event from Reminder event where ID = :ID")
    public List<Reminder> getReminderById(@Param("ID") String ID);

    @Query(value = "select event from Reminder event where STATUS = :STATUS")
    public List<Reminder> getReminderBySTATUS(@Param("STATUS") String STATUS);

    @Query(value ="select event from Reminder event where :DATETIME > CURRENT_TIMESTAMP")
    public List<Reminder> getReminderByDate(@Param("DATETIME") Date DATETIME);


}
