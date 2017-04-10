package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Person {
	
	@Value("Eswar")
    private String name;

    public void setName(String name) {
		this.name = name;
	}

	public String getName() {
        return name;
    }
}
