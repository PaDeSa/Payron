package com.dsp.gl.finance;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Salary {

    double brutSalary;
    double netSalary;
    Primes primes;
    LocalDateTime paidDate;

}
