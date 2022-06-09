package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.rent.Rent;
import creative.bookrenr.business.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class RentService{
    private final RentRepository rentRepository;

    public void create(Rent rent) {
        rentRepository.save(rent);
    }

    public void deleteById(Long id) {
        rentRepository.deleteById(id);
    }

    public Rent update() {
        return null;
    }
}
