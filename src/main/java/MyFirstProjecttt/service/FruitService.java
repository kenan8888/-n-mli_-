package MyFirstProjecttt.service;

import MyFirstProjecttt.entity.Fruit;
import MyFirstProjecttt.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FruitService {
//    private final ModelMapper modelMapper;
    private final FruitRepository fruitRepository;

    public Fruit create(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Optional<Fruit> getFruit(Long id){
        return fruitRepository.findById(id);
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

    public Fruit update(Long id, Fruit updatedFruit) {
        Fruit existingFruit = fruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("elimizde yokkk"));

        existingFruit.setName(updatedFruit.getName());
        return fruitRepository.save(existingFruit);
    }

    public void delete(Long id){
        fruitRepository.deleteById(id);
    }

}
