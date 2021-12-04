package com.workshop.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

}
