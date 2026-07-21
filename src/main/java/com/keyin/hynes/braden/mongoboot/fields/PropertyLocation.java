package com.keyin.hynes.braden.mongoboot.fields;
import com.mongodb.lang.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class PropertyLocation {
  @NonNull
  private String street;
  @NonNull
  private String city;
  @NonNull
  private String state;
  @NonNull
  private String zipcode;
}