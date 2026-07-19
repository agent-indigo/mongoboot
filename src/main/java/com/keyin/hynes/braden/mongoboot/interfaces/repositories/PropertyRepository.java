package com.keyin.hynes.braden.mongoboot.interfaces.repositories;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.keyin.hynes.braden.mongoboot.documents.Property;
@Repository
public interface PropertyRepository extends MongoRepository<Property, ObjectId> {}