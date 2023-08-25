package com.automobil.co.domain;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static volatile SingularAttribute<Car, String> carName;
	public static volatile SingularAttribute<Car, Integer> numberOfCar;
	public static volatile SingularAttribute<Car, String> carMadeBy;
	public static volatile SingularAttribute<Car, Long> id;

	public static final String CAR_NAME = "carName";
	public static final String NUMBER_OF_CAR = "numberOfCar";
	public static final String CAR_MADE_BY = "carMadeBy";
	public static final String ID = "id";

}

