package com.unla.grupo7;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;

public class TestTime {
    private final long segs = 10000;
    @Scheduled(fixedRate = segs)
    public void queEsEstoo(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA || " + LocalTime.now());
        //con esto muestro la hora c:
    }
    public static void main(String[] args){
		TestTime testTime = new TestTime();
		testTime.queEsEstoo();
	}
}
