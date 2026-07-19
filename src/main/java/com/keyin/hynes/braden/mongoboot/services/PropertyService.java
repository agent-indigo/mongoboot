package com.keyin.hynes.braden.mongoboot.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keyin.hynes.braden.mongoboot.documents.Property;
import com.keyin.hynes.braden.mongoboot.interfaces.repositories.PropertyRepository;
@Service
public final class PropertyService {
  private final PropertyRepository propertyRepository;
  @Autowired
  public PropertyService(final PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }
  public List<Property> findAll() {
    return propertyRepository.findAll();
  }
}