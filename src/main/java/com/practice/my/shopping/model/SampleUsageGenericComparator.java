package com.practice.my.shopping.model;

import com.practice.my.shopping.util.CommonUtil;
import com.practice.my.shopping.util.GenericComparator;
import org.apache.poi.util.SystemOutLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Quang on 02/26/2017.
 */
public class SampleUsageGenericComparator {

    public static void main(String[] args) {
        /*Person1*/
        Person p1 = new Person();
        p1.setFirstName("Vinh");
        p1.setLastName("Nguyen");

        City c1 = new City();
        c1.setAddressPostcode(1);
        c1.setCityName27("Can Tho");

        Country country1 = new Country();
        country1.setCountryName("Viet Nam");

        List<Address> addresses1 = new ArrayList<>();
        Address address1 = new Address();
        address1.setCity(c1);
        address1.setCountry(country1);
        addresses1.add(address1);
        p1.setAddresses(addresses1);

        /*Person2*/

        Person p2 = new Person();
        p2.setFirstName("Tri");
        p2.setLastName("Le");

        City c2 = new City();
        c2.setAddressPostcode(8);
        c2.setCityName27("Nha Trang");

        Country country2 = new Country();
        country2.setCountryName("Viet Nam");

        List<Address> addresses2 = new ArrayList<>();
        Address address2 = new Address();
        address2.setCity(c2);
        address2.setCountry(country2);
        addresses2.add(address2);
        p2.setAddresses(addresses2);

        /*Person 3*/
        Person p3 = new Person();
        p3.setFirstName("Diem");
        p3.setLastName("Nguyen");

        City c3 = new City();
        c3.setAddressPostcode(99);
        c3.setCityName27("Soc Trang");

        Country country3 = new Country();
        country3.setCountryName("Viet Nam");

        List<Address> addresses3 = new ArrayList<>();
        Address address3 = new Address();
        address3.setCity(c3);
        address3.setCountry(country3);
        addresses3.add(address3);
        p3.setAddresses(addresses3);

        /*Person4*/
        Person p4 = new Person();
        p4.setFirstName("Cuong");
        p4.setLastName("Phan");

        City c4 = new City();
        c4.setAddressPostcode(5);
        c4.setCityName27("Da Nang");

        Country country4 = new Country();
        country4.setCountryName("Viet Nam");

        List<Address> addresses4 = new ArrayList<>();
        Address address4 = new Address();
        address4.setCity(c4);
        address4.setCountry(country4);
        addresses4.add(address4);
        p4.setAddresses(addresses4);

        /*Person5*/

        Person p5 = new Person();
        p5.setFirstName("Danh");
        p5.setLastName("Mai");

        City c5 = new City();
        c5.setAddressPostcode(101);
        c5.setCityName27("An Giang");

        Country country5 = new Country();
        country5.setCountryName("Viet Nam");

        List<Address> addresses5 = new ArrayList<>();
        Address address5 = new Address();
        address5.setCity(c5);
        address5.setCountry(country5);

        addresses5.add(address5);

        p5.setAddresses(addresses5);

        /*Person 6*/

        Person p6 = new Person();
        p6.setFirstName("Van");
        p6.setLastName("Nguyen");

        City c6 = new City();
        c6.setAddressPostcode(10);
        c6.setCityName27("Dong Thap");

        Country country6 = new Country();
        country6.setCountryName("Viet Nam");

        List<Address> addresses6 = new ArrayList<>();
        Address address6 = new Address();
        address6.setCity(c6);
        address6.setCountry(country6);
        addresses6.add(address6);

        p6.setAddresses(addresses6);


        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        Comparator<Person> c = CommonUtil.comparatorOf(CommonUtil.getPersonSearchValue(
                PersonSearchParameters.NAME,
                SampleUsageGenericComparator::getPersonComparator),
                CommonUtil.Order.ASCENDING,
                CommonUtil.Nulls.LAST);

        Collections.sort(persons, c);
        displayPersons(persons);

    }

    private static Function<Person, Comparable> getPersonComparator(PersonSearchParameters parameters) {
        switch (parameters) {
            case NAME:
                return Person::getFirstName;
            case ADDRESS:
                return  person -> person.getAddresses().get(0).getAddressLines();
            case CITY:
                return  person -> person.getAddresses().get(0).getCity().getCityName27();
            default:
                return person -> person.getFirstName();
        }
    }

    public static void displayPersons(List<Person> persons) {
        for(Person p: persons) {
            System.out.println(p.getFirstName() + " " +
                    p.getLastName() + " " +
                    p.getAddresses().get(0).getCity().getCityName27() + " " +
                    p.getAddresses().get(0).getCountry().getCountryName());
        }
    }
}
