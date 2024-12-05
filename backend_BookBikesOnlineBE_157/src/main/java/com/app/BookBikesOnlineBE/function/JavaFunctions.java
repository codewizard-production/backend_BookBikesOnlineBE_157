package com.app.BookBikesOnlineBE.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.BookBikesOnlineBE.repository.VerficationRepository;
import com.app.BookBikesOnlineBE.repository.PaymentRepository;
import com.app.BookBikesOnlineBE.repository.CustomerRepository;
import com.app.BookBikesOnlineBE.repository.InsuranceRepository;
import com.app.BookBikesOnlineBE.repository.ServiceCrewRepository;
import com.app.BookBikesOnlineBE.repository.ReturnRentedBikeRepository;
import com.app.BookBikesOnlineBE.repository.BookingRepository;
import com.app.BookBikesOnlineBE.repository.RoadsideAssistanceRepository;
import com.app.BookBikesOnlineBE.repository.ExtendBookingRepository;
import com.app.BookBikesOnlineBE.repository.RentalCompanyRepository;
import com.app.BookBikesOnlineBE.repository.ReturnBikeInspectionRepository;
import com.app.BookBikesOnlineBE.repository.BikeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
