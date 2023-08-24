package com.automobil.co.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Car.
 */
@Entity
@Table(name = "car")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "number_of_car")
    private Integer numberOfCar;

    @Column(name = "car_made_by")
    private String carMadeBy;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Car id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarName() {
        return this.carName;
    }

    public Car carName(String carName) {
        this.setCarName(carName);
        return this;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getNumberOfCar() {
        return this.numberOfCar;
    }

    public Car numberOfCar(Integer numberOfCar) {
        this.setNumberOfCar(numberOfCar);
        return this;
    }

    public void setNumberOfCar(Integer numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public String getCarMadeBy() {
        return this.carMadeBy;
    }

    public Car carMadeBy(String carMadeBy) {
        this.setCarMadeBy(carMadeBy);
        return this;
    }

    public void setCarMadeBy(String carMadeBy) {
        this.carMadeBy = carMadeBy;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        return id != null && id.equals(((Car) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Car{" +
            "id=" + getId() +
            ", carName='" + getCarName() + "'" +
            ", numberOfCar=" + getNumberOfCar() +
            ", carMadeBy='" + getCarMadeBy() + "'" +
            "}";
    }
}
