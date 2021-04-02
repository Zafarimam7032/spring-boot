package com.zafar.custom.finder.method;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zafar.coontroller.StudentVO;
import com.zafar.coontroller.UserRepository;

@Component
public class CustomfinderMethod {

	public void displayByName(UserRepository userRepository) {
		List<StudentVO> studName = userRepository.findByName("Zafar imam");
		System.out.println(studName);
	}

	public void displayAllKindOfMethod(UserRepository repository) {
		List<StudentVO> findByIdandName = repository.findByIdAndName(1, "Zafar imam");
		System.out.println(findByIdandName);
		System.out.println("=======================================");
		List<StudentVO> lessThan = repository.findByIdLessThan(5);
		Iterator<StudentVO> iterator = lessThan.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======================findAndEqual===============");
		List<StudentVO> lessThanequal = repository.findByIdLessThanEqual(5);
		Iterator<StudentVO> iterator1 = lessThanequal.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}
}
