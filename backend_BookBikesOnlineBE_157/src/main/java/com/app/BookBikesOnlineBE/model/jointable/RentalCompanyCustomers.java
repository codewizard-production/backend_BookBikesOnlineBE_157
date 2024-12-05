package com.app.BookBikesOnlineBE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "RentalCompanyCustomers")
@Table(schema = "\"bookbikesonlinebe\"", name = "\"RentalCompanyCustomers\"")
@Data
public class RentalCompanyCustomers{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CompanyID\"")
	private Integer companyID;

    
    @Column(name = "\"CustomerID\"")
    private Integer customerID;
 
}