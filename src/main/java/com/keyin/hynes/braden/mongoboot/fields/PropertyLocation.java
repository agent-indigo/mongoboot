package com.keyin.hynes.braden.mongoboot.fields;
import lombok.Data;
@Data
public final class PropertyLocation {
  private String street;
  private String city;
  private String state;
  private String zipcode;
}