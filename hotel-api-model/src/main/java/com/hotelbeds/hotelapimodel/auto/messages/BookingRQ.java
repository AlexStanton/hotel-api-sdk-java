/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.messages;

/*
 * #%L
 * HotelAPI Model
 * %%
 * Copyright (C) 2015 - 2018 HOTELBEDS GROUP, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hotelbeds.hotelapimodel.auto.model.BookingRoom;
import com.hotelbeds.hotelapimodel.auto.model.Holder;
import com.hotelbeds.hotelapimodel.auto.model.PaymentData;
import com.hotelbeds.hotelapimodel.auto.model.Voucher;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "bookingRQ", namespace = "http://www.hotelbeds.com/schemas/messages")
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class BookingRQ extends AbstractGenericRequest {

    @XmlElement
    @NotNull
    @Valid
    private Holder holder;
    @XmlElementWrapper(name = "rooms")
    @XmlElement(name = "room")
    @NotNull
    @Size(min = 1, max = 2147483647, message = "{javax.validation.constraints.Size.message}")
    @Valid
    private List<BookingRoom> rooms;
    @Valid
    private PaymentData paymentData;
    @NotNull
    @Size(min = 1, max = 20, message = "{javax.validation.constraints.Size.message}")
    private String clientReference;
    @XmlElement
    @Size(min = 0, max = 2000, message = "{javax.validation.constraints.Size.message}")
    private String remark;
    private Voucher voucher;
    private Integer platform;


}
