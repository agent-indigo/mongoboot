package com.keyin.hynes.braden.mongoboot.abstracts;
import java.time.Instant;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import lombok.Data;
@Data
public abstract class DocumentBase {
  @Id
  private final ObjectId id = new ObjectId();
  @CreatedDate
  private final Instant createdAt = Instant.now();
  @LastModifiedDate
  private Instant updatedAt = Instant.now();
}