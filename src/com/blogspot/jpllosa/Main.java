package com.blogspot.jpllosa;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		System.out.println("Starting...");
		
		File file = new File("data/f_vtm2_3301123.xml");
		JAXBContext jcVtm = JAXBContext.newInstance(VIRTUALTHERAPEUTICMOIETIES.class);
		Unmarshaller unmarshaller = jcVtm.createUnmarshaller();
		VIRTUALTHERAPEUTICMOIETIES vtms = (VIRTUALTHERAPEUTICMOIETIES) unmarshaller.unmarshal(file);
		
		int size = vtms.getVTM().size();
        if (size > 0) {
            System.out.printf("Virtual Therapeutic Moieties: %,d \r\n", size);
            for (int i = 0; i < 5; i++) {
            	System.out.println(vtms.getVTM().get(i).getNM());
            }
        }
	}
}
