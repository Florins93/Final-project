package com.sci.finalproject.demo.service;

import com.sci.finalproject.demo.model.Location;
import com.sci.finalproject.demo.model.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public Iterable<Location> getAllLocations(){
        return locationRepository.findAll();
    }

    public Location saveLocation(Location location){
        return locationRepository.save(location);

   }
//    public void savePhoto(MultipartFile imageFile) throws Exception{
//        String folder=System.getProperty("user.dir")+ "/src/main/resources/static/images";
//        byte[] bytes=imageFile.getBytes();
//        Path path= Paths.get(folder, imageFile.getOriginalFilename());
//        Files.write(path,bytes);}

    public Optional<Location> getLocation(Integer id){
        return locationRepository.findById(id);
    }

}