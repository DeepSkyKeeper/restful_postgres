package spring_homework.restful_postgres.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import spring_homework.restful_postgres.models.Cat;
import spring_homework.restful_postgres.repository.CatRepo;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    final private CatRepo catRepo;
    final ObjectMapper objectMapper;

    @PostMapping("/add")
    public void addCat(@RequestBody Cat cat) {
        log.info("New row: " + catRepo.save(cat));
    }

    @SneakyThrows
    @GetMapping("/all")
    public List<Cat> getAll() {
        return catRepo.findAll();
    }

    @GetMapping("/{id}")
    public Cat getCat(@PathVariable("id") int id){
        return catRepo.findById(id).orElseThrow();
    }

    @DeleteMapping
    public void deleteCat(@RequestParam int id){
        catRepo.deleteById(id);
    }

    @PutMapping("/update")
    public String changeCat(@RequestBody Cat cat){
        if (!catRepo.existsById(cat.getId())){
            return "No such row";
        }
        return catRepo.save(cat).toString();
    }
}
