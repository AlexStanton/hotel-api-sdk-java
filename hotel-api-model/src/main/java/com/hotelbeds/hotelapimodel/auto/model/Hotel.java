/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.hotelbeds.hotelapimodel.auto.convert.json.DateSerializer;
import com.hotelbeds.hotelapimodel.auto.convert.json.RateSerializer;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelbeds.hotelapimodel.auto.convert.json.DateDeserializer;
import java.lang.Short;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Hotel {

    @XmlAttribute
    @JsonProperty
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate checkOut;
    @XmlAttribute
    @JsonProperty
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDate checkIn;
    @XmlAttribute
    private Integer code;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String description;
    @XmlAttribute
    private String image;
    @XmlAttribute
    private Boolean preferential;
    @XmlAttribute
    private String categoryCode;
    @XmlAttribute
    private String categoryName;
    @XmlAttribute
    private String destinationCode;
    @XmlAttribute
    private String destinationName;
    @XmlAttribute
    private Short zoneCode;
    @XmlAttribute
    private String zoneName;
    @XmlAttribute
    private String latitude;
    @XmlAttribute
    private String longitude;
    @XmlAttribute
    private String giata;
    @XmlElementWrapper(name = "keywords")
    @XmlElement(name = "keywords")
    @JsonProperty("keywords")
    private List<Keyword> keywords;
    @XmlElementWrapper(name = "reviews")
    @XmlElement(name = "reviews")
    @JsonProperty("reviews")
    private List<Review> reviews;
    @XmlElementWrapper(name = "rooms")
    @XmlElement(name = "rooms")
    @JsonProperty("rooms")
    private List<Room> rooms;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal minRate;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal maxRate;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal totalSellingRate;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal totalNet;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal pendingAmount;
    @XmlAttribute
    private String currency;
    @XmlElementWrapper(name = "creditCards")
    @XmlElement(name = "creditCards")
    @JsonProperty("creditCards")
    private List<CreditCard> creditCards;
    @XmlElement
    private Supplier supplier;
    @XmlElement
    private String clientComments;
    @XmlAttribute
    private BigDecimal cancellationAmount;
    private Upselling upselling;


}
