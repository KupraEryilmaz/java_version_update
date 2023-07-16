package com.cydeo.car;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }
}
