package creative.bookrenr.service;

import creative.bookrenr.domain.User;
import creative.bookrenr.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService{

    private final UserRepository userRepository;


    // 회원 가입
    public void create(User user) {
        userRepository.save(user);
    }

    //회원 탈퇴
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    // 회원 정보 수정
    public User update() {
        return null;
    }
}
