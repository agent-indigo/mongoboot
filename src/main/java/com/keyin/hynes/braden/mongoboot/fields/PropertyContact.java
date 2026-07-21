package com.keyin.hynes.braden.mongoboot.fields;
import com.mongodb.lang.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class PropertyContact {
  @NonNull
  private String name;
  @NonNull
  private String email;
  @NonNull
  private String phone;
}