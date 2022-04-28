package com.ual.document.controller;

import com.ual.document.Domain.Reminder;
import com.ual.document.Domain.ReminderStatus;
import com.ual.document.services.ReminderService;
//import javafx.beans.value.*;
import org.junit.Before;

import static com.ual.document.Domain.ReminderStatus.DONE;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//import org.springframework.test.web.servlet.ResultMatcher;

import org.springframework.test.web.servlet.ResultMatcher;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectWriter;
import org.testcontainers.shaded.com.github.dockerjava.core.MediaType;

//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import static javafx.beans.binding.Bindings.when;

//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(value = ReminderController.class)

class ReminderControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    ReminderService reminderService;


    private ObjectWriter jonObjectWriter;

        @Before
        public void setup () {
            jonObjectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        }

//       @Test
   /*     public void givenReminders_whenGet_thenReturnJsonArray() throws Exception {

            Reminder reminder = new Reminder();
            reminder.setID("2");
            reminder.setNAME("Test");
            reminder.setDESCRIPTION("testing to create event");
         //   reminder.setDATETIME("2022-05-23 12:00:00");
            reminder.setSTATUS(String.valueOf(ReminderStatus.NOTDONE));
           List<Reminder> list = new ArrayList<Reminder>();
            //List<Reminder> all = Arrays.asList(reminder);


         //   when (reminderService.findAll(DONE))).thenReturn(list);

            mvc.perform(get("/api/reminders/2")
                            .contentType(String.valueOf(MediaType.APPLICATION_JSON)))
                    .andExpect(status().isOk());
                 //   .andExpect((ResultMatcher) jsonPath("$[0].name").value(reminder.getID()));

        }



       @Test
        public void givenReminders_whenGetWithId_thenReturnJson() throws Exception {

            Reminder reminder = new Reminder();
            reminder.setID("25");
            reminder.setNAME("Test");
            reminder.setSTATUS(String.valueOf(ReminderStatus.NOTDONE));

           // when(reminderService.findById(reminder.getID())).then(reminder);

            mvc.perform(get("/api/reminders/1"))
                    .andExpect(status().isOk());
                   // .andExpect((ResultMatcher) jsonPath("$.name").value(reminder.getID()));

        }

   /*     @Test
        public void givenReminders_whenAdd_thenReturnJson() throws Exception {

            Reminder reminder = new Reminder();
            reminder.setID("2");
            reminder.setNAME("Test");
            reminder.setSTATUS(String.valueOf(ReminderStatus.NOTDONE));

         //   when(reminderService.findById(reminder.getID())).thenReturn((List<Reminder>) reminder);

            String requestJson=jonObjectWriter.writeValueAsString(reminder);

            mvc.perform(post("/api/reminders/2")
                            .content(requestJson)
                            .contentType(String.valueOf(MediaType.APPLICATION_JSON)))
                    .andExpect(status().isOk());
                 //   .andExpect((ResultMatcher) jsonPath("$.name").value(reminder.getID()));

        }

    /*  @Test
        public void givenReminders_whenPutWithId_thenReturnOk() throws Exception {
         /*  SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            Date setDATETIME = new Date();
            String eventDate = formatter.format(setDATETIME);


            Reminder reminder = new Reminder();
            reminder.setID("100");
            reminder.setNAME("Test");
            reminder.setDESCRIPTION("testing to create event");
           // reminder.setDATETIME("eventDate");
            reminder.setSTATUS(String.valueOf(ReminderStatus.NOTDONE));

           when(reminderService.findById(reminder.getID())).thenReturn((List<Reminder>) reminder);

            String requestJson=jonObjectWriter.writeValueAsString(reminder);

            mvc.perform(put("/api/reminders/")
                            .content(requestJson)
                            .contentType(String.valueOf(MediaType.APPLICATION_JSON)))
                    .andExpect(status().isOk());

        }
        */

        @Test
        public void givenReminders_whenDeleteWithId_thenReturnOk() throws Exception {
            mvc.perform(delete("/api/reminders/1")
                            .contentType(String.valueOf(MediaType.APPLICATION_JSON)))
                    .andExpect(status().isOk());
        }
    }