package MyFirstProjecttt.controller;

import MyFirstProjecttt.entity.Fruit;
import MyFirstProjecttt.service.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/fruit")
@RequiredArgsConstructor
public class FruitController {
    private final FruitService fruitService;         // task:post delete get getbyid update getAll methodlarini elave et

    @PostMapping("/create")
    public Fruit createFruit(@RequestBody Fruit fruit) {
        return fruitService.create(fruit);
    }

    @GetMapping("/{id}")
    public Optional<Fruit> getById(@PathVariable Long id){
        return fruitService.getFruit(id);
    }

//    @GetMapping("/all")
//    public List<Fruit> getAllFruits(){
//        return fruitService.getAll();
//    }

    @PutMapping("/{id}")
    public Fruit updateFruit(@PathVariable Long id,@RequestBody Fruit updatedFruit){
        return fruitService.update(id,updatedFruit);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable Long id){
        fruitService.delete(id);
    }

}
