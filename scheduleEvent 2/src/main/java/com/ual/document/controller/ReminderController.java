package com.ual.document.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ual.document.Domain.Reminder;
import com.ual.document.services.ReminderService;


@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/reminders")
public class ReminderController {

    @Autowired
    public ReminderService reminderService;

    // get all the item details by path variable id and returns the response
    @GetMapping("/{id}")
    @ApiOperation(value = "Find a Reminder by id")
    public ResponseEntity<List<Reminder>> get(
            @PathVariable String id) {
        return ResponseEntity.ok(reminderService.findById(id));
    }

 /*   @GetMapping
    @ApiOperation(value = "Find a Reminder by DATE")
    public ResponseEntity<List<Reminder>> remindDate(@PathVariable Date DATETIME) {
        return ResponseEntity.ok(reminderService.remindByDate(DATETIME));
    }*/

    // get all the item details by path variable status and returns the response
    @GetMapping
    @ApiOperation(value = "Check your Reminders by status of reminders")
    public ResponseEntity<Iterable<Reminder>> list(
            @RequestParam(required = false) String STATUS) {
        return ResponseEntity.ok(reminderService.findAll(STATUS));
    }

    // update the newly added item by filling the request body and saves and returns the response
    @PostMapping
    @ApiOperation(value = "Add a Reminder")
    public ResponseEntity<Reminder> add(
            String s, @RequestBody Reminder reminder) {
        return ResponseEntity.ok(reminderService.save(reminder));
    }

    // update the item details and saves the updated
    @PutMapping("/{id}")
    @ApiOperation(value = "Update a Reminder")
    public ResponseEntity<Reminder> update(
            @PathVariable String id,
            @RequestBody Reminder reminder) {
        return ResponseEntity.ok(reminderService.update(id, reminder));
    }

    // delete the item data by id
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a Reminder")
    public void delete(
            @PathVariable String id) {
        reminderService.deleteById(id);

    }

}
















