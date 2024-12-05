package com.app.BookBikesOnlineBE.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.BookBikesOnlineBE.model.RoadsideAssistance;
import com.app.BookBikesOnlineBE.model.Verfication;
import com.app.BookBikesOnlineBE.model.Payment;
import com.app.BookBikesOnlineBE.model.ServiceCrew;
import com.app.BookBikesOnlineBE.model.Insurance;
import com.app.BookBikesOnlineBE.model.ExtendBooking;
import com.app.BookBikesOnlineBE.model.Booking;
import com.app.BookBikesOnlineBE.model.RentalCompany;
import com.app.BookBikesOnlineBE.model.ReturnBikeInspection;
import com.app.BookBikesOnlineBE.model.Customer;
import com.app.BookBikesOnlineBE.model.Bike;
import com.app.BookBikesOnlineBE.model.ReturnRentedBike;
import com.app.BookBikesOnlineBE.enums.IDTypes;
import com.app.BookBikesOnlineBE.converter.IDTypesConverter;
import com.app.BookBikesOnlineBE.converter.DurationConverter;
import com.app.BookBikesOnlineBE.converter.UUIDToByteConverter;
import com.app.BookBikesOnlineBE.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Customer")
@Table(name = "\"Customer\"", schema =  "\"bookbikesonlinebe\"")
@Data
                        
public class Customer {
	public Customer () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CustomerID\"", nullable = true )
  private Integer customerID;
	  
  @Column(name = "\"CustomerName\"", nullable = true )
  private String customerName;
  
	  
  @Column(name = "\"CustomerPhoneNumber\"", nullable = true )
  private Long customerPhoneNumber;
  
	  
  @Column(name = "\"CusrtomerAddress\"", nullable = true )
  private String cusrtomerAddress;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerBookings\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonlinebe\"")
private List<Booking> bookings = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerReturns\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonlinebe\"")
private List<ReturnRentedBike> returns = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerExtendRental\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonlinebe\"")
private List<ExtendBooking> extendRental = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Customer [" 
  + "CustomerID= " + customerID  + ", " 
  + "CustomerName= " + customerName  + ", " 
  + "CustomerPhoneNumber= " + customerPhoneNumber  + ", " 
  + "CusrtomerAddress= " + cusrtomerAddress 
 + "]";
	}
	
}