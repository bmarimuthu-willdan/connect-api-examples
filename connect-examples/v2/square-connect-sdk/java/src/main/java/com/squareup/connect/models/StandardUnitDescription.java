/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.MeasurementUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains the name and abbreviation for standard measurement unit.
 */
@ApiModel(description = "Contains the name and abbreviation for standard measurement unit.")

public class StandardUnitDescription {
  @JsonProperty("unit")
  private MeasurementUnit unit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("abbreviation")
  private String abbreviation = null;

  public StandardUnitDescription unit(MeasurementUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Identifies the measurement unit being described.
   * @return unit
  **/
  @ApiModelProperty(value = "Identifies the measurement unit being described.")
  public MeasurementUnit getUnit() {
    return unit;
  }

  public void setUnit(MeasurementUnit unit) {
    this.unit = unit;
  }

  public StandardUnitDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of the measurement unit. For example, 'Pound'.
   * @return name
  **/
  @ApiModelProperty(value = "Display name of the measurement unit. For example, 'Pound'.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StandardUnitDescription abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * Abbreviation for the measurement unit. For example, 'lb'.
   * @return abbreviation
  **/
  @ApiModelProperty(value = "Abbreviation for the measurement unit. For example, 'lb'.")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardUnitDescription standardUnitDescription = (StandardUnitDescription) o;
    return Objects.equals(this.unit, standardUnitDescription.unit) &&
        Objects.equals(this.name, standardUnitDescription.name) &&
        Objects.equals(this.abbreviation, standardUnitDescription.abbreviation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, name, abbreviation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardUnitDescription {\n");

    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
