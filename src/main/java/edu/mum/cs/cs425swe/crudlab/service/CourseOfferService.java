package edu.mum.cs.cs425swe.crudlab.service;

import edu.mum.cs.cs425swe.crudlab.model.CourseOffer;
import edu.mum.cs.cs425swe.crudlab.repository.ICourseOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("courseOfferService")
public class CourseOfferService implements ICourseOfferService{

    @Autowired
    private ICourseOfferRepository courseOfferRepository;

    @Override
    public List<CourseOffer> findAll() {
        return courseOfferRepository.findAll();
    }

    @Override
    public CourseOffer findById(Long id) {
        Optional<CourseOffer> result = courseOfferRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public CourseOffer save(CourseOffer courseOffer) {
        return courseOfferRepository.save(courseOffer);
    }

    @Override
    public void deleteById(Long id) {
        courseOfferRepository.deleteById(id);
    }
}
