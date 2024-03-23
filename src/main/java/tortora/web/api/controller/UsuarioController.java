package tortora.web.api.controller;

import org.springframework.web.bind.annotation.*;
import tortora.web.api.model.Usuario;
import tortora.web.api.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    private UserRepository repository;

    public UsuarioController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping
    public void createUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping
    public void updateUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

}
