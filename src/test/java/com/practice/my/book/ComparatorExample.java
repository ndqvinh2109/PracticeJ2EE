package com.practice.my.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ComparatorExample {

	public static void main(String[] args) {
		ComparatorExample example = new ComparatorExample();
		List<Car> cars = example.preparedCars();
		List<Car> sortedCars = example.sortCars(cars);
		
		sortedCars.stream().forEach(item -> System.out.println(item.getName()));
	}
	
	public List<Car> preparedCars() {
		List<Car> cars = new ArrayList<>();
		Car car = new Car("Vinh", 10);
		cars.add(car);
		car = new Car("Bao", 10);
		cars.add(car);
		car = new Car("Tuan", 10);
		cars.add(car);
		car = new Car("Dat", 10);
		cars.add(car);
		return cars;
	}
	
	public List<Car> sortCars(List<Car> cars) {
		Collections.sort(cars, new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.getName().compareTo(car2.getName());
			}
		});
		
		return cars;
	}
	
	
	@Test
	public void should_sortListCarCorrectly() {
		List<Car> cars = preparedCars();
		List<Car> sortedCars = sortCars(cars);
		assertThat(sortedCars.get(0), hasProperty("name", is("Bao")));
		assertThat(sortedCars.get(1), hasProperty("name", is("Dat")));
		assertThat(sortedCars.get(2), hasProperty("name", is("Tuan")));
		assertThat(sortedCars.get(3), hasProperty("name", is("Vinh")));
	}
	
	
}
