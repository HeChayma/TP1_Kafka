package com.example.tp1_kafka.events;
import java.util.Date;
public record PageEvent(String name, String user, Date date , long duration ) {
}
