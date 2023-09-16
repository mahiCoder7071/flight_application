package com.flight_Application.payload;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntityDto {
 private long id;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
}
