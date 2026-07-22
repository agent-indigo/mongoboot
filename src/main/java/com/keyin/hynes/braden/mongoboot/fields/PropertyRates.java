package com.keyin.hynes.braden.mongoboot.fields;
import com.mongodb.lang.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public final class PropertyRates {
  @Nullable
  private Integer nightly;
  @Nullable
  private Integer weekly;
  @Nullable
  private Integer monthly;
}