package com.history.backend.models.types;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
	private String name;
	
	private String description;

	private String flagImageId;

	private List<String> todayLocationDetailIds;
}
