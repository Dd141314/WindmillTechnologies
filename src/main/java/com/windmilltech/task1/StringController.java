package com.windmilltech.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {
	
	@RequestMapping("/longestString")
	Optional<String> findLongestString(@RequestParam List<String> values){
		Optional<String> longestString = values.stream().max(Comparator.comparingInt(String :: length));
		return longestString;
	}
	
	@RequestMapping("/deleteString")
	List<String> deleteString(@RequestParam List<String> values){
		values.removeIf(s -> s.length() > 10);
		return values;
	}
	

}
